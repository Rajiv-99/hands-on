package com.example.EmployeeManagementSystem.repository;

import com.example.EmployeeManagementSystem.model.Employee;

import java.util.HashMap;
import java.util.Map;

public class RepoMap {
    Employee employee;
    HashMap<String, Employee> onBoard = new HashMap<>();

    public String addEmployeeCode(Employee employee){
        String code = "sadasdasd";
        return code;
    }
    public Employee getEmployeeByCode(String employeeCode){
        for(Map.Entry map : onBoard.entrySet()){
            if(map.getKey().equals(employeeCode)){
                return (Employee) map.getValue();

            }
        }
    return employee;
    }
}
