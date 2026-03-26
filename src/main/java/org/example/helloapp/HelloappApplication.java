package org.example.helloapp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class HelloappApplication {

    public static void main(String[] args) {

        ApplicationContext context =
                SpringApplication.run(HelloappApplication.class, args);

        Employee emp = context.getBean(Employee.class);
        emp.showDetails();
    }
}