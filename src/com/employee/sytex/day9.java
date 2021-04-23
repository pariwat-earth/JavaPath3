package com.employee.sytex;

class Day9 {
	public static void main(String[] args) {
			Employee dang = new Employee("Dang","Red", "032", 10000 , "pokemon");
			System.out.println(dang.firstname); // Dang
			System.out.println(dang.lastname); // Red
			dang.hello(); // Hello Dang
			int salary = dang.getSalary();
			System.out.println(salary); // 10000
	}
}

