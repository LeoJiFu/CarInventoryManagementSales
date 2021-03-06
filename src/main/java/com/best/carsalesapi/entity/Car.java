package com.best.carsalesapi.entity;

import com.best.carsalesapi.entity.model.CarAvailabilityStatus;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "car")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String brandName;

    @NotNull
    private Double price;

    @NotNull
    @Builder.Default
    private CarAvailabilityStatus carAvailabilityStatus = CarAvailabilityStatus.OPEN;

    // constrains
}


