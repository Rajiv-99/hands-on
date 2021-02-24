package com.example.EmployeeManagementSystem.model;

public class EmployeeAddress {

    private String employeeBlockNo;
    private String landMark;
    private String employeeCurrentCity;
    private String employeePinCode;
    private String employeeState;

    public EmployeeAddress(String employeeBlockNo, String landMark, String employeeCurrentCity, String employeePinCode, String employeeState) {
        this.employeeBlockNo = employeeBlockNo;
        this.landMark = landMark;
        this.employeeCurrentCity = employeeCurrentCity;
        this.employeePinCode = employeePinCode;
        this.employeeState = employeeState;
    }

    public String getEmployeeBlockNo() {
        return employeeBlockNo;
    }

    public String getLandMark() {
        return landMark;
    }

    public String getEmployeeCurrentCity() {
        return employeeCurrentCity;
    }

    public String getEmployeePinCode() {
        return employeePinCode;
    }

    public String getEmployeeState() {
        return employeeState;
    }

    public void setEmployeeBlockNo(String employeeBlockNo) {
        this.employeeBlockNo = employeeBlockNo;
    }

    public void setLandMark(String landMark) {
        this.landMark = landMark;
    }

    public void setEmployeeCurrentCity(String employeeCurrentCity) {
        this.employeeCurrentCity = employeeCurrentCity;
    }

    public void setEmployeePinCode(String employeePinCode) {
        this.employeePinCode = employeePinCode;
    }

    public void setEmployeeState(String employeeState) {
        this.employeeState = employeeState;
    }
}
