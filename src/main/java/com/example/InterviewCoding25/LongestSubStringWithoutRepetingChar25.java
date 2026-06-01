package com.example.InterviewCoding25;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWithoutRepetingChar25 {
	public static void main(String[] args) {
		String str = "abcabcbb";
		Set<Character> set = new HashSet<>();
		int left = 0, minLength = Integer.MIN_VALUE, start = 0;
		for (int i = 0; i < str.length(); i++) {
			while (set.contains(str.charAt(i))) {
				set.remove(str.charAt(i));
				left++;
			}

			set.add(str.charAt(i));
			if (i - left + 1 > minLength) {
				minLength = i - left + 1;
				start = left;
			}
		}

		System.out.println("Sub string is :" + str.substring(start, start + minLength));
	}
}
