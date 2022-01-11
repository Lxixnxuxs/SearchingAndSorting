package searching;

public class LinearSearch {
	
	public static void main(String[] args) {
		int[] x = new int[] {4, 9, 8, 1, 6, 9};
		
		System.out.println(linearSearch(x, 9));
		System.out.println(linearSearchRecursive(x, 0, 90));
	}
	
	public static int linearSearch(int[] A, int b) {
		for (int i = 0; i < A.length; i++ ) {
			if (A[i] == b)
				return i;
		}
		
		return -1;
	}
	
	public static int linearSearchRecursive(int[] A, int i, int b) {
		if (i >= A.length)
			return -1;
		
		if (A[i] == b)
			return i;
		else 
			return linearSearchRecursive(A, i+1, b);
	}

}

