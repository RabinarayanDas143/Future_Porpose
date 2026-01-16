package com.example.coreJava1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee1 {
	private int id;
	private String name;
	private int age;

	public Employee1(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public Employee1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

}

class CompareById implements Comparator<Employee1> {

	@Override
	public int compare(Employee1 o1, Employee1 o2) {
		// TODO Auto-generated method stub
		return ((Integer) o1.getId()).compareTo(o2.getId());
	}

}

class CompareByName implements Comparator<Employee1> {

	@Override
	public int compare(Employee1 o1, Employee1 o2) {

		return o1.getName().compareTo(o2.getName());
	}

}

public class ComparatorOPerator1 {
	public static void main(String[] args) {
		List<Employee1> emp = new ArrayList<>();
		emp.add(new Employee1(5, "Shyam", 88));
		emp.add(new Employee1(3, "Harish", 60));
		emp.add(new Employee1(1, "Rabi", 25));

		//Collections.sort(emp, new CompareById());
		//emp.forEach(e -> System.out.println(e));
		
		Collections.sort(emp,new CompareByName());
		emp.forEach(e->System.out.println(e));
	}
}
