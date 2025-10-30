package com.example.java8CodingQuestion7;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SumOfAllDigists7 {

	public static void main(String[] args) {
		String str = "123";
		int num = Arrays.stream(str.split("")).collect(Collectors.summingInt(e->Integer.parseInt(e)));
		System.out.println(num);
		
		int num1 = Arrays.stream(str.split("")).map(e->Integer.parseInt(e)).reduce(0, (a,b)->a+b);
		System.out.println(num1);
	}

}
