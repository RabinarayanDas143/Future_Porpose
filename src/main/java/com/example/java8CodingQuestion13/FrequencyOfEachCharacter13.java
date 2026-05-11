package com.example.java8CodingQuestion13;

import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyOfEachCharacter13 {
	public static void main(String[] args) {
		String str = "Rabinarayan Das";
		Map<Character, Long> map = str.chars().mapToObj(e -> (char) e)
				.collect(Collectors.groupingBy(e -> e, Collectors.counting()));
		System.out.println(map);
	}
}
