package com.pack.service;

import java.util.List;

import com.pack.model.Employee;

public interface IEmployeeService {
    
    Integer saveEmployee(Employee e);
    List <Employee> getAllEmployee();
    Employee getOneEmployee(Integer id);
    void deleteEmployee(Integer id);
    
    

}
