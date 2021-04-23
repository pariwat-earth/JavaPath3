package com.employee.sytex;

public class Employee {
	public String firstname; 
	public String lastname;
	public String PhoneNumber;
	private int salary;
	private static String Position;
	public Employee(String firstnameInput, String lastnameInput,String phoneNumber, int salaryInput , String position) {
		firstname = firstnameInput;
		lastname = lastnameInput;
		phoneNumber = PhoneNumber;
		salary = salaryInput;
		Position = position;
	}
	public static void main(String[] args) {
		///Lab3
		Employee[] employee = new Employee[3] ;
		
		for (int i = 0; i < employee.length; i++) {
			employee[i] = new Employee("First name" + i, "Last Name" + i, "00"+i, 10000*i, "Pokamon") ;
		}
		System.out.println(employee[1].firstname);
		System.out.println(employee[1].lastname);
		System.out.println(employee[1].PhoneNumber);
		System.out.println(employee[1].salary);
		System.out.println(Employee.Position);
		chackPosition();
	}
	public void hello() {
		System.out.println("Hello " + firstname );
	}
	public int getSalary() {
		return salary;
	}
	
	public static void chackPosition() {
		System.out.println(Position);
	}
	
	public void newMethod13() {
		System.out.println(firstname + "his number is" + PhoneNumber);
	}
}
