package com.example.InterviewCoding10;

public class AverageOfAllPositiveNumbers10 {

	private static AverageOfAllPositiveNumbers10 obj = null;

	public static AverageOfAllPositiveNumbers10 getAverageOfAllPositiveNumbers10() {
		if (obj == null) {
			synchronized (AverageOfAllPositiveNumbers10.class) {
				if (obj == null) {
					obj = new AverageOfAllPositiveNumbers10();
				}
			}
		}
		return obj;
	}

	public static void main(String[] args) {
		int array[] = { 12, -45, -8, 2, -5, 19 };
		AverageOfAllPositiveNumbers10 obj = getAverageOfAllPositiveNumbers10();
		double averageNumber = obj.getAverage(array);
		System.out.println("Average of all positive number is :" + averageNumber);
	}

	private double getAverage(int[] array) {
		int count = 0;
		int sum = 0;
		double average = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0) {
				sum += array[i];
				count++;
			}
			if (count > 0) {
				average = sum / count;
			}
		}
		return average;
	}
}
