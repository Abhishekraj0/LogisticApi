package com.abhishek.service.impl;

import com.abhishek.Repo.LogisticRepo;
import com.abhishek.model.Logistic;
import com.abhishek.service.LogisticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LogisticServiceImpl implements LogisticService {
    @Autowired
    private LogisticRepo logisticRepo;

    @Override
    public String save(Logistic logistic) {
        logisticRepo.save(logistic);
        return "loads details added successfully";
    }

    @Override
    public ResponseEntity<Logistic> getList(String shipperId) {
        return ResponseEntity.ok(logisticRepo.findByShipperId(shipperId));
    }

    @Override
    public Optional<Logistic> getById(Integer id) {
        return logisticRepo.findById(id);
    }

    @Override
    public Logistic update(Integer loadId, Logistic logistic) {
        Logistic logistic1 = logisticRepo.getById(loadId);
        logistic1.setLoadingPoint(logistic.getLoadingPoint());
        logistic1.setUnloadingPoint(logistic.getUnloadingPoint());
        logistic1.setProductType(logistic.getProductType());
        logistic1.setTruckType(logistic.getTruckType());
        logistic1.setNoOfTrucks(logistic.getNoOfTrucks());
        logistic1.setWeight(logistic.getWeight());
        logistic1.setComment(logistic.getComment());
        logistic1.setShipperId(logistic.getShipperId());
        logistic1.setDate(logistic.getDate());
        return logisticRepo.save(logistic1);
    }

    @Override
    public String delete(Integer loadId) {
        logisticRepo.deleteById(loadId);
        return "loads details deleted successfully";
    }
}
