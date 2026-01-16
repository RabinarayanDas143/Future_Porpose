package com.example.java8CodingQuestion8;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindFirstAndLast3Number8 {
	public static void main(String[] args) {
		List<Integer> list = Stream.iterate(1, n -> n + 1).limit(10).collect(Collectors.toList());
		List<Integer> first3Element = list.stream().limit(3).collect(Collectors.toList());
		List<Integer> last3Element = list.stream().sorted((a, b) -> b - a).limit(3).collect(Collectors.toList());

		System.out.println(first3Element);
		System.out.println(last3Element);
	}
}
