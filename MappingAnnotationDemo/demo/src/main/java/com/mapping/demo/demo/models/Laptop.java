package com.mapping.demo.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Laptop {
    @Id
    int id;
    String name;
    @ManyToOne
    Student student;
}
