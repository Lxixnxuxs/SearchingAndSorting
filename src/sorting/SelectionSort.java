package sorting;
import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] A = new int[] {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
		selectionSort(A);
		
		
		System.out.println(Arrays.toString(A));
	}
	
	public static void selectionSort(int[] A) {
		int minIndex;
		for (int i = 0; i < A.length; i++) {
			minIndex = findSmallestElement(A, i);
			switchElement(A, i, minIndex);
		}
	}

	public static int findSmallestElement(int[] A, int k) {
		int minIndex = k;
		for (int i = k; i < A.length; i++) {
			minIndex = A[minIndex] < A[i] ? minIndex : i;
		}
		
		return minIndex;
	}
	
	public static void switchElement(int[] A, int i, int j) {
		int temp = A[i];
		A[i] = A[j];
		A[j] = temp;
	}
}
