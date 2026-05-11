package com.example.java8CodingQuestion13;

import java.util.Arrays;

public class FindSingleUseNumber13 {
public static void main(String[] args) {
	int[] array = {1,2,3,4,5,1,2,3,4};
	int num = Arrays.stream(array).reduce(0, (a,b)->a^b);
	System.out.println(num);
}
}
