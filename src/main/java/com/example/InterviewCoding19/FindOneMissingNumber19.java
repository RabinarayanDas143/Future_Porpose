package com.example.InterviewCoding19;

import java.util.Arrays;

public class FindOneMissingNumber19 {
public static void main(String[] args) {
	int[] numArray = {1,2,3,4,6,7,8,9,10};
	int last = Arrays.stream(numArray).max().getAsInt();
	int originalSum = last*(last+1)/2;
	int givenSum = 0;
	for(int i : numArray) {
		givenSum=givenSum+i;
	}
	int result = originalSum-givenSum;
	System.out.println(result);
}
}
