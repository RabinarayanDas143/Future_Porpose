package com.example.InterviewCoding26;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindFirstRepeatingChar26 {
	public static void main(String[] args) {
		String str = "Rabinarayan Das";
		Map<Character, Integer> map = new HashMap<>();
		for (char i : str.toCharArray()) {
			if (map.containsKey(i))
				map.put(i, map.get(i) + 1);
			else
				map.put(i, 1);
		}

		for (Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey());
				break;
			}
		}
	}
}
