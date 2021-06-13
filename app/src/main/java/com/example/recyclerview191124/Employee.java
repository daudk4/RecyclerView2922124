package com.example.recyclerview191124;

public class Employee {
    String FirstName , LastName , Department;
    int EmpId;

    public Employee() {
    }

    public Employee(String firstName, String lastName, String department, int empId) {
        FirstName = firstName;
        LastName = lastName;
        Department = department;
        EmpId = empId;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public int getEmpId() {
        return EmpId;
    }

    public void setEmpId(int empId) {
        EmpId = empId;
    }
}


