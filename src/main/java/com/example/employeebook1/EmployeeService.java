package com.example.employeebook1;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeService  {
    List<Employee> employees = List.of(
            new Employee("Андрей", "Конин"),
            new Employee("Артём", "Вдовин"),
            new Employee("Владимир", "Антонов")
    );
    public static final int MAX_EMPLOYEE_COUNT = 3;

    public void addEmployee(String firstName, String lastName) throws EmployeeStorageIsFullException {
        if (MAX_EMPLOYEE_COUNT <= Employee) {
            employees.add(Employee);
        } else {
            throw new EmployeeStorageIsFullException("Превышено количество сотрудников");
        }
    }
    public void removeEmployee(String firstName, String lastName) {
        employees.remove(Employee);
    }
    public void findEmployee(String firstName, String lastName) throws EmployeeNotFoundException {
        employees.find(Employee);
        if(Employee == null) {
            throw new EmployeeNotFoundException("Сотрудник не найден");
        }
    }
}
