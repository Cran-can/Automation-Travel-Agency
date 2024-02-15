package com.capgemini.ata.entity;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(collection = "users")
public class User {
    @Id
    private String id;
    private String name;
    private String dob;
    private String gender;
    private String address;
    @Field(name = "contact")
    private String contactNo;
    private String email;
}