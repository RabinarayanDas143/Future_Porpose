package com.example.InterviewCoding24;

import java.util.PriorityQueue;

public class FindKthLargestElementDSA24 {
	public static void main(String[] args) {
		int[] array = { 33, 66, 88, 66, 99, 100 };
		int k = 3;
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int i : array) {
			pq.add(i);
			if (pq.size() > k) {
				pq.poll();
			}
		}
		System.out.println(pq.peek());
	}
}
