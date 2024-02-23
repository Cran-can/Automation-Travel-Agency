package com.capgemini.ata.service;

import com.capgemini.ata.entity.Vehicle;
import com.capgemini.ata.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleServiceImpl implements VehicleService{
    @Autowired
    private VehicleRepository vehicleRepository;
    @Override
    public void addVehicle(Vehicle vehicle) {
        vehicleRepository.save(vehicle);
    }

    @Override
    public String deleteVehicle(String id) {
        vehicleRepository.deleteById(id);
        return "Vehicle Deleted Successfully!!!";
    }

    @Override
    public Vehicle getVehicleById(String id) {
        return vehicleRepository.findById(id).get();
    }

    @Override
    public Vehicle modifyVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }
}
