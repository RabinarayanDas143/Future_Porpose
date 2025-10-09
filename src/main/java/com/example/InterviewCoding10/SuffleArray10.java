package com.example.InterviewCoding10;

import java.util.Arrays;
import java.util.Random;

public class SuffleArray10 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		int[] result = getSuffleArray(array);
		System.out.println(Arrays.toString(result));
	}

	public static int[] getSuffleArray(int[] array) {
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			int randomIndex = rand.nextInt(array.length-1);
			int randomNum = array[randomIndex];
			int temp = array[i];
			array[i] = randomIndex;
			array[randomNum] = temp;
		}
		return array;
	}
}
