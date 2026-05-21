package com.example.InterviewCoding23;

import java.util.HashMap;
import java.util.Map;

public class FindFirstNonRepeatingChar23 {
	public static void main(String[] args) {
		String str = "aabbcddeff";
		Map<Character, Integer> map = new HashMap<>();
		for (char c : str.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getValue()==1) {
				System.out.println("First non repeting char is :"+entry.getKey());
				break;
			}
		}
	}
}
