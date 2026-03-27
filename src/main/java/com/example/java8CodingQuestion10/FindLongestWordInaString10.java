package com.example.java8CodingQuestion10;

import java.util.Arrays;

public class FindLongestWordInaString10 {
	public static void main(String[] args) {
		String str = "Good Morning Rabinarayan";
		String lonestStr = Arrays.stream(str.split(" ")).reduce(" ", (a,b)->a.length()>b.length()?a:b);
		System.out.println(lonestStr);
	}
}
