package com.example.InterviewCoding26;

public class PalindromString26 {
public static void main(String[] args) {
	String str = "Level";
	StringBuilder sb = new StringBuilder();
	for(int i = str.toLowerCase().length()-1;i>=0;i--) {
		sb.append(str.charAt(i));
	}
	
	if(str.equalsIgnoreCase(sb.toString()))
		System.out.println("String string a palindrom");
	else {
		System.out.println("NOT");
	}
}
}
