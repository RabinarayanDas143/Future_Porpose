package com.example.java8CodingQuestion11;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindFirstAndLast3Number11 {
	public static void main(String[] args) {
		List<Integer> first3Number = Stream.iterate(1, n -> n + 1).limit(10).sorted().limit(3)
				.collect(Collectors.toList());
		List<Integer> last3Number = Stream.iterate(1, n -> n + 1).limit(10).sorted((a, b) -> b - a).limit(3)
				.collect(Collectors.toList());
		System.out.println("first3Number :" + first3Number);
		System.out.println("last3Number :" + last3Number);
	}
}
