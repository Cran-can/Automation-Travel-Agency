package com.capgemini.ata.service;

import com.capgemini.ata.entity.Vehicle;

public interface VehicleService {
    public void addVehicle(Vehicle vehicle);
    public String deleteVehicle(String id);

    public Vehicle getVehicleById(String id);
    public Vehicle modifyVehicle(Vehicle vehicle);
}
