package com.example.InterviewCoding19;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class FrequencyOfEachChar19 {
	public static void main(String[] args) {
		String str = "Rabinarayan Das";
		Map<Character, Integer> map = new HashMap<>();
//		for (int i = 0; i < str.length(); i++) {
//			char c = str.charAt(i);
//			if (map.containsKey(c))
//				map.put(c, map.get(c) + 1);
//			else
//				map.put(c, 1);
//		}
//		for (Entry<Character, Integer> entry : map.entrySet()) {
//			System.out.println(entry.getKey() + " == " + entry.getValue());
//		}
		
		List<Character> list = str.chars().mapToObj(e->(char)e).collect(Collectors.toList());
		for(char c : list) {
			map.putIfAbsent(c, Collections.frequency(list, c));
		}
	}
}
