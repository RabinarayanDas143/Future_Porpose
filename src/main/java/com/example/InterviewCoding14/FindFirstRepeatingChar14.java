package com.example.InterviewCoding14;

import java.util.HashMap;
import java.util.Map;

public class FindFirstRepeatingChar14 {
	public static void main(String[] args) {
		String str = "Rabinarayan Das";
		Map<Character, Long> map = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (map.containsKey(ch)) {
				System.out.println("First repeating character is :" + ch);
				break;
			} else {
				map.put(ch, 1L);
			}
		}
	}
}
