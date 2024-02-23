package com.capgemini.ata.repository;

import com.capgemini.ata.entity.Route;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RouteRepository extends MongoRepository<Route,String> {

}
