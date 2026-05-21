package com.example.InterviewCoding23;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfEachChar23 {
	public static void main(String[] args) {
		String str = "Rabinatayan Das";
		Map<Character, Integer> map = new HashMap<>();
//		for (int i = 0; i < str.length(); i++) {
//			char c = str.charAt(i);
//			if (map.containsKey(c))
//				map.put(c, map.get(c)+1);
//			else
//				map.put(c, 1);
//		}
//		System.out.println(map);
		
		for(char c : str.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		System.out.println(map);
	}
}
