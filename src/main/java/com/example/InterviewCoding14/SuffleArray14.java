package com.example.InterviewCoding14;

import java.util.Arrays;
import java.util.Random;

public class SuffleArray14 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			int randomIndex = rand.nextInt(array.length-1);
			int randomIndexValue = array[randomIndex];
			int temp = array[i];
			array[i] = randomIndexValue;
			array[randomIndex] = temp;
		}
		System.out.println(Arrays.toString(array));
	}
}
