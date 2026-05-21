package com.example.InterviewCoding23;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWithoutRepetingChar23 {
	public static void main(String[] args) {
		String str = "abcabcbb";

		Set<Character> set = new HashSet<>();

		int max = 0;
		int i = 0;
		int startIndex = 0;

		for (int j = 0; j < str.length(); j++) {
			while (set.contains(str.charAt(j))) {
				set.remove(str.charAt(i));
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
