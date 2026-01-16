package com.example.java8CodingQuestion8;

import java.util.Arrays;

public class FindLongestWordInaString {
public static void main(String[] args) {
	String str = "Good Morning Rabinarayan";
	String result = Arrays.stream(str.split(" ")).reduce(" ", (a,b)->a.length()>b.length()?a:b);
	System.out.println(result);
}
}
