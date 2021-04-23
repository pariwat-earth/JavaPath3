package com.employee.sytex;

class Day10 {
	public static void main(String[] args) {
		//instance CEO Employee
		Employee dang = new Employee("Dang","Red", "022", 10000, "CEO");
			System.out.println(dang.getSalary()); // 10000
		dang.hello(); // Hello Dang
		CEO ceo = new CEO("Somchai","Sudlor", 30000, "CTO");
			System.out.println(ceo.getSalary()); // 60000
		ceo.hello(); // Hi, nice to meet you. Somchai!
		ceo.fire(dang); // Dang has been fired!
		
		//Constructor Overloading
		Employee2 employee1 = new Employee2();
			System.out.println(employee1.firstname); // Anonymous
			System.out.println(employee1.lastname); // Anonymous
			System.out.println(employee1.getSalary()); // 9000
		Employee2 employee2 = new Employee2("Dang", "Red");
			System.out.println(employee2.firstname); // Dang
			System.out.println(employee2.lastname); // Red
			System.out.println(employee2.getSalary()); // 9000
		Employee2 employee3 = new Employee2("Dang", "Red", 20000);
			System.out.println(employee3.firstname); // Dang
			System.out.println(employee3.lastname); // Red
			System.out.println(employee3.getSalary()); // 20000
	}
	
}
