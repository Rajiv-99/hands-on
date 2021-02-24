package com.example.EmployeeManagementSystem.model;

public class EmployeeDate {

    private int month;
    private int date;
    private int year;

    public EmployeeDate(int month, int date, int year) {
        this.month = month;
        this.date = date;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public int getDate() {
        return date;
    }

    public int getYear() {
        return year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
