package com.abhishek.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "logistic")
public class Logistic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer loadId;
    private String loadingPoint;
    private String unloadingPoint;
    private String productType;
    private String truckType;
    private String noOfTrucks;
    private String weight;
    private String comment;
    private String shipperId;
    private String date;
}
