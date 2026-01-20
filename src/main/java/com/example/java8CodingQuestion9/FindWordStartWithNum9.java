package com.example.java8CodingQuestion9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindWordStartWithNum9 {
	public static void main(String[] args) {
		String[] strArray = { "8java", "java", "9Python", "4Mysql", "Oracle" };
		List<String> result = Arrays.stream(strArray).filter(e -> Character.isDigit(e.charAt(0)))
				.collect(Collectors.toList());
		System.out.println(result);
	}
}
