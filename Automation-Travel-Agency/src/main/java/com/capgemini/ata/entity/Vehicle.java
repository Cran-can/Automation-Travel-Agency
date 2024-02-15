package com.capgemini.ata.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(collection = "vehicles")
@Builder
public class Vehicle {
    @Id
    private String id;
    @Field(name = "vehicle_no")
    private String vehicleNo;
    @Field(name = "vehicle_name")
    private String vehicleName;
    @Field(name = "seating_capacity")
    private int seatingCapacity;
    @Field(name = "vehicle_type")
    private String vehicleType;
    @Field(name = "fare_per_km")
    private double farePerKm;
    @DBRef
    private Driver driver;
}
