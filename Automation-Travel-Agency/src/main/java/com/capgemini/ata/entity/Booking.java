package com.capgemini.ata.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;
@Data
@Document(collection = "bookings")
public class Booking {
    @Id
    private String id;
    @DBRef
    private Vehicle vehicle;
    @Field(name = "booking_date")
    private Date bookingDate;
    @Field(name="journey_date")
    private Date journeyDate;
    @Field(name = "boarding_point")
    private String boardingPoint;
    @Field(name = "drop_point")
    private String dropPoint;
    @Field(name = "contact")
    private String contactNo;
    private double fare;
    @Field(name = "booking_status")
    private String BookingStatus;
    @Field(name = "no_of_passengers")
    private int noOfPassengers;
    private String booking_id;
}