package com.example.InterviewCoding19;

import java.util.HashMap;
import java.util.Map;

public class FindFirstRepeatingChar19 {
	public static void main(String[] args) {
		String str = "Rabinarayan Das";
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			if (map.containsKey(str.charAt(i))) {
				System.out.println("First Repeting Character is :" + str.charAt(i));
				break;
			}    
			else {
				map.put(str.charAt(i), 1);
			}
		}
	}
}
