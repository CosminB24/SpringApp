package com.example.springdata.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="GUEST")
public class Guest {
    private Integer id;
    private String firstName;
    private String lastName;
    private String emailAdress;
    private String adress;
    private String country;
    private String state;
    private String phoneNumber;
    

}
