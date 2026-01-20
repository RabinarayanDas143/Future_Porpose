package com.example.java8CodingQuestion9;

import java.util.Arrays;

public class SumOfAllDigists9 {
public static void main(String[] args) {
	String str = "123";
	int sum = Arrays.stream(str.split("")).mapToInt(e->Integer.parseInt(e)).sum();
	System.out.println(sum);
}
}
