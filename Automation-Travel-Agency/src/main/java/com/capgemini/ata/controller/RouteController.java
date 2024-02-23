package com.capgemini.ata.controller;

import com.capgemini.ata.entity.Route;
import com.capgemini.ata.service.RouteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/admin/route")
public class RouteController {
    @Autowired
    private RouteServiceImpl routeServiceImpl;

    @PostMapping("/add")
    public Route addRoute(@RequestBody Route route){
        return routeServiceImpl.addRoute(route);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteRoute(@PathVariable String id){
        return routeServiceImpl.deleteRoute(id);
    }

    @PutMapping("/modify")
    public Route modifyRoute(@RequestBody Route route){
        return routeServiceImpl.modifyRoute(route);
    }

    @GetMapping("/getById/{id}")
    public Route viewRoute(@PathVariable String id){
        return routeServiceImpl.viewRoute(id);
    }
}
