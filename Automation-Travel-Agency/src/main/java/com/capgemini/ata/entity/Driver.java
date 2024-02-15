package com.capgemini.ata.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(collection = "drivers")
public class Driver {
    @Id
    private String id;
    @Field(name = "name")
    private String driverName;
    private String address;
    @Field(name = "contact")
    private Long contactNo;
    @Field(name = "license_no")
    private String LicenceNo;
}