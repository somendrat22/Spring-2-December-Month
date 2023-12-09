package com.mapping.demo.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import java.util.List;

@Entity
public class Student {
    @Id
    int id;
    String name;
    @OneToMany(mappedBy = "student")
    List<Laptop> laptops;
}
