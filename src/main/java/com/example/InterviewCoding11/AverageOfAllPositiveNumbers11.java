package com.example.InterviewCoding11;

public class AverageOfAllPositiveNumbers11 implements Cloneable{

	private static AverageOfAllPositiveNumbers11 obj = null;

	public static AverageOfAllPositiveNumbers11 getAverageOfAllPositiveNumbers11() {
		if (obj == null) {
			synchronized (AverageOfAllPositiveNumbers11.class) {
				if (obj == null) {
					obj = new AverageOfAllPositiveNumbers11();
				}
			}
		}
		return obj;
	}
	
//	protected Object clone() throws CloneNotSupportedException {
//		throw new CloneNotSupportedException("Clone Not Supported for this object!!");
//	}


	public static void main(String[] args) throws CloneNotSupportedException {
		int array[] = { 12, -45, -8, 2, -5, 19 };
		AverageOfAllPositiveNumbers11 object = getAverageOfAllPositiveNumbers11();
		double average = object.getAverage(array);
		AverageOfAllPositiveNumbers11 ob1 = (AverageOfAllPositiveNumbers11) object.clone();
		System.out.println(object.hashCode());
		System.out.println(ob1.hashCode());
		System.out.println("Average number is :" + average);
	}

	private double getAverage(int[] array) {
		int sum = 0, count = 0;
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
