package com.hib;
// Generated Jun 28, 2017 9:54:42 AM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Employees generated by hbm2java
 */
public class Employees  implements java.io.Serializable {


     private int employeeId;
     private Employees employees;
     private String firstName;
     private String lastName;
     private String email;
     private String phoneNumber;
     private Date hireDate;
     private String jobId;
     private double salary;
     private double commissionPct;
     private int departmentId;
     private Set employeeses = new HashSet(0);

    public Employees() {
    }

	
    public Employees(int employeeId, String lastName, String email, Date hireDate, String jobId) {
        this.employeeId = employeeId;
        this.lastName = lastName;
        this.email = email;
        this.hireDate = hireDate;
        this.jobId = jobId;
    }
    public Employees(int employeeId, Employees employees, String firstName, 
            String lastName, String email, String phoneNumber, 
            Date hireDate, String jobId, int salary, double commissionPct,int departmentId, Set employeeses) {
       this.employeeId = employeeId;
       this.employees = employees;
       this.firstName = firstName;
       this.lastName = lastName;
       this.email = email;
       this.phoneNumber = phoneNumber;
       this.hireDate = hireDate;
       this.jobId = jobId;
       this.salary = salary;
       this.commissionPct = commissionPct;
       this.departmentId = departmentId;
       this.employeeses = employeeses;
    }
   
    public int getEmployeeId() {
        return this.employeeId;
    }
    
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public Employees getEmployees() {
        return this.employees;
    }
    
    public void setEmployees(Employees employees) {
        this.employees = employees;
    }
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public Date getHireDate() {
        return this.hireDate;
    }
    
    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }
    public String getJobId() {
        return this.jobId;
    }
    
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }
    public double getSalary() {
        return this.salary;
    }
    
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getCommissionPct() {
        return this.commissionPct;
    }
    
    public void setCommissionPct(double commissionPct) {
        this.commissionPct = commissionPct;
    }
    public int getDepartmentId() {
        return this.departmentId;
    }
    
    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }
    public Set getEmployeeses() {
        return this.employeeses;
    }
    
    public void setEmployeeses(Set employeeses) {
        this.employeeses = employeeses;
    }

}