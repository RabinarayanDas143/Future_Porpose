package com.example.InterviewCoding21;

import java.util.HashMap;
import java.util.Map;

public class FindFirstRepeatingChar21 {
	public static void main(String[] args) {
		String str = "Rabinarayan Das";
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			if (map.containsKey(str.charAt(i))) {
				System.out.println("First char is :" + str.charAt(i));
				break;
			} else {
				map.put(str.charAt(i), 1);
			}
		}
	}
}
