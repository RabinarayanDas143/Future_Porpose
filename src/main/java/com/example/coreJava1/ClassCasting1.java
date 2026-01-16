package com.example.coreJava1;

class A {
	void method() {
		System.out.println("A class");
	}
}

class B extends A{
	void method() {
		System.out.println("B class");
	}
}

public class ClassCasting1 {
	public static void main(String[] args) {
         A obj = new B();
         obj.method();
         
         B obj1 = (B) obj;
         obj1.method();
	}
}
