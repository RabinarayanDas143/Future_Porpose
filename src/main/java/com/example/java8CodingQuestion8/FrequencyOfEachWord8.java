package com.example.java8CodingQuestion8;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachWord8 {
	public static void main(String[] args) {
		String[] array = { "java", "React", "java", "python", "Mysql", "React" };
		Map<String, Long> map = Arrays.stream(array)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		map.forEach((a, b) -> System.out.println(a + " " + b));
	}
}
