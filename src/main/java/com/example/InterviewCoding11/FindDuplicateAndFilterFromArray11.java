package com.example.InterviewCoding11;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicateAndFilterFromArray11 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		List<Integer> filterArray = getFilterArray(array);
		System.out.println("Filter array :" + filterArray);
		
		List<Integer> duplicateArray = getDuplicateFromArray(array);
		System.out.println("Duplicate From Array :"+duplicateArray);
	}

	public static List<Integer> getFilterArray(int[] array) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			boolean flag = false;
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j] && i != j) {
					flag = true;
				}
			}
			if (!flag && !list.contains(array[i])) {
				list.add(array[i]);
			}
		}
		return list;
	}
	
	public static List<Integer> getDuplicateFromArray(int[] array){
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<array.length;i++) {
			boolean flag=false;
			for(int j=i+1;j<array.length;j++) {
				if(array[i]==array[j] && i!=j) {
					flag=true;
				}
			}
			if(flag && !list.contains(array[i])) {
				list.add(array[i]);
			}
		}
		return list;
	}
}
