package com.example.InterviewCoding13;

public class IndexOfInput13 {
public static void main(String[] args) {
	int num = 11;
	int index = -1;
	int[] array = { 1, 44, 2, 3, 66, 88, 11, 66, 33, 55 };
	for(int i=0;i<array.length;i++) {
		if(array[i]==num) {
			index=i;
		}
	}
	System.out.println(index);
}
}
