package com.example.java8CodingQuestion9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateNumberFromArray9 {
public static void main(String[] args) {
	int[] array = { 1,2,3,4,5,3,4 };
	List<Integer> duplicate = new ArrayList<>();
	List<Integer> list = Arrays.stream(array).boxed()
			.filter(e -> duplicate.contains(e) ? duplicate.add(e) : !duplicate.add(e)).collect(Collectors.toList());
	System.out.println(list);
}
}
