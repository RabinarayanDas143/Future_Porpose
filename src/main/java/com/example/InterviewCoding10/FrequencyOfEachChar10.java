package com.example.InterviewCoding10;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfEachChar10 {
	public static void main(String[] args) {
		String str = "Rabinarayan Das";
		Map<Character, Integer> map = getFrequency(str);
		System.out.println(map);
	}

	private static Map<Character, Integer> getFrequency(String str) {
		Map<Character, Integer> map = new HashMap<>();
		char[] charArray = str.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (map.containsKey(charArray[i])) {
				map.put(charArray[i], map.get(charArray[i]) + 1);
			} else {
				map.put(charArray[i], 1);
			}
		}
		return map;
	}
}
