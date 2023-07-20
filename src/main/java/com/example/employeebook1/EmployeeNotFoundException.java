package com.example.employeebook1;

public class EmployeeNotFoundException extends Throwable {
    public EmployeeNotFoundException(String massage)  {
        super(massage);
    }
}
