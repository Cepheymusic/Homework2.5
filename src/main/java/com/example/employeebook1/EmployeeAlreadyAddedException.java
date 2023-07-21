package com.example.employeebook1;

public class EmployeeAlreadyAddedException extends Throwable{
    public EmployeeAlreadyAddedException(String massage) {
        super(massage);
    }
}
