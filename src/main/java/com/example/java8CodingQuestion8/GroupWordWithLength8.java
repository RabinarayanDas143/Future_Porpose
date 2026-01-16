package com.example.java8CodingQuestion8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupWordWithLength8 {
public static void main(String[] args) {
	List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
	Map<Object, Object> map = names.stream().collect(Collectors.toMap(e->e, e->e.length()));
	map.forEach((a,b)->System.out.println(a+"  "+b));
}
}
