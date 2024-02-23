package com.capgemini.ata.controller;

import com.capgemini.ata.entity.Vehicle;
import com.capgemini.ata.service.VehicleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/admin/vehicle")
public class VehicleController {

    @Autowired
    private VehicleServiceImpl vehicleServiceImpl;
    @PostMapping("/add")
    public ResponseEntity<String> addVehicle(@RequestBody Vehicle vehicle) {
          vehicleServiceImpl.addVehicle(vehicle);
          return new ResponseEntity<>( "Vehicle Added Successfully.", HttpStatus.OK );
    }

    @GetMapping("/getById/{id}")
    public Vehicle getVehicleById(@PathVariable String id){
        return vehicleServiceImpl.getVehicleById(id);
    }

    @PutMapping("/modify")
    public Vehicle modifyVehicle(@RequestBody Vehicle vehicle){
        return  vehicleServiceImpl.modifyVehicle(vehicle);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteVehicle(@PathVariable String id){
        return vehicleServiceImpl.deleteVehicle(id);
    }
}
