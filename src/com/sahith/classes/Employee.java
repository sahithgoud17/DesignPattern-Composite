package com.sahith.classes;

import java.util.ArrayList;
import java.util.List;

public class Employee
{
    private String name;
    private String department;
    private int salary;
    private List<Employee> employeeList;

    public Employee(String name , String department , int salary)
    {
        this.name = name;
        this.department =department;
        this.salary = salary;
        employeeList = new ArrayList<>();
    }

    public void addEmployee(Employee employee)
    {
        employeeList.add(employee);
    }

    public void removeEmployee(Employee employee)
    {
        employeeList.remove(employee);
    }

    public List<Employee> getEmployee()
    {
        return employeeList;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Name='" + name + '\'' +
                ", Department='" + department + '\'' +
                ", Salary=" + salary +
                '}';
    }
}
