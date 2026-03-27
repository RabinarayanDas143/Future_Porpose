package com.example.InterviewCoding16;

public class FindMultipleMissingNumber16 {
public static void main(String[] args) {
	int[] array = { 1, 2, 4, 7, 9, 9, 10 };
	int last = array[array.length-1];
	boolean[] present = new boolean[last+1];
	for(int i : array) {
		if(i<=last) {
			present[i]=true;
		}
	}
	
	for(int i=1;i<=last;i++) {
		if(!present[i]) {
			System.out.print(i+" ,");
		}
	}
}
}
