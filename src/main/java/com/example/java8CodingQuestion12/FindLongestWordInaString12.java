package com.example.java8CodingQuestion12;

import java.util.Arrays;

public class FindLongestWordInaString12 {
	public static void main(String[] args) {
		String str = "Good Morning Developer";
		String longestStr = Arrays.stream(str.split(" ")).reduce(" ", (a, b) -> a.length() > b.length() ? a : b);
		System.out.println(longestStr);
	}
}
