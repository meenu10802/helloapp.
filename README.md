# Hello Messaging App (Spring Boot)

## Project Description

This project is a simple Spring Boot REST API application that demonstrates different HTTP methods and basic Spring concepts like Dependency Injection.

---

## Features Implemented

### UC1 – Basic GET API

* Endpoint: `/hello`
* Output:
  `Hello from BridgeLabz`

---

### UC2 – GET with Query Parameter

* Endpoint: `/hello/query?name=Meenakshi`
* Output:
  `Hello Meenakshi from BridgeLabz`

---
    
### UC3 – GET with Path Variable

* Endpoint: `/hello/param/Meenakshi`
* Output:
  `Hello Meenakshi from BridgeLabz`

---

### UC4 – POST Request (JSON Body)

* Endpoint: `/hello/post`
* Method: POST
* Request Body:


* Output:
  `Hello Meenakshi from BridgeLabz`

---

### UC5 – PUT Request

* Endpoint: `/hello/put/Meenakshi?lastName=S`
* Method: PUT
* Output:
  `Hello Meenakshifrom BridgeLabz`

---

## ⚙️ Dependency Injection Demo

* Implemented using:

    * `@Component`
    * `@Autowired`
* Demonstrates how Spring automatically injects dependencies.

---

## Concepts Used

* Spring Boot
* REST APIs
* HTTP Methods (GET, POST, PUT)
* Query Parameters
* Path Variables
* Request Body (JSON)
* Dependency Injection (IoC Container)

---

## Tools & Technologies

* Java
* Spring Boot
* IntelliJ IDEA
* Maven
* Git & GitHub

---

## How to Run

1. Open project in IntelliJ
2. Run `HelloappApplication.java`
3. Open browser:

```
http://localhost:8080/hello
```

---

## Project Structure

* Controller → Handles API requests
* Model (User) → Handles request data
* Components → Used for Dependency Injection

---

