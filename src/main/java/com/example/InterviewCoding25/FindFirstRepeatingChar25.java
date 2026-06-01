package com.example.InterviewCoding25;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindFirstRepeatingChar25 {
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
		for (Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println("First Repeting char :" + entry.getKey());
				break;
			}
		}
	}
}
