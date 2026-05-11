package com.example.InterviewCoding21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyOfEachChar21 {
	public static void main(String[] args) {
		String str = "Rabinarayan Das";
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			if (map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
			} else {
				map.put(str.charAt(i), 1);
			}
		}
		System.out.println(map);

		Map<Character, Integer> map1 = new HashMap<>();
		List<Character> list = new ArrayList<>();
		for (char c : str.toCharArray()) {
			list.add(c);
		}

		for (int i = 0; i < str.length(); i++) {
			map.putIfAbsent(str.charAt(i), Collections.frequency(list, str.charAt(i)));
		}
		System.out.println(map);
	}
}
