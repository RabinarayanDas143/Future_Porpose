package com.example.java8CodingQuestion7;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FindWordStartWithNum7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArray = { "8java", "java", "9Python", "4Mysql", "Oracle" };
		Object[] array =  Arrays.stream(strArray).filter(e -> Character.isDigit(e.charAt(0)))
				.collect(Collectors.toList()).stream().map(e -> e.toString()).toArray();
		System.out.println(Arrays.toString(array));
	}

}
