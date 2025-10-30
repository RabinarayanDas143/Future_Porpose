package com.example.java8CodingQuestion7;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindFirst10EvenOddNumber7 {
	public static void main(String[] args) {
		List<Integer> list = Stream.iterate(1, n -> n + 1).limit(10).collect(Collectors.toList());
		List<Integer> evenNo = list.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
		List<Integer> oddNo = list.stream().filter(e -> e % 2 != 0).collect(Collectors.toList());

		System.out.println("First even no is :" + evenNo);
		System.out.println("First odd no is :" + oddNo);
	}
}
