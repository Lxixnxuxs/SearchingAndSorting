package sorting;
import java.util.Arrays;
import searching.*;

public class InsertionSort {
	
	public static void main(String[] args) {
		int[] A = new int[] {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
		
		insertionSort(A);
		System.out.println(Arrays.toString(A));
	}

	public static void insertionSort(int[] A) {
		int k;
		for (int i = 1; i < A.length; i++) {
			k = BinarySearch.getIndexSmallestElementGreater(A, A[i], i-1);
			insertAt(A, k, i, A[i]);
		}
	}
	
	public static void insertAt(int[] A, int k, int to, int b) {
		int prev = A[k], temp;
		
		for (int i = k; i < to; i++) {
			temp = A[i+1];
			A[i+1] = prev;
			prev = temp;
		}
		
		A[k] = b;
	}
}
