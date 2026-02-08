package com.example.java8CodingQuestion9;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class ModelClass {
	private int id;
	private String name;
	private int age;
	private long salary;
	private String gender;
	private String deptName;
	private String city;
	private int yearOfJoining;

	public ModelClass(int id, String name, int age, long salary, String gender, String deptName, String city,
			int yearOfJoining) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.gender = gender;
		this.deptName = deptName;
		this.city = city;
		this.yearOfJoining = yearOfJoining;
	}

	@Override
	public String toString() {
		return "ModelClass [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + ", gender=" + gender
				+ ", deptName=" + deptName + ", city=" + city + ", yearOfJoining=" + yearOfJoining + "]";
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

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getYearOfJoining() {
		return yearOfJoining;
	}

	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}

}

public class OperationUsingModelClass9 {
	public static void main(String[] args) {
		List<ModelClass> empList = new ArrayList<>();
		empList.add(new ModelClass(1, "abc", 28, 123, "F", "HR", "Blore", 2020));
		empList.add(new ModelClass(2, "xyz", 29, 120, "F", "HR", "Hyderabad", 2015));
		empList.add(new ModelClass(3, "efg", 30, 115, "M", "HR", "Chennai", 2014));
		empList.add(new ModelClass(4, "def", 32, 125, "F", "HR", "Chennai", 2013));
		empList.add(new ModelClass(5, "ijk", 22, 150, "F", "IT", "Noida", 2013));
		empList.add(new ModelClass(6, "mno", 27, 140, "M", "IT", "Gurugram", 2017));
		empList.add(new ModelClass(7, "uvw", 26, 130, "F", "IT", "Pune", 2016));
		empList.add(new ModelClass(8, "pqr", 23, 145, "M", "IT", "Trivandam", 2015));
		empList.add(new ModelClass(9, "stv", 25, 160, "M", "IT", "Blore", 2010));
		empList.add(new ModelClass(10, "fdf", 32, 170, "F", "IT", "Blore", 2011));

		// Group employees by city
		Map<String, Long> map1 = empList.stream()
				.collect(Collectors.groupingBy(e -> e.getCity(), Collectors.counting()));
		// System.out.println(map1);

		// Group Employees by age
		Map<Integer, Long> map2 = empList.stream()
				.collect(Collectors.groupingBy(e -> e.getAge(), Collectors.counting()));
		// System.out.println(map2);

		// Find the count of male and female employees present in the organization
		Map<String, Long> map3 = empList.stream()
				.collect(Collectors.groupingBy(e -> e.getGender(), Collectors.counting()));
       //System.out.println(map3);
		
		// Print the names of all departments in the organization
		List<String> map4 = empList.stream().map(e->e.getCity()).collect(null);
	}
}
