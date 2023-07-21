package com.example.employeebook1;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeService  {
    List<Employee> employees = List.of(
            new Employee("Андрей", "Конин"),
            new Employee("Артём", "Вдовин"),
            new Employee("Владимир", "Шонин")
    );
    public static final int MAX_EMPLOYEE_COUNT = 4;

    public void addEmployee(String firstName, String lastName) throws EmployeeStorageIsFullException {
        if (employees.size() <= MAX_EMPLOYEE_COUNT) {
            employees = (List<Employee>) new Employee(firstName, lastName);
        } else {
            throw new EmployeeStorageIsFullException("Превышено количество сотрудников");
        }
    }
    public void removeEmployee(String firstName, String lastName) {
        employees.remove(employees);
    }
    public Employee findEmployee(String firstName, String lastName) throws EmployeeNotFoundException {
        for(Employee value : employees) {
            if(value.getFirstName().equals(firstName) && value.getLastName().equals(lastName)) {
                return value;
            }
            else {
                throw new EmployeeNotFoundException("Сотрудник не найден");
            }
        }
    }   // просит вернуть нулл , зачем мне нул, если я возвращаю ошибку?)))
}
