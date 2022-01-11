package sorting;

public class IsSorted {
	
	
	public static void main(String[] args) {
		int[] xSorted = new int[] {1, 4, 7, 9, 11, 14};
		int[] xUnsorted = new int[] {10, 40, 7, 9, 11, 1};
		
		System.out.println(isSorted(xSorted));
		System.out.println(isSortedRecursive(xSorted, 0));
		
		System.out.println(isSorted(xUnsorted));
		System.out.println(isSortedRecursive(xUnsorted, 0));
	}
	
	public static boolean isSorted(int[] A) {
		
		for (int i = 0; i < A.length - 1; i++) {
			if (A[i] > A[i+1])
				return false;
		}
		
		return true;
	}
	
	public static boolean isSortedRecursive(int[] A, int i) {
		if (i == A.length-1)
			return true;
		
		if (A[i] > A[i+1])
			return false;
		else 
			return isSortedRecursive(A, i+1);
	}
}
