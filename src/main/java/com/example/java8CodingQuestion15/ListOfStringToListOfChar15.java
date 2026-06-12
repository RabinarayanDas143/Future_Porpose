package com.example.java8CodingQuestion15;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfStringToListOfChar15 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Java", "Python", "React");
		List<Character> listChar = list.stream().flatMap(e -> e.chars().mapToObj(c -> (char) c))
				.collect(Collectors.toList());
		System.out.println(listChar);
		
		List<List<String>> nestedList = Arrays.asList(
			    Arrays.asList("Alice", "Bob"),
			    Arrays.asList("Charlie", "David")
			      );
		nestedList.stream().flatMap(e->e.stream()).collect(Collectors.toList()).forEach(System.out::println);;
	}
}
