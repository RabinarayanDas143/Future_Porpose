package com.example.java8CodingQuestion11;

import java.util.Arrays;

public class FindLongestWordInaString11 {
public static void main(String[] args) {
	String str = "Good Morning Developer";
	String result = Arrays.stream(str.split(" ")).reduce("", (a,b)->a.length()>b.length()?a:b);
	System.out.println(result);
}
}
