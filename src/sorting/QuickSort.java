package sorting;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int[] A = new int[] {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
		quickSort(A, 0, A.length-1);
		
		System.out.println(Arrays.toString(A));
	}
	
	public static void quickSort(int[] A, int left, int right) {
		if (left < right) {
			int k = partition(A, left, right);
			
			quickSort(A, left, k-1);
			quickSort(A, k+1, right);
		}
	}
	
	public static int partition(int[] A, int left, int right) {
		int i=left, j=right-1, p=A[right];
		
		while (i <= j) {
			
			while (i < right && A[i] <= p) {
				i++;
			}
			
			while (j >= left && A[j] > p) {
				j--;
			}
			
			if (i < j) {
				switchElements(A, i, j);
			}
		}
		
		switchElements(A, i, right);
		
		return i;
	}
	
	public static void switchElements(int[] A, int i, int j) {
		int temp = A[i];
		A[i] = A[j];
		A[j] = temp;
	}

}
