package com.capgemini.ata.service;

import com.capgemini.ata.entity.Route;
import com.capgemini.ata.repository.RouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RouteServiceImpl implements RouteService{

    @Autowired
    RouteRepository routeRepository;
    @Override
    public Route addRoute(Route route) {
        return routeRepository.save(route);
    }

    @Override
    public String deleteRoute(String id) {
        routeRepository.deleteById(id);
        return "Route Deleted successfully";
    }

    @Override
    public Route viewRoute(String id) {
        return routeRepository.findById(id).get();
    }

    @Override
    public Route modifyRoute(Route route) {
        return routeRepository.save(route);
    }
}
