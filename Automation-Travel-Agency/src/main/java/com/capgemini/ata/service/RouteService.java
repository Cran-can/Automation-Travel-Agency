package com.capgemini.ata.service;

import com.capgemini.ata.entity.Route;
import org.springframework.stereotype.Service;

public interface RouteService {
    public Route addRoute(Route route);
    public String deleteRoute(String id);
    public Route viewRoute(String id);
    public Route modifyRoute(Route route);
}
