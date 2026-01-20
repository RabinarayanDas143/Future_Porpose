package com.example.java8CodingQuestion9;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachWord9 {
	public static void main(String[] args) {
		String[] array = { "java", "React", "java", "python", "Mysql", "React" };
		Map<String, Long> map = Arrays.stream(array).collect(Collectors.groupingBy(e -> e, Collectors.counting()));
		System.out.println(map);
	}
}
