package com.example.java8CodingQuestion13;

import java.util.Arrays;

public class FindLongestStringFromList13 {
	public static void main(String[] args) {
		String[] array = { "Java", "React", "SpringBoot", "Microservice" };
		String longeststr = Arrays.stream(array).reduce(" ", (a, b) -> a.length() > b.length() ? a : b);
		System.out.println(longeststr);
	}
}
