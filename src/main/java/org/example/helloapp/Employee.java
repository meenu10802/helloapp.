package org.example.helloapp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {

    @Autowired
    Department department;

    public void showDetails() {
        System.out.println("Employee works in: " + department.getDeptName());
    }
}
