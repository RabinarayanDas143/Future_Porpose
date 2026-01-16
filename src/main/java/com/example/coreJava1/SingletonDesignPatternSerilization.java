package com.example.coreJava1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SingletonDesignPatternSerilization implements Serializable{
	private int id;
	private String name;

	public SingletonDesignPatternSerilization(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public static void main(String[] args) throws Exception {
		SingletonDesignPatternSerilization obj = new SingletonDesignPatternSerilization(1, "Rabi");
		System.out.println(obj.hashCode());
		
		FileOutputStream fis = new FileOutputStream("C:/Users/user/Desktop/Rabi.txt");
		ObjectOutputStream os = new ObjectOutputStream(fis);
		os.writeObject(obj);
		os.close();
		fis.close();
		
		FileInputStream fos = new FileInputStream("C:/Users/user/Desktop/Rabi.txt");
		ObjectInputStream obs  = new ObjectInputStream(fos);
		
		SingletonDesignPatternSerilization obj1 = (SingletonDesignPatternSerilization) obs.readObject();
		System.out.println(obj1.hashCode());
		
	}
}
