package sorting;
import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] A = new int[] {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
		
		System.out.println(bubbleSort(A));
		System.out.println(Arrays.toString(A));
	}

	public static int bubbleSort(int[] A) {
		int n=0, temp;
		
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length - 1; j++) {
				if (A[j] > A[j+1]) {
					n++;
					temp = A[j];
					A[j] = A[j+1];
					A[j+1] = temp;
				}			
			}
		}
		
		return n;
	}
}
