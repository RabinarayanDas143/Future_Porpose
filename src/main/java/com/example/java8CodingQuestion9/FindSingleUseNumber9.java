package com.example.java8CodingQuestion9;

import java.util.Arrays;

public class FindSingleUseNumber9 {
public static void main(String[] args) {
	int[] array = { 4, 1, 3, 2, 1, 2, 3 };
	int num = Arrays.stream(array).boxed().reduce(0, (a,b)->a^b);
	System.out.println(num);
}
}
