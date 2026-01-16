package com.example.InterviewCoding11;

public class IndexOfInput11 {
	public static void main(String[] args) {
		int num = 110;
		int[] array = { 1, 44, 2, 3, 66, 88, 11, 66, 33, 55 };
		int index = getIndexOfNum(array, num);
		if(index>0)
			System.out.println(index);
		else
			System.out.println("Given number is not found in array");
	}
	
	public static int getIndexOfNum(int[] array,int num) {
		int index=0;
		boolean flag=false;
		for(int i=0;i<array.length;i++) {
			if(array[i]==num) {
				index=i;
				flag=true;
			}
		}
		if(flag)
			return index;
		else
			return -1;
	}
}
