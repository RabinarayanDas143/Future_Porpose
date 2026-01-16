package com.example.InterviewCoding11;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicateAndFilterFromStringArray11 {
	public static void main(String[] args) {
		String[] stringArray = { "java", "spring", "java", "react.js", "spring" };
		List<String> filter = getFilterFromArray(stringArray);
		System.out.println("Filter from Array :"+ filter);
		
		List<String> duplicate = getDuplicateFromArray(stringArray);
		System.out.println("Duplicate from Array :"+duplicate);
	}
	
	public static List<String> getFilterFromArray(String[] array){
		List<String> list = new ArrayList<>();
		for(int i=0;i<array.length;i++) {
			boolean flag=false;
			for(int j=i+1;j<array.length;j++) {
				if(array[i].equalsIgnoreCase(array[j])) {
					flag = true;
				}
			}
			if(!flag && !list.contains(array[i])) {
				list.add(array[i]);
			}
		}
		return list;
	}
	
	public static List<String> getDuplicateFromArray(String[] array){
		List<String> list = new ArrayList<>();
		for(int i=0;i<array.length;i++) {
			boolean flag = false;
			for(int j=i+1;j<array.length;j++) {
				if(array[i].equalsIgnoreCase(array[j])) {
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
