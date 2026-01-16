package com.example.java8CodingQuestion8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import ch.qos.logback.core.model.Model;

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

public class OperationUsingModelClass8 {
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
		// map1.forEach((a, b) -> System.out.println(a + " " + b));

		// Group Employees by age
		Map<Object, Long> map2 = empList.stream()
				.collect(Collectors.groupingBy(e -> e.getAge(), Collectors.counting()));
		// map2.forEach((a,b)->System.out.println(a+" "+b));

		// Find the count of male and female employees present in the organization
		Map<String, Long> map3 = empList.stream()
				.collect(Collectors.groupingBy(e -> e.getGender(), Collectors.counting()));
		// map3.forEach((a, b) -> System.out.println(a + " " + b));

		// Print the names of all departments in the organization
		List<String> map4 = empList.stream().map(e -> e.getDeptName()).distinct().collect(Collectors.toList());
		// System.out.println(map4);

		// print employee details whose age is greater than 28
		List<ModelClass> map5 = empList.stream().filter(e -> e.getAge() > 28).collect(Collectors.toList());
		// System.out.println(map5);

		// find maximum age of employee
		ModelClass map6 = empList.stream().sorted((a, b) -> b.getAge() - a.getAge()).findFirst().get();
		// System.out.println(map6);

		// Print Average age of Male and Female Employees
		Map<Object, Double> map7 = empList.stream()
				.collect(Collectors.groupingBy(e -> e.getGender(), Collectors.averagingLong(e -> e.getAge())));
		// System.out.println(map7);

		// Print the number of employees in each department.
		Map<String, Long> map8 = empList.stream()
				.collect(Collectors.groupingBy(e -> e.getDeptName(), Collectors.counting()));
		// System.out.println(map8);

		// Find oldest employee
		ModelClass map9 = empList.stream().sorted((a, b) -> b.getYearOfJoining() - a.getYearOfJoining()).findFirst()
				.get();
		// System.out.println(map9);

		// Find youngest female employee
		ModelClass map10 = empList.stream().filter(e -> e.getGender().equalsIgnoreCase("F"))
				.sorted((a, b) -> a.getAge() - b.getAge()).findFirst().get();
		// System.out.println(map10);

		// Find employees whose age is greater than 30 and less than 30
		List<ModelClass> map11_Grater30 = empList.stream().filter(e -> e.getAge() > 30).collect(Collectors.toList());
		// System.out.println(map11_Grater30);

		List<ModelClass> map12_Less30 = empList.stream().filter(e -> e.getAge() < 30).collect(Collectors.toList());
		// System.out.println(map11_Less30);

		// Find the department name which has the highest number of employees
		Entry<String, Long> map13 = empList.stream()
				.collect(Collectors.groupingBy(e -> e.getDeptName(), Collectors.counting())).entrySet().stream()
				.sorted((a, b) -> b.getValue().compareTo(a.getValue())).findFirst().get();
		// System.out.println(map13);

		// Find if there any employees from HR Department
		ModelClass map14 = empList.stream().filter(e -> e.getDeptName().equalsIgnoreCase("HR")).findAny().get();
		// System.out.println(map14);

		// Find the department names where the number of employees in the department is
		// over 3
		List<Entry<String, Long>> map15 = empList.stream()
				.collect(Collectors.groupingBy(e -> e.getDeptName(), Collectors.counting())).entrySet().stream()
				.filter(e -> e.getValue() > 3).collect(Collectors.toList());
		// System.out.println(map15);

		// Find distinct department names that employees work for.
		List<String> map16 = empList.stream().map(e -> e.getDeptName()).distinct().collect(Collectors.toList());
		// System.out.println(map16);

		// Find all employees who lives in ‘Blore’ city, sort them by their name and
		// print the names of employees.
		List<ModelClass> map17 = empList.stream().filter(e -> e.getCity().equalsIgnoreCase("Blore"))
				.sorted((a, b) -> a.getName().compareTo(b.getName())).collect(Collectors.toList());
		// System.out.println(map17);

		// No of employees in the organisation
		Long map18 = empList.stream().count();
		// System.out.println(map18);

		// Find employee count in every department
		Map<String, Long> map19 = empList.stream()
				.collect(Collectors.groupingBy(e -> e.getDeptName(), Collectors.counting()));
		// System.out.println(map19);

		// Find the department which has the highest number of employees.
		Entry<String, Long> map20 = empList.stream()
				.collect(Collectors.groupingBy(e -> e.getDeptName(), Collectors.counting())).entrySet().stream()
				.sorted((a, b) -> b.getValue().compareTo(a.getValue())).findFirst().get();
		// System.out.println(map20);

