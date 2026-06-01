package com.example.java8CodingQuestion14;

import java.util.Arrays;

public class FindLongestWordFromaString14 {
	public static void main(String[] args) {
		String str = "I am a Java Developer";
		String str1 = Arrays.stream(str.split(" ")).reduce(" ", (a, b) -> a.length() > b.length() ? a : b);
		System.out.println(str1);
	}
}
