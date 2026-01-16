package com.example.coreJava1;

public class SingletonDesignPatternClone implements Cloneable{

	private static SingletonDesignPatternClone obj = null;

	public static SingletonDesignPatternClone getInstance() {
		if (obj == null) {
			synchronized (SingletonDesignPatternClone.class) {
				if (obj == null) {
					obj = new SingletonDesignPatternClone();
				}
			}
		}
		return obj;
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		SingletonDesignPatternClone obj = SingletonDesignPatternClone.getInstance();
		System.out.println(obj.hashCode());
		
		SingletonDesignPatternClone obj1 = (SingletonDesignPatternClone) obj.clone();
		System.out.println(obj1.hashCode());
	}
}
