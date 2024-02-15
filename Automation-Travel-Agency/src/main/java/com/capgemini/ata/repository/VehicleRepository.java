package com.capgemini.ata.repository;

import com.capgemini.ata.entity.Vehicle;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VehicleRepository extends MongoRepository<Vehicle,String> {

}
