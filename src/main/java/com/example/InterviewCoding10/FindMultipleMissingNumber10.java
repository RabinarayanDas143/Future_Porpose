package com.example.InterviewCoding10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindMultipleMissingNumber10 {
public static void main(String[] args) {
	int[] array = {1,2,4,7,9,9,10};
	List<Integer> missing = getMissingNumberFromArray(array);
	System.out.println(missing);
}

private static List<Integer> getMissingNumberFromArray(int[] array) {
	int first = array[0];
	int last = array[array.length-1];
	List<Integer> list = Stream.iterate(first, n->n+1).limit(last).collect(Collectors.toList());
	Set<Integer> set = new HashSet<>();
	for(int i : array) {
		set.add(i);
	}
	List<Integer> result = new ArrayList<>();
	for(int i :list) {
		if(!set.contains(i)) {
			result.add(i);
		}
	}
	return result;
}
}
