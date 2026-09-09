package com.jyoti.assignment.utilities;
import com.jyoti.assignment.employees.Employee;

public class EmployeeUtilities {
	

	public void displayEmployee(Employee employee)
	{
        System.out.println("Name: " + employee.getName());
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Salary: " + employee.getSalary());
	}
	public void increaseSalary(Employee employee, double amount) {
        double newSalary = employee.getSalary() + amount;
        employee.setSalary(newSalary);

        System.out.println("New Salary: " + newSalary);
    }
}
