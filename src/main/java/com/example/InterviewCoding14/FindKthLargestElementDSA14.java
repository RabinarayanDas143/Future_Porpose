package com.example.InterviewCoding14;

import java.util.PriorityQueue;

public class FindKthLargestElementDSA14 {
	public static void main(String[] args) {
		int[] array = { 5, 1, 3, 7, 10, 9 };
		int kth = 3;
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		for (int i : array) {
			minHeap.add(i);
			if (minHeap.size() > kth) {
				minHeap.poll();
			}
		}
		System.out.println("Kth Largest element is : " + minHeap.peek());
	}
}
