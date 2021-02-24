package com.example.EmployeeManagementSystem.model;

import java.util.ArrayList;

public class EmployeeProject {

    private int totalEmployeeInProject;
    private long projectID;
    private boolean projectStatusIsActiveOrNot;
    private String projectName;
    private ArrayList<String> employeesOnBench;
    private Integer projectTeamRequirement;

    public EmployeeProject(int totalEmployeeInProject, long projectID, boolean projectStatusIsActiveOrNot, String projectName, ArrayList<String> employeesOnBench, Integer projectTeamRequirement) {
        this.totalEmployeeInProject = totalEmployeeInProject;
        this.projectID = projectID;
        this.projectStatusIsActiveOrNot = projectStatusIsActiveOrNot;
        this.projectName = projectName;
        this.employeesOnBench = employeesOnBench;
        this.projectTeamRequirement = projectTeamRequirement;
    }

    public int getTotalEmployeeInProject() {
        return totalEmployeeInProject;
    }

    public long getProjectID() {
        return projectID;
    }

    public boolean isProjectStatusIsActiveOrNot() {
        return projectStatusIsActiveOrNot;
    }

    public String getProjectName() {
        return projectName;
    }

    public ArrayList<String> getEmployeesOnBench() {
        return employeesOnBench;
    }

    public Integer getProjectTeamRequirement() {
        return projectTeamRequirement;
    }

    public void setTotalEmployeeInProject(int totalEmployeeInProject) {
        this.totalEmployeeInProject = totalEmployeeInProject;
    }

    public void setProjectID(long projectID) {
        this.projectID = projectID;
    }

    public void setProjectStatusIsActiveOrNot(boolean projectStatusIsActiveOrNot) {
        this.projectStatusIsActiveOrNot = projectStatusIsActiveOrNot;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public void setEmployeesOnBench(ArrayList<String> employeesOnBench) {
        this.employeesOnBench = employeesOnBench;
    }

    public void setProjectTeamRequirement(Integer projectTeamRequirement) {
        this.projectTeamRequirement = projectTeamRequirement;
    }
}
