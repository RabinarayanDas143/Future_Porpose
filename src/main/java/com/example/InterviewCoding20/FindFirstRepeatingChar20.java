package com.example.InterviewCoding20;

import java.util.HashMap;
import java.util.Map;

public class FindFirstRepeatingChar20 {
	public static void main(String[] args) {
		String str = "Rabinarayan Das";
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			if (map.containsKey(str.charAt(i))) {
				System.out.println("First Repeating character is :" + str.charAt(i));
				break;
			} else {
				map.put(str.charAt(i), 1);
			}
		}
	}
}
