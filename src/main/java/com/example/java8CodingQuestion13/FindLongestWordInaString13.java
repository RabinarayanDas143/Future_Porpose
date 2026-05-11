package com.example.java8CodingQuestion13;

import java.util.Arrays;

public class FindLongestWordInaString13 {
	public static void main(String[] args) {
		String str = "I am a Java Developer";
		String longestStr = Arrays.stream(str.split(" ")).reduce(" ", (a, b) -> a.length() > b.length() ? a : b);
		System.out.println(longestStr);
	}
}
