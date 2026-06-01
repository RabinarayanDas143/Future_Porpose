package com.example.java8CodingQuestion14;

import java.util.Arrays;

public class FindLongestStringFromList14 {
	public static void main(String[] args) {
		String[] array = { "Java", "React", "SpringBoot", "Microservice" };
		String str = Arrays.stream(array).reduce(" ", (a, b) -> a.length() > b.length() ? a : b);
		System.out.println(str);
	}
}
