package com.example.java8CodingQuestion14;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfStringToListOfChar14 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Java", "Python", "React");
		List<Character> list1 = list.stream().flatMap(e -> e.chars().mapToObj(c -> (char) c))
				.collect(Collectors.toList());
		System.out.println(list1);
	}
}
