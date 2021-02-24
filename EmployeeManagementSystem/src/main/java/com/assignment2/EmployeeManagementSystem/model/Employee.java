package com.example.EmployeeManagementSystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="employees")
public class Employee {
//    enum employeeBusinessUnit{
//        financialServiceIndustry,
//        manufacturingIndustry,
//        retailIndustry,
//        itSupport,
//        corporateFunctions
//    }

    private String employeeCode;
    private String employeeFirstName;
    private String employeeLastName;
    private String employeeContactNumber;
    private String employeeRole;
    private String employeePosition;
    private String employeeBusinessUnit;
    private int employeeNoticePeriodDays;
//    private String employeeJoiningDate;
    private boolean employeeOnOrOffBench;
    EmployeeAddress employeeAddress;
    EmployeeDate employeeJoiningDate;

    public Employee(String employeeCode, String employeeFirstName, String employeeLastName, String employeeContactNumber, String employeeRole, String employeePosition,EmployeeAddress employeeAddress, EmployeeDate employeeJoiningDate, String employeeBusinessUnit, int employeeNoticePeriodDays, boolean employeeOnOrOffBench) {
        this.employeeCode = employeeCode;
        this.employeeFirstName = employeeFirstName;
        this.employeeLastName = employeeLastName;
        this.employeeAddress = employeeAddress;
        this.employeeJoiningDate = employeeJoiningDate;
        this.employeeContactNumber = employeeContactNumber;
        this.employeeRole = employeeRole;
        this.employeePosition = employeePosition;
        this.employeeBusinessUnit = employeeBusinessUnit;
        this.employeeNoticePeriodDays = employeeNoticePeriodDays;
        this.employeeOnOrOffBench = employeeOnOrOffBench;
    }

    @Id
    public String getEmployeeCode() {
        return employeeCode;
    }
    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    @Column(name = "contact_number", nullable = false)
    public String getEmployeeContactNumber() {
        return employeeContactNumber;
    }
    public void setEmployeeContactNumber(String employeeContactNumber) {
        this.employeeContactNumber = employeeContactNumber;
    }

    @Column(name = "role", nullable = false)
    public String getEmployeeRole() {
        return employeeRole;
    }
    public void setEmployeeRole(String employeeRole) {
        this.employeeRole = employeeRole;
    }
    @Column(name = "position", nullable = false)
    public String getEmployeePosition() {
        return employeePosition;
    }
    public void setEmployeePosition(String employeePosition) {
        this.employeePosition = employeePosition;
    }

    @Column(name = "business_unit", nullable = false)
    public String getEmployeeBusinessUnit() {
        return employeeBusinessUnit;
    }
    public void setEmployeeBusinessUnit(String employeeBusinessUnit) {
        this.employeeBusinessUnit = employeeBusinessUnit;
    }

    @Column(name = "notice_period", nullable = false)
    public int getEmployeeNoticePeriodDays() {
        return employeeNoticePeriodDays;
    }
    public void setEmployeeNoticePeriodDays(int employeeNoticePeriodDays) {
        this.employeeNoticePeriodDays = employeeNoticePeriodDays;
    }

    @Column(name = "bench", nullable = false)
    public boolean isEmployeeOnOrOffBench() {
        return employeeOnOrOffBench;
    }
    public void setEmployeeOnOrOffBench(boolean employeeOnOrOffBench) {
        this.employeeOnOrOffBench = employeeOnOrOffBench;
    }


    @Column(name = "first_name", nullable = false)
    public String getEmployeeFirstName() {
        return employeeFirstName;
    }
    public void setEmployeeFirstName(String employeeFirstName) {
        this.employeeFirstName = employeeFirstName;
    }


    @Column(name = "last_name", nullable = false)
    public String getEmployeeLastName() {
        return employeeLastName;
    }
    public void setEmployeeLastName(String employeeLastName) {
        this.employeeLastName = employeeLastName;
    }

    @Column(name = "address", nullable = false)
    public EmployeeAddress getEmployeeAddress() {
        return employeeAddress;
    }
    public void setEmployeeAddress(EmployeeAddress employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    @Column(name = "joining-date", nullable = false)
    public EmployeeDate getEmployeeJoiningDate() {
        return employeeJoiningDate;
    }
    public void setEmployeeJoiningDate(EmployeeDate employeeJoiningDate) {
        this.employeeJoiningDate = employeeJoiningDate;
    }
}
