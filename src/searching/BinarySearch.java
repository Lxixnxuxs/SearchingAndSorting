package searching;

public class BinarySearch {
	
	public static void main(String[] args) {
		System.out.println(getIndexGreatestElementSmaller(new int[] {1, 4, 6, 8, 90, 99}, 50));
		System.out.println(getIndexSmallestElementGreater(new int[] {1, 4, 6, 8, 90, 99}, 50, 5));
	}
	
	public static int binarySearch(int[] A, int i, int j, int b) {	
		int m = (i + j) / 2;
		
		if (i > j) {
			return i-1;
		}
		
		if (A[m] == b)
			return m;
		else if (A[m] > b)
			return binarySearch(A, i, m-1, b);
		else 
			return binarySearch(A, m+1, j, b);
	}
	
	public static int getIndexGreatestElementSmaller(int[] A, int b) {
		return binarySearch(A, 0, A.length-1, b);
	}
	
	public static int getIndexSmallestElementGreater(int[] A, int b, int to) {
		return binarySearch(A, 0, to, b) + 1;
	}
}
