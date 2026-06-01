package com.example.InterviewCoding25;

import java.util.PriorityQueue;

public class FindKthLargestElementDSA25 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int k = 3;
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int i : array) {
			pq.add(i);
			if (pq.size() > k)
				pq.poll();
		}
		System.out.println(pq.peek());
	}
}
