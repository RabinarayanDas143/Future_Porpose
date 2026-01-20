package com.example.java8CodingQuestion9;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupWordWithLength9 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
		Map<Object, Object> map = names.stream().collect(Collectors.toMap(e -> e, e -> e.length()));
		System.out.println(map);
	}
}
