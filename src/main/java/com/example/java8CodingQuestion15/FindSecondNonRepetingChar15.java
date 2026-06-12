package com.example.java8CodingQuestion15;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FindSecondNonRepetingChar15 {
	public static void main(String[] args) {
		String str = "RabinarayanDas";
		String c1 = Arrays.stream(str.split("")).collect(Collectors.groupingBy(e -> e, Collectors.counting())).entrySet()
				.stream().filter(e -> e.getValue() == 1).skip(1).findFirst().map(m -> m.getKey()).get();
		System.out.println(c1);
	}
}
