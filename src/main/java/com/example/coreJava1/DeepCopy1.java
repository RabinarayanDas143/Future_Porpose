package com.example.coreJava1;

import java.util.ArrayList;
import java.util.List;

public class DeepCopy1 implements Cloneable{
	private int id;
	private String name;
	private List<String> list;

	public DeepCopy1(int id, String name, List<String> list) {
		super();
		this.id = id;
		this.name = name;
		this.list = list;
	}

	@Override
	public String toString() {
		return "DeepCopy1 [id=" + id + ", name=" + name + ", list=" + list + "]";
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

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}
	
	protected Object clone() throws CloneNotSupportedException {
		DeepCopy1 copy = (DeepCopy1) super.clone();
		copy.list=new ArrayList<>(this.list);
		return copy;	
	}
	
public static void main(String[] args) throws CloneNotSupportedException {
	List<String> list = new ArrayList<>();
	list.add("Cuttak");
	list.add("BBSR");
	
	DeepCopy1 d1 = new DeepCopy1(1, "Rabi", list);
	DeepCopy1 d2 = (DeepCopy1) d1.clone();
	
	System.out.println(d1);
	System.out.println(d2);
	
	d2.getList().set(0, "Puri");
	d2.getList().set(1, "BLSR");
	
	System.out.println(d1);
	System.out.println(d2);
}
}
