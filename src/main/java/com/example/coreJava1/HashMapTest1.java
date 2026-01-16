package com.example.coreJava1;

import java.util.HashMap;
import java.util.Objects;

public class HashMapTest1 {
	private int id;
	private String name;

	public HashMapTest1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "HashMapTest1 [id=" + id + ", name=" + name + "]";
	}
	
	

@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HashMapTest1 other = (HashMapTest1) obj;
		return id == other.id && Objects.equals(name, other.name);
	}

public static void main(String[] args) {
	HashMapTest1 hm = new HashMapTest1(1, "Rabi");
	HashMapTest1 hm1 = new HashMapTest1(1, "Rabi");
	
	HashMap<Object, String> obj = new HashMap<>();
	obj.put(hm, "ABC");
	obj.put(hm1, "CDE");
	
	System.out.println(obj.size());
}
}
