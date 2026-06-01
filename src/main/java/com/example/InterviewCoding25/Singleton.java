package com.example.InterviewCoding25;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Singleton implements Serializable {

	private static final long serialVersionUID = 1L;

	private static volatile Singleton obj;

	private Singleton() {
		if (obj != null) {
			throw new RuntimeException("Exception Occured..");
		}
	};

	public static Singleton getInstance() {
		if (obj == null) {
			synchronized (Singleton.class) {
				if (obj == null) {
					obj = new Singleton();
				}
			}
		}
		return obj;
	}

	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("Singleton can not be cloned");
	}

	private Object readResolve() {
		return getInstance();
	}

	public static void main(String[] args) throws Exception {
		Singleton obj1 = getInstance();
		System.out.println("obj1 hashcode" + obj1.hashCode());

		FileOutputStream fis = new FileOutputStream("C:/Users/user/Desktop/Rabi.txt");
		ObjectOutputStream ob = new ObjectOutputStream(fis);
		ob.writeObject(obj1);
		fis.close();
		ob.close();

		System.out.println("Serilaization complete..");

		FileInputStream fis1 = new FileInputStream("C:/Users/user/Desktop/Rabi.txt");
		ObjectInputStream ob1 = new ObjectInputStream(fis1);
		Singleton obj2 = (Singleton) ob1.readObject();
		System.out.println("obj2 hashcode" + obj2.hashCode());

		Singleton obj3 = (Singleton) obj2.clone();
		System.out.println("obj3 hashcode :" + obj3.hashCode());
	}
}
