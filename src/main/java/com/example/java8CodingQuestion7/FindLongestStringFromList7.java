package com.example.java8CodingQuestion7;

import java.util.Arrays;
import java.util.List;

public class FindLongestStringFromList7 {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "pear", "pineapple");
		String longestString = words.stream().reduce(" ", (a,b)->a.length()>b.length()?a:b);
	}
}
