package com.example.coreJava1;

import java.io.FileInputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class Deserialization1 {
	public static void main(String[] args) {
		String path = "C:/Users/user/Desktop/Rabi.txt";
		try (FileInputStream fis = new FileInputStream(path); ObjectInput obj = new ObjectInputStream(fis)) {
			Serialization1 s = (Serialization1) obj.readObject();
			System.out.println(s);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
