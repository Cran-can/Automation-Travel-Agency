package com.capgemini.ata.controller;

import com.capgemini.ata.entity.Vehicle;
import com.capgemini.ata.service.VehicleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/admin")
public class VehicleController {

    @Autowired
    private VehicleServiceImpl vehicleServiceImpl;
    @PostMapping("/addVehicle")
    public ResponseEntity<String> addVehicle(@RequestBody Vehicle vehicle) {
          vehicleServiceImpl.addVehicle(vehicle);
          return new ResponseEntity<>( "Vehicle Added Successfully.", HttpStatus.OK );
    }

    @GetMapping("/getById/{id}")
    public Vehicle getVehiclebyId(@PathVariable String id){
        return vehicleServiceImpl.getVehiclebyId(id);
    }
}
