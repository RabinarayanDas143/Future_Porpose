package com.example.java8CodingQuestion8;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FindWordStartWithNum8 {
	public static void main(String[] args) {
		String[] strArray = { "8java", "java", "9Python", "4Mysql", "Oracle" };
		Object[] result = Arrays.stream(strArray).filter(e -> Character.isDigit(e.charAt(0)))
				.collect(Collectors.toList()).stream().map(e -> e.toString()).toArray();
		System.out.println(Arrays.toString(result));
	}
}
