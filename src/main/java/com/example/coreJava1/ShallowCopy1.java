package com.example.coreJava1;

import java.util.ArrayList;
import java.util.List;

public class ShallowCopy1 implements Cloneable{
	private int id;
	private String name;
	private List<String> course;
	public ShallowCopy1(int id, String name, List<String> course) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
	}
	@Override
	public String toString() {
		return "ShallowCopy1 [id=" + id + ", name=" + name + ", course=" + course + "]";
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
	public List<String> getCourse() {
		return course;
	}
	public void setCourse(List<String> course) {
		this.course = course;
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		
		ShallowCopy1 s1 = new ShallowCopy1(1, "Rabi", list);
		ShallowCopy1 s2 = (ShallowCopy1)s1.clone();
		
		System.out.println(s1);
		System.out.println(s2);
		
		s2.getCourse().set(0, "C");
		
		System.out.println(s1);
		System.out.println(s2);
	}
}
