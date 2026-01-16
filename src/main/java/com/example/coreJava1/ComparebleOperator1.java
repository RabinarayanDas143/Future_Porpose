package com.example.coreJava1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee> {
	private int id;
	private String name;
	private int age;

	public Employee(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	public Employee() {
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
	public int compareTo(Employee o) {

		return this.name.compareTo(o.name);
	}

}

public class ComparebleOperator1 {
	public static void main(String[] args) {
       List<Employee> list = new ArrayList<>();
       list.add(new Employee(1,"Ram",20));
       list.add(new Employee(2,"Sam",19));
       list.add(new Employee(3,"Rabi",25));
       
       Collections.sort(list);
       list.forEach(e->System.out.println(e));
	}
}
