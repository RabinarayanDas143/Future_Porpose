package com.example.java8CodingQuestion10;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindFirstAndLast3Number10 {
	public static void main(String[] args) {
		List<Integer> list = Stream.iterate(1, n -> n + 1).limit(10).collect(Collectors.toList());
		List<Integer> first3Char = list.stream().limit(3).collect(Collectors.toList());
		List<Integer> last3Char = list.stream().sorted((a, b) -> b - a).limit(3).collect(Collectors.toList());
		System.out.println("first3Char :" + first3Char);
		System.out.println("last3Char :" + last3Char);
	}
}
