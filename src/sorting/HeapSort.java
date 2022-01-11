package sorting;

import java.util.Arrays;

import datastructures.MaxHeap;

public class HeapSort {
	
	public static void main(String[] args) {
		int[] A = new int[] {9, 8, 7, 6, -5, 4, 3, 2, 4, 1, 0};
		
		heapSort(A);
		
		System.out.println(Arrays.toString(A));
	}
	
	public static void heapSort(int[] A) {
		int current;
		MaxHeap heap = new MaxHeap(A);
		
		for (int i = A.length-1; i >= 0; i--) {
			current = heap.extractMax();
			A[i] = current;
		}
	}
}
