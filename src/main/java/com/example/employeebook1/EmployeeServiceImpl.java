package com.example.employeebook1;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final List<Employee> employees;

    public EmployeeServiceImpl() {
        this.employees = new ArrayList<>();
        employees.add(new Employee("Андрей", "Конин"));
        employees.add(new Employee("Артём", "Вдовин"));
        employees.add(new Employee("Владимир", "Шонин"));
    }
    public static final int MAX_EMPLOYEE_COUNT = 4;
    @Override
    public Employee addEmployee(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (employees.contains(employee)) { //проходимся по списку сотрудников
            throw new EmployeeAlreadyAddedException("Сотрудник существует");
        }
        if (employees.size() < MAX_EMPLOYEE_COUNT) {
            employees.add(employee);
        } else {
            throw new EmployeeStorageIsFullException("Превышено количество сотрудников");
        }

        return employee;
    }

    @Override
    public Employee removeEmployee(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (!employees.remove(employee)) {
            throw new EmployeeNotFoundException("Сотрудник не найден");
        }
        return employee;
    }

    @Override
    public Employee findEmployee(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (!employees.contains(employee)) {
            throw new EmployeeNotFoundException("Сотрудник не найден");
        }
        return employee;
    }

    @Override
    public List<Employee> findAll() {
        return employees;
    }
}
