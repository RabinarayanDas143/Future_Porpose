package com.example.InterviewCoding26;

import java.util.HashSet;
import java.util.Set;

class Employee {
	private int id;
	private String name;

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;

		if (obj == null || getClass() != obj.getClass())
			return false;

		Employee emp = (Employee) obj;
		return this.id == emp.id && this.name == emp.name;
	}

	public int hashCode() {
		int result = 17;
		result = 31 * result + id;
		result = 31 * result + name.hashCode();
		return result;
	}
}

public class CustomHashSet26 {
	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Rabi");
		Employee e2 = new Employee(1, "Rabi");
		Employee e3 = new Employee(2, "Das");

		System.out.println(e1.hashCode() == e3.hashCode());
		System.out.println(e1.equals(e2));
		Set<Employee> set = new HashSet<>();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		System.out.println(set.size());
	}
}
