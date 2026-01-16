package com.example.InterviewCoding12;

public class Next5Char12 {
public static void main(String[] args) {
	char ch = 'b';
	for(int i=1;i<=5;i++) {
		char c=(char) (ch+i);
		System.out.print(c+",");
	}
}
}
