package com.example.java8CodingQuestion15;

import java.util.Arrays;

public class FindLongestStringFromList15 {
	public static void main(String[] args) {
		String[] array = { "Java", "React", "SpringBoot", "Microservice" };
		String str = Arrays.stream(array).reduce("", (a, b) -> a.length() > b.length() ? a : b);
		System.out.println(str);
	}
}
