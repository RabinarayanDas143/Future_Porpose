package com.example.InterviewCoding15;

public class Next5Char15 {
public static void main(String[] args) {
	char ch = 'c';
	for(int i=1;i<=5;i++) {
		char c = (char) (ch+i);
		System.out.print(c+" ,");
	}
}
}
