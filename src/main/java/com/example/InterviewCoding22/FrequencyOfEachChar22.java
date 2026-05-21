package com.example.InterviewCoding22;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfEachChar22 {
	public static void main(String[] args) {
		String str = "Rabinarayan Das";
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (map.containsKey(c))
				map.put(c, map.get(c) + 1);
			else
				map.put(c, 1);
			
		}
		System.out.println(map);
	}
}
