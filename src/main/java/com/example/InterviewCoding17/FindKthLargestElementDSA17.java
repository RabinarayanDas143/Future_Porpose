package com.example.InterviewCoding17;

import java.util.PriorityQueue;

public class FindKthLargestElementDSA17 {
	public static void main(String[] args) {
		int[] array = { 5, 1, 3, 7, 10, 9 };
		int kth = 3;
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int i : array) {
			pq.add(i);
			if (pq.size() > 3) {
				pq.poll();
			}
		}
		System.out.println(pq.peek());
	}
}
