package com.example.java8CodingQuestion9;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindFirstAndLast3Number9 {
public static void main(String[] args) {
	List<Integer> list = Stream.iterate(1, n->n+1).limit(10).collect(Collectors.toList());
	List<Integer> first3Num = list.stream().limit(3).collect(Collectors.toList());
	List<Integer> last3Num = list.stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());
	System.out.println("first3Num :"+first3Num);
	System.out.println("last3Num :"+last3Num);
}
}
