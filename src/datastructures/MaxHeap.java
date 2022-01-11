package datastructures;

import java.util.Arrays;

public class MaxHeap {

	private int[] elements;
	private int numElements;
	
	public MaxHeap(int n) {
		this.elements = new int[n];
		this.numElements = n;
	}
	
	public MaxHeap(int[] array) {
		this.elements = array;
		this.numElements = array.length;
		
		for (int i = numElements/2; i >= 0; i--) {
			restoreHeapCondition(i);
		}
	}
	
	public void restoreHeapCondition(int k) {
		if (hasLeftChild(k) && hasRightChild(k)) {
			if (elements[getLeftChildIndex(k)] >= elements[getRightChildIndex(k)] 
				&& elements[getLeftChildIndex(k)] > elements[k]) {
				switchElements(k, getLeftChildIndex(k));
				restoreHeapCondition(getLeftChildIndex(k));
			} else if (elements[getLeftChildIndex(k)] < elements[getRightChildIndex(k)] 
					&& elements[getRightChildIndex(k)] > elements[k]){
				switchElements(k, getRightChildIndex(k));
				restoreHeapCondition(getRightChildIndex(k));
			}
		} else if (hasLeftChild(k) && elements[k] < elements[getLeftChildIndex(k)]) {
			switchElements(k, getLeftChildIndex(k));
			restoreHeapCondition(getLeftChildIndex(k));
		} else if (hasRightChild(k) && elements[k] < elements[getRightChildIndex(k)]) {
			switchElements(k, getRightChildIndex(k));
			restoreHeapCondition(getRightChildIndex(k));
		}
	}
	
	public int extractMax() {
		int max = elements[0];
		
		switchElements(0, numElements-1);
		elements[numElements-1] = 0;
		numElements--;
		
		restoreHeapCondition(0);
		
		return max;
	}
	
	private void switchElements(int i, int j) {
		int temp = elements[i];
		elements[i] = elements[j];
		elements[j] = temp;
	}
	
	private boolean hasLeftChild(int k) {
		return getLeftChildIndex(k) < numElements;
	}
	
	private boolean hasRightChild(int k) {
		return getRightChildIndex(k) < numElements;
	}
	
	private int getLeftChildIndex(int k) {
		return (2 * (k + 1)) - 1;
	}
	
	private int getRightChildIndex(int k) {
		return (2 * (k + 1));
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {9, 8, 7, 6, -5, 4, 3, 2, 4, 1, 0};
		
		MaxHeap heap = new MaxHeap(arr);
		
		System.out.println(Arrays.toString(heap.elements));
		System.out.println(heap.extractMax());
	}
}
