package com.example.InterviewCoding20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyOfEachChar20 {
	public static void main(String[] args) {
		String str = "Rabinarayan Das";
		Map<Character, Integer> map = new HashMap<>();
		char[] array = str.toCharArray();
//		for (int i = 0; i < array.length; i++) {
//			char ch = array[i];
//			if (map.containsKey(ch))
//				map.put(ch, map.get(ch) + 1);
//			else
//				map.put(ch, 1);
//		}
//		System.out.println(map);

		List<Character> list = new ArrayList<>();
		for (char c : array) {
			list.add(c);
		}
		for (char c : list) {
			map.putIfAbsent(c, Collections.frequency(list, c));
		}
		
		System.out.println(map);
	}
}
