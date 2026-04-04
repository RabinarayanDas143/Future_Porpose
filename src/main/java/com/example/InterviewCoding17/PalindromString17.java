package com.example.InterviewCoding17;

public class PalindromString17 {
public static void main(String[] args) {
	String str = "Level";
	StringBuilder sb = new StringBuilder();
	for(int i = str.length()-1;i>=0;i--) {
		sb.append(str.charAt(i));
	}
	if(str.toLowerCase().equalsIgnoreCase(sb.toString()))
		System.out.println("Given String is Annagram...");
	else
		System.out.println("Given String is not Annagram..");
}
}
