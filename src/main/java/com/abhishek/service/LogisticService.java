package com.abhishek.service;

import com.abhishek.model.Logistic;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

public interface LogisticService {
    String save(Logistic logistic);

    ResponseEntity<Logistic> getList(String shipperId);

    Optional<Logistic> getById(Integer id);

    Logistic update(Integer loadId, Logistic logistic);

    String delete(Integer loadId);
}
