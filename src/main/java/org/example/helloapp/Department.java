package org.example.helloapp;

import org.springframework.stereotype.Component;

@Component
public class Department {

    public String getDeptName() {
        return "IT Department";
    }
}