package com.example.InterviewCoding24;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfEachChar24 {
	public static void main(String[] args) {
		String str = "Rabinarayan Das";
		Map<Character, Integer> map = new HashMap<>();
		for (char c : str.toCharArray()) {
			if (map.containsKey(c))
				map.put(c, map.get(c) + 1);
			else
				map.put(c, 1);
		}
		System.out.println(map);
	}
}
