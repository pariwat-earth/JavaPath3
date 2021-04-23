package com.employee.sytex;

public class Programmer extends Employee{

	public Programmer(String firstnameInput, String lastnameInput, int salaryInput, String position) {
		super(firstnameInput, lastnameInput, position, salaryInput, position);
	}
	@Override
	public int getSalary() {
		return super.getSalary();
	}
	
	public void createWabsite(String template, String titleName) {}
	public void installWindows(String version,String productKey) {}
	public static void main(String[] args) {
	}
}
