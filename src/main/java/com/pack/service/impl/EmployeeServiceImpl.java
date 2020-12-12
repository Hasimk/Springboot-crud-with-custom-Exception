package com.pack.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pack.customexceptio.EmployeeNotFoundException;
import com.pack.model.Employee;
import com.pack.repository.EmployeeRepository;
import com.pack.service.IEmployeeService;
import com.sun.el.stream.Optional;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

    
    @Autowired
    
    private EmployeeRepository repo;
    
    @Override
    public Integer saveEmployee(Employee e) {
      Integer id= repo.save(e).getEmpId();
        return id;
    }

    @Override
    public List<Employee> getAllEmployee() {
       List<Employee>list= repo.findAll();
            return list;
    }

    @Override
    public Employee getOneEmployee(Integer id) {
       java.util.Optional<Employee>opt=repo.findById(id);
      Employee emp= opt.orElseThrow(() -> new EmployeeNotFoundException("Employee not Exist"));
               
        return emp;
    }

    @Override
    public void deleteEmployee(Integer id) {
        Employee emp = getOneEmployee(id);
       repo.deleteById(id);
        
    }

    
}
