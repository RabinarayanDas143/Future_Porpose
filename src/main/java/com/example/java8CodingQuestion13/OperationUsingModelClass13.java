package com.example.java8CodingQuestion13;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

class Employee {
	private int id;
	private String name;
	private int age;
	private long salary;
	private String gender;
	private String deptName;
	private String city;
	private int yearOfJoining;

	public Employee(int id, String name, int age, long salary, String gender, String deptName, String city,
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

	@Override
	public String toString() {
		return "ModelClass [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + ", gender=" + gender
				+ ", deptName=" + deptName + ", city=" + city + ", yearOfJoining=" + yearOfJoining + "]";
	}

}

public class OperationUsingModelClass13 {
	public static void main(String[] args) {
		List<Employee> empList = Arrays.asList(new Employee(1, "Rahul", 25, 45000, "Male", "IT", "Mumbai", 2022),
				new Employee(2, "Priya", 27, 52000, "Female", "HR", "Pune", 2021),
				new Employee(3, "Amit", 30, 60000, "Male", "Finance", "Delhi", 2019),
				new Employee(4, "Sneha", 24, 40000, "Female", "IT", "Bangalore", 2023),
				new Employee(5, "Raj", 29, 70000, "Male", "Admin", "Chennai", 2018),
				new Employee(6, "Pooja", 26, 48000, "Female", "IT", "Hyderabad", 2020),
				new Employee(7, "Karan", 31, 75000, "Male", "Finance", "Mumbai", 2017),
				new Employee(8, "Neha", 28, 55000, "Female", "HR", "Kolkata", 2021),
				new Employee(9, "Arun", 32, 80000, "Male", "IT", "Pune", 2016),
				new Employee(10, "Riya", 23, 38000, "Female", "Support", "Bangalore", 2024));

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
		// System.out.println(map3);

		// Print the names of all departments in the organization
		List<String> map4 = empList.stream().map(e -> e.getDeptName()).distinct().collect(Collectors.toList());
		// System.out.println(map4);

		// print employee details whose age is greater than 28
		List<Employee> map5 = empList.stream().filter(e -> e.getAge() > 28).collect(Collectors.toList());
		// System.out.println(map5);

		// find maximum age of employee
		Employee map6 = empList.stream().sorted((a, b) -> b.getAge() - a.getAge()).findFirst().get();
		// System.out.println(map6);

		// Print Average age of Male and Female Employees
		Map<String, Double> map7 = empList.stream()
				.collect(Collectors.groupingBy(e -> e.getGender(), Collectors.averagingLong(e -> e.getAge())));
		// System.out.println(map7);

		// Print the number of employees in each department.
		Map<String, Long> map8 = empList.stream()
				.collect(Collectors.groupingBy(e -> e.getDeptName(), Collectors.counting()));
		// System.out.println(map8);

		// Find oldest employee
		Employee map9 = empList.stream().sorted(Comparator.comparing(Employee::getYearOfJoining)).findFirst().get();
		// System.out.println(map9);

		// Find youngest female employee
		Employee map10 = empList.stream().sorted((a, b) -> a.getAge() - b.getAge()).findFirst().get();
		// System.out.println(map10);

		// Find the department name which has the highest number of employees
		Entry<String, Long> map11 = empList.stream()
				.collect(Collectors.groupingBy(e -> e.getDeptName(), Collectors.counting())).entrySet().stream()
				.sorted((a, b) -> ((Long) b.getValue()).compareTo(a.getValue())).findFirst().get();
		// System.out.println(map11);

		// Find if there any employees from HR Department
		Employee map12 = empList.stream().filter(e -> e.getDeptName().equalsIgnoreCase("hr")).findAny()
				.orElseThrow(() -> new RuntimeException("Exception Occured"));
		// System.out.println(map12);

		// Find the department names where the number of employees in the department is
		// over 3
		List<Entry<String, Long>> map13 = empList.stream()
				.collect(Collectors.groupingBy(e -> e.getDeptName(), Collectors.counting())).entrySet().stream()
				.filter(e -> e.getValue() > 3).collect(Collectors.toList());
		// System.out.println(map13);

		// Find distinct department names that employees work.
		List<String> map14 = empList.stream().map(e -> e.getDeptName()).distinct().collect(Collectors.toList());
		// System.out.println(map14);

		// Find all employees who lives in ‘Mumbai’ city, sort them by their name and
		// print the names of employees.
		List<String> map15 = empList.stream().filter(e -> e.getCity().equalsIgnoreCase("Mumbai"))
				.sorted(Comparator.comparing(Employee::getName)).map(e -> e.getName()).collect(Collectors.toList());
		// System.out.println(map15);

		// No of employees in the organisation
		Long map16 = empList.stream().collect(Collectors.counting());
		// System.out.println(map16);

		// Find the department which has the highest number of employees.
		Entry<String, Long> map17 = empList.stream()
				.collect(Collectors.groupingBy(e -> e.getDeptName(), Collectors.counting())).entrySet().stream()
				.sorted((a, b) -> ((Long) b.getValue()).compareTo(a.getValue())).findFirst().get();
		// System.out.println(map17);

		// Sorting a Stream by age and name fields
		List<Employee> map18 = empList.stream().sorted((a, b) -> a.getName().compareTo(b.getName()))
				.sorted((a, b) -> a.getAge() - b.getAge()).collect(Collectors.toList());
		// System.out.println(map18);

		// Highest experienced employees in the organization
		Employee map19 = empList.stream().sorted((a, b) -> a.getYearOfJoining() - b.getYearOfJoining()).findFirst()
				.get();
		// System.out.println(map19);

		// Print average and total salary of the organization.
		double totalSalary_map20 = empList.stream().collect(Collectors.summingDouble(e -> e.getSalary()));
		double averageSalary_map21 = empList.stream().collect(Collectors.averagingDouble(e -> e.getSalary()));
//		System.out.println("totalSalary_map20 :" + totalSalary_map20);
//		System.out.println("averageSalary_map21 :" + averageSalary_map21);

		// Print Average salary of each department
		Map<Object, Double> map22 = empList.stream()
				.collect(Collectors.groupingBy(e -> e.getDeptName(), Collectors.averagingLong(e -> e.getSalary())));
		// System.out.println(map22);

		// Find Highest salary in the organisation
		Employee map23 = empList.stream().sorted((a, b) -> ((Long) b.getSalary()).compareTo(a.getSalary())).findFirst()
				.get();
		// System.out.println(map23);

		// Find Second Highest salary in the organisation
		Employee map24 = empList.stream().sorted((a, b) -> ((Long) b.getSalary()).compareTo(a.getSalary())).skip(1)
				.findFirst().get();
		// System.out.println(map24);

		// Find highest paid salary in the organisation based on gender
		Map<Object, Object> map25 = empList.stream()
				.collect(Collectors.groupingBy(e -> e.getDeptName(),
						Collectors.collectingAndThen(Collectors.toList(), e -> e.stream()
								.sorted((a, b) -> ((Long) b.getSalary()).compareTo(a.getSalary())).findFirst().get())));
		// System.out.println(map25);

		// sort the employees salary in the organisation in ascending order
		List<Employee> map26 = empList.stream().sorted(Comparator.comparing(Employee::getSalary))
				.collect(Collectors.toList());
		// System.out.println(map26);

		// Print list of employee's second highest salary based on department
		Map<String, Employee> map27 = empList.stream()
				.collect(Collectors.groupingBy(e -> e.getDeptName(),
						Collectors.collectingAndThen(Collectors.toList(),
								e -> e.stream().sorted((a, b) -> ((Long) b.getSalary()).compareTo(a.getSalary()))
										.skip(1).findFirst()
										.orElse(null))));
		System.out.println(map27);
	}
}
