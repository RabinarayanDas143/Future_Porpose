package com.example.InterviewCoding25;

public class StringCompression25 {
	public static void main(String[] args) {
		String str = "aabbbcccc";
		int count = 1;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			while (i < str.length()-1 && str.charAt(i) == str.charAt(i + 1)) {
				count++;
				i++;
			}
			sb.append(str.charAt(i));
			sb.append(count);
			count = 1;
		}
		System.out.println(sb.toString());
	}
}
