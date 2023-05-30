package com.abhishek.controller;

import com.abhishek.model.Logistic;
import com.abhishek.service.LogisticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/")
public class LogisticController {
    @Autowired
    private LogisticService logisticService;

    @PostMapping("/load")
    public String createLogistic(@RequestBody Logistic logistic){
        return logisticService.save(logistic);
    }

    @GetMapping("/load")
    public ResponseEntity<Logistic> getLogisticByShipperId(@RequestParam("shipperId") String shipperId){
        return logisticService.getList(shipperId);
    }

    @GetMapping("/load/{id}")
    public Optional<Logistic> getLogisticById(@PathVariable("id") Integer id){
        return logisticService.getById(id);
    }

    @PutMapping("/load/{loadId}")
    public Logistic updateLogistic(@PathVariable("loadId") Integer loadId, @RequestBody Logistic logistic){
        return logisticService.update(loadId, logistic);
    }

    @DeleteMapping("/load/{loadId}")
    public String deleteLogistic(@PathVariable("loadId") Integer loadId){
        return logisticService.delete(loadId);
    }

}
