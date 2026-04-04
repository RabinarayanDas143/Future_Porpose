package com.example.java8CodingQuestion11;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindFirst10EvenOddNumber11 {
	public static void main(String[] args) {
		List<Integer> evenNumer = Stream.iterate(1, n -> n + 1).limit(10).filter(e -> e % 2 == 0)
				.collect(Collectors.toList());
		List<Integer> oddNumber = Stream.iterate(1, n -> n + 1).limit(10).filter(e -> e % 2 != 0)
				.collect(Collectors.toList());

		System.out.println("evenNumer :" + evenNumer);
		System.out.println("oddNumber :" + oddNumber);
	}
}
