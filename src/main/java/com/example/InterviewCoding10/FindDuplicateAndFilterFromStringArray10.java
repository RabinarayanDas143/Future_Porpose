package com.example.InterviewCoding10;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicateAndFilterFromStringArray10 {
	public static void main(String[] args) {
		String[] stringArray = { "java", "spring", "java", "react.js", "spring" };
		List<String> duplicateStringArray = getduplicateStringArray(stringArray);
		System.out.println("Duplicate String array is :" + duplicateStringArray);
		List<String> filterStringFromArray = getfilterStringFromArray(stringArray);
		System.out.println("Filter Strings from Array :" + filterStringFromArray);
	}

	private static List<String> getfilterStringFromArray(String[] stringArray) {
		List<String> list = new ArrayList<>();
		for (int i = 0; i < stringArray.length; i++) {
			boolean flag = false;
			for (int j = i + 1; j < stringArray.length; j++) {
				if (!stringArray[i].equalsIgnoreCase(stringArray[j]) && i != j) {
					flag = true;
				}
			}
			if (!list.contains(stringArray[i]) && flag) {
				list.add(stringArray[i]);
			}
		}
		return list;
	}

	private static List<String> getduplicateStringArray(String[] stringArray) {
		List<String> list = new ArrayList<>();
		for (int i = 0; i < stringArray.length; i++) {
			boolean flag = false;
			for (int j = i + 1; j < stringArray.length; j++) {
				if (stringArray[i].equalsIgnoreCase(stringArray[j]) && i != j) {
					flag = true;
				}
			}
			if (!list.contains(stringArray[i]) && flag) {
				list.add(stringArray[i]);
			}
		}
		return list;
	}
}
