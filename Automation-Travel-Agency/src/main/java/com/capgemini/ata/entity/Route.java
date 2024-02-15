package com.capgemini.ata.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "routes")
public class Route {
    private String source;
    private String destination;
    private double distance;
    @Id
    private String routeId;
    private int duration;
}