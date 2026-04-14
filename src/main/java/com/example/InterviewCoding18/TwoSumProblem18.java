package com.example.InterviewCoding18;

import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem18 {
	public static void main(String[] args) {
        int[] array = {5,1,4,2,3};
        int target = 5;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<array.length;i++) {
        	int need = target-array[i];
        	if(map.containsKey(need)) {
        		System.out.println("Two num is :"+need+", "+array[i]);
        	}else {
        		map.put(array[i], 1);
        	}
        }
	}
}
