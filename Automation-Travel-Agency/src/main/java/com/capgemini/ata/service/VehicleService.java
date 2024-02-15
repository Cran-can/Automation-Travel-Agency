package com.capgemini.ata.service;

import com.capgemini.ata.entity.Vehicle;

public interface VehicleService {
    public void addVehicle(Vehicle vehicle);
    public void deleteVehicle();

    public Vehicle getVehiclebyId(String id);
    public void modifyVehicle();
}
