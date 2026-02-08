package com.example.java8CodingQuestion9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfStringToListOfChar {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Java", "Python", "React");
		List<Character> charList = list.stream().flatMap(e -> e.chars().mapToObj(a -> (char) a))
				.collect(Collectors.toList());
		System.out.println(charList);
	}
}
