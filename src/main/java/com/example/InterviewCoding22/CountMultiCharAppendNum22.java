package com.example.InterviewCoding22;

public class CountMultiCharAppendNum22 {
	public static void main(String[] args) {
		String str = "HelloAcccentuuuure"; // o/p - He2oA3ent4re

		StringBuilder sb = new StringBuilder();
		int count = 1;

		for (int i = 0; i < str.length(); i++) {
			while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
				count++;
				i++;
			}

			if (count > 1) {
				sb.append(count);
			} else {
				sb.append(str.charAt(i));
			}
			count = 1;
		}
		System.out.println(sb.toString());
	}
}
