package sorting;

import java.util.Arrays;

public class MergeSort {
	
	public static void main(String[] args) {
		int[] A = new int[] {9, 8, 7, 6, 5, 4, 3, 3, 2, 1, 0};
		
		mergeSort(A, 0, A.length-1);
		
		System.out.println(Arrays.toString(A));
	}
	
	public static void mergeSort(int[] A, int left, int right) {
		if (left < right) {
			int m = (right + left) / 2;
			
			mergeSort(A, left, m);
			mergeSort(A, m+1, right);
			
			merge(A, left, right, m);
		}
	}
	
	public static void merge(int[] A, int left, int right, int middle) {
		int i = left, j = middle + 1, k = 0;
		int[] merged = new int[(right - left) + 1];
		
		while (i <= middle && j <= right) {
			if (A[i] <= A[j]) {
				merged[k] = A[i];
				i++;
			} else {
				merged[k] = A[j];
				j++;
			}
			k++;
		}
		
		while (i <= middle) {
			merged[k] = A[i];
			i++;
			k++;
		}
		
		while (j <= right) {
			merged[k] = A[j];
			j++;
			k++;
		}
		
		for (int q = left; q <= right; q++) {
			A[q] = merged[(q - left)];
		}
	}
}
