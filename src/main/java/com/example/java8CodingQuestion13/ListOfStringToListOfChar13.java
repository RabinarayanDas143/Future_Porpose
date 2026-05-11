package com.example.java8CodingQuestion13;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfStringToListOfChar13 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Java", "Python", "React");
		List<Character> charList = list.stream().flatMap(e -> e.chars().mapToObj(c -> (char) c))
				.collect(Collectors.toList());
		System.out.println(charList);
		
		list.stream().flatMap(e -> e.chars().mapToObj(c -> (char) c)).forEach(e->System.out.println(e));
	}
}
