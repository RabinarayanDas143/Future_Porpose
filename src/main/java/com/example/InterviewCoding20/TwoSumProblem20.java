package com.example.InterviewCoding20;

import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem20 {
public static void main(String[] args) {
	int [] array = {11,22,33,44,55};
	int target = 99;
	Map<Integer, Integer> map = new HashMap<>();
	for(int i=0;i<array.length;i++) {
		int need = target-array[i];
		if(map.containsKey(need))
			System.out.println("Two number is :"+need+" ,"+array[i]);
		else
			map.put(array[i], 1);
	}
}
}
