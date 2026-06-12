package com.example.java8CodingQuestion15;

import java.util.Arrays;

public class FindLongestWordFromaString15 {
	public static void main(String[] args) {
		String str = "I am a Java Developer";
		String res = Arrays.stream(str.split(" ")).reduce("", (a, b) -> a.length() > b.length() ? a : b);
		System.out.println(res);
	}
}
