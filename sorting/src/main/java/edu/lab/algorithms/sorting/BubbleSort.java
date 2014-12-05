package edu.lab.algorithms.sorting;

/*
 * PSEUDO CODE FOR BUBBLE SORT
 * BubbleSort(A)
 * 	for k=1 to n-1
 * 		for i=0 to n-2
 * 			if A[i]>A[i+1]
 * 				swap A[i] with A[i+1]
 * return Array
 */
public class BubbleSort {
	public int[] bubbleSort(int array[]) {
		int n = array.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i; j < n; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}

		}
		return array;
	}
}