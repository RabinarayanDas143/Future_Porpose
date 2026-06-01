package com.example.InterviewCoding24;

import java.util.HashMap;
import java.util.Map;

public class FindFirstRepeatingChar24 {
	public static void main(String[] args) {
		String str = "Rabinarayan Das";
		Map<Character, Integer> map = new HashMap<>();
		for (char c : str.toCharArray()) {
			if (map.containsKey(c)) {
				System.out.println("First repeting char is :" + c);
				break;
			} else {
				map.put(c, 1);
			}
		}
	}
}
