package com.example.java8CodingQuestion13;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindFirst10EvenOddNumber13 {
	public static void main(String[] args) {
		List<Integer> EvenNumFrom10 = IntStream.iterate(0, n -> n + 1).limit(10).filter(e -> e % 2 == 0).boxed()
				.collect(Collectors.toList());
		List<Integer> oddNumberfrom10 = IntStream.iterate(0, n -> n + 1).limit(10).boxed().filter(e -> e % 2 != 0)
				.collect(Collectors.toList());
		System.out.println("EvenNumFrom10 :" + EvenNumFrom10);
		System.out.println("oddNumberfrom10 :" + oddNumberfrom10);
	}
}
