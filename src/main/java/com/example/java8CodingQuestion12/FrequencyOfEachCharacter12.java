package com.example.java8CodingQuestion12;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyOfEachCharacter12 {
	public static void main(String[] args) {
		String str = "Rabinarayan Das";
		Map<Object, Long> map = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(e -> e, Collectors.counting()));
		System.out.println(map);
	}
}
