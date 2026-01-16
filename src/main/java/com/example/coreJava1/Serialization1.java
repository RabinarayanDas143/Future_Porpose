package com.example.coreJava1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization1 implements Serializable{
	private int id;
	private String name;
	private String address;

	public Serialization1(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Serialization1 [id=" + id + ", name=" + name + ", address=" + address + "]";
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public static void main(String[] args) throws IOException {
		try {
			Serialization1 s = new Serialization1(1, "Rabi", "Odisha");
			FileOutputStream fos = new FileOutputStream("C:/Users/user/Desktop/Rabi.txt");
			ObjectOutputStream obj = new ObjectOutputStream(fos);
			obj.writeObject(s);
			fos.close();
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
