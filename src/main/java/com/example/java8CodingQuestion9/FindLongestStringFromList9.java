package com.example.java8CodingQuestion9;

import java.util.Arrays;
import java.util.List;

public class FindLongestStringFromList9 {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "pear", "pineapple");
		String str = words.stream().reduce(" ", (a,b)->a.length()>b.length()?a:b);
		System.out.println(str);
	}
}
