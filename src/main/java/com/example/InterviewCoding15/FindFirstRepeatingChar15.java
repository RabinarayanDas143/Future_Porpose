package com.example.InterviewCoding15;

import java.util.HashMap;
import java.util.Map;

public class FindFirstRepeatingChar15 {
	public static void main(String[] args) {
		String str = "Rabinarayan Das";
		Map<Character, Long> map = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (map.containsKey(ch)) {
				System.out.println("First repeting character is " + ch);
				break;
			} else {
				map.put(ch, (long) 1);
			}
		}
	}
}
