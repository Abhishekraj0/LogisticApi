package com.abhishek.Repo;

import com.abhishek.model.Logistic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogisticRepo extends JpaRepository<Logistic,Integer> {
    Logistic findByShipperId(String shipperId);
}
