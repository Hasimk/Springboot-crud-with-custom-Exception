package com.pack.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Employee {
    @Id
    @GeneratedValue
    private Integer empId;
    private String empName;
    private Double empSal;
    private String empDept;
    
    
    

}
