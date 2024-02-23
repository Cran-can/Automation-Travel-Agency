package com.capgemini.ata.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "routes")
@Builder
public class Route {
    @Id
    private String routeId;
    private String source;
    private String destination;
    private String distance;
    private String duration;
}