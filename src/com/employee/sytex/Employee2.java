package com.employee.sytex;

public class Employee2 {
	public String firstname;
	public String lastname;
	private int salary;
	public Employee2 () {
	this.firstname = "Anonymous";
	this.lastname = "Anonymous";
	this.salary = 9000; // default salary
	}
	public Employee2 (String firstnameInput, String lastnameInput) {
	this.firstname = firstnameInput;
	this.lastname = lastnameInput;
	this.salary = 9000; // default salary
	}
	public Employee2 (String firstnameInput, String lastnameInput, int salaryInput) {
	this.firstname = firstnameInput;
	this.lastname = lastnameInput;
	this.salary = salaryInput;
	}
	public int getSalary() {
	return salary;
	}
}
