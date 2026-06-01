package com.example.InterviewCoding24;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWithoutRepetingChar24 {
	public static void main(String[] args) {
		String str = "abcabcbb";
		int max = 0, i = 0, startIndex = 0;
		Set<Character> set = new HashSet<>();
		for (int j = 0; j < str.length(); j++) {
			while (set.contains(str.charAt(j))) {
				set.remove(str.charAt(j));
				i++;
			}

			set.add(str.charAt(j));
			if (j - i + 1 > max) {
				max = j - i + 1;
				startIndex = i;
			}
		}
		System.out.println(max);
		System.out.println("Substring is :"+str.substring(startIndex,startIndex+max));
	}
}