		// Sorting a Stream by age and name fields
		List<ModelClass> map21 = empList.stream().sorted((a, b) -> a.getName().compareTo(b.getName()))
				.sorted((a, b) -> a.getAge() - b.getAge()).collect(Collectors.toList());
		// System.out.println(map21);

		// Highest experienced employees in the organization
		ModelClass map22 = empList.stream().sorted((a, b) -> b.getYearOfJoining() - a.getYearOfJoining()).findFirst()
				.get();
		// System.out.println(map22);

		// Print average and total salary of the organization.
		Double map23_averageSalary = empList.stream().collect(Collectors.averagingDouble(e -> e.getSalary()));
		// System.out.println(map23_averageSalary);

		Double map24_sumSalary = empList.stream().collect(Collectors.summingDouble(e -> e.getSalary()));
		// System.out.println(map24_sumSalary);

		// Print Average salary of each department
		Map<Object, Double> map25 = empList.stream()
				.collect(Collectors.groupingBy(e -> e.getDeptName(), Collectors.averagingDouble(e -> e.getSalary())));
		// System.out.println(map25);

		// Find Highest salary in the organisation
		ModelClass map26 = empList.stream().sorted((a, b) -> ((Long) b.getSalary()).compareTo(a.getSalary()))
				.findFirst().get();
		// System.out.println(map26);

		ModelClass map27 = empList.stream().max(Comparator.comparingLong(e -> e.getSalary())).get();
		// System.out.println(map27);

		int map28 = empList.stream().map(e -> e.getSalary()).mapToInt(e -> e.intValue()).reduce(0,
				(a, b) -> a > b ? a : b);
		// System.out.println(map28);

		// Find Second Highest salary in the organisation
		ModelClass map29 = empList.stream().sorted((a, b) -> ((Long) b.getSalary()).compareTo(a.getSalary())).skip(1)
				.findFirst().get();
		// System.out.println(map29);

		// Nth Highest salary
		int Nth = 3;
		ModelClass map30 = empList.stream().sorted((a, b) -> ((Long) b.getSalary()).compareTo(a.getSalary()))
				.skip(Nth - 1).findFirst().get();
		// System.out.println(map30);

		// Find highest paid salary in the organisation based on gender
		Map<Object, Object> map31 = empList.stream()
				.collect(Collectors.groupingBy(e -> e.getGender(),
						Collectors.collectingAndThen(Collectors.toList(), e -> e.stream()
								.sorted((a, b) -> ((Long) b.getSalary()).compareTo(a.getSalary())).findFirst().get())));
		// System.out.println(map31);

		// Find lowest paid salary in the organisation based in the gender
		Map<Object, Object> map32 = empList.stream()
				.collect(Collectors.groupingBy(e -> e.getGender(),
						Collectors.collectingAndThen(Collectors.toList(), e -> e.stream()
								.sorted((a, b) -> ((Long) a.getSalary()).compareTo(b.getSalary())).findFirst().get())));
		// System.out.println(map32);

		// sort the employees salary in the organisation in ascending order
		List<Long> map33 = empList.stream().map(e -> e.getSalary()).sorted((a, b) -> ((Long) a).compareTo(b))
				.collect(Collectors.toList());
		// System.out.println(map33);

		// sort the employees salary in the organisation in descending order
		List<Long> map34 = empList.stream().map(e -> e.getSalary()).sorted((a, b) -> ((Long) b).compareTo(a))
				.collect(Collectors.toList());
		// System.out.println(map34);

		// Highest salary based on department
		Map<Object, Object> map35 = empList.stream()
				.collect(Collectors.groupingBy(e -> e.getDeptName(),
						Collectors.collectingAndThen(Collectors.toList(), e -> e.stream()
								.sorted((a, b) -> ((Long) b.getSalary()).compareTo(a.getSalary())).findFirst().get())));
		// System.out.println(map35);

		// Print list of employee's second highest salary based on department
		Map<Object, Object> map36 = empList.stream()
				.collect(Collectors.groupingBy(e -> e.getDeptName(),
						Collectors.collectingAndThen(Collectors.toList(),
								e -> e.stream().sorted((a, b) -> ((Long) b.getSalary()).compareTo(a.getSalary()))
										.skip(1).findFirst().get())));
		// System.out.println(map36);

		// sort the employees salary in each department in ascending order
		Map<String, List<ModelClass>> map37 = empList.stream().collect(
				Collectors.groupingBy(e -> e.getDeptName(), Collectors.collectingAndThen(Collectors.toList(), e -> e
						.stream().sorted(Comparator.comparingLong(a -> a.getSalary())).collect(Collectors.toList()))));
		// System.out.println(map37);
		map37.forEach((a, b) -> System.out.println(a + "  " + b));

	}
}
