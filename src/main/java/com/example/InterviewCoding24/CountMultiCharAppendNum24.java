package com.example.InterviewCoding24;

public class CountMultiCharAppendNum24 {
	public static void main(String[] args) {
		String str = "RaabiiiiD";
		int count = 1;
		StringBuilder sb =new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			while (i < str.length()-1 && str.charAt(i) == str.charAt(i + 1)) {
				count++;
				i++;
			}
			
			if(count>1)
				sb.append(count);
			else
				sb.append(str.charAt(i));
			
			count=1;
		}
		System.out.println(sb.toString());
	}
}
