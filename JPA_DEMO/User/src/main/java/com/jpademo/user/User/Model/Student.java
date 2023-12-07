package com.jpademo.user.User.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Student")
public class Student {


    int id;

    public Student() {
    }

    public int getId() {
        return id;
    }

    public Student(int id, String name, int className, int rollNumber) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.rollNumber = rollNumber;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getClassName() {
        return className;
    }

    public void setClassName(int className) {
        this.className = className;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }


    @Id
    @Column(unique = true)
    String name;
    int className;


    int rollNumber;
}
