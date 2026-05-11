package com.example.InterviewCoding20;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicateAndFilterFromArray20 {
	public static void main(String[] args) {
		int[] array = { 5, 4, 3, 3, 2, 1, 9, 6, 8, 7, 5, 3, 4, 2, 1, 10 };

		List<Integer> filterArray = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			boolean flag = false;
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					flag = true;
				}
			}
			if (!flag && !filterArray.contains(array[i]))
				filterArray.add(array[i]);
		}
		//System.out.println(filterArray);
		
		List<Integer> DuplicateNum = new ArrayList<>();
		for(int i=0;i<array.length;i++) {
			boolean flag = false;
			for(int j=i+1;j<array.length;j++) {
				if(array[i]==array[j]) {
					flag = true;
				}
			}
			if(flag && !DuplicateNum.contains(array[i]))
				DuplicateNum.add(array[i]);
		}
		System.out.println(DuplicateNum);
	}
}
