package com.example.employeebook1;

import java.util.List;

public interface EmployeeService {

    Employee addEmployee(String firstName, String lastName) throws EmployeeStorageIsFullException;

    Employee removeEmployee(String firstName, String lastName);

    Employee findEmployee(String firstName, String lastName) throws EmployeeNotFoundException   // просит вернуть нулл , зачем мне нул, если я возвращаю ошибку?)))
    ;

    List<Employee> findAll();
}
