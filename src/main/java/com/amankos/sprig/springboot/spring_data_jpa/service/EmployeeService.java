package com.amankos.sprig.springboot.spring_data_jpa.service;


import com.amankos.sprig.springboot.spring_data_jpa.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);
}
