package com.example.employeebook1;

public class EmployeeStorageIsFullException extends Throwable {
    public EmployeeStorageIsFullException(String massage) {
        super(massage);
    }
}
