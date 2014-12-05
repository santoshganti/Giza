package edu.lab.algorithms.sorting;

/*
 * PSEUDO CODE FOR BUBBLE SORT
 * BubbleSort(A)
 * 	for k=1 to n-1//THis is included to make multiple passes happen
 * 		for i=0 to n-2 //This will only check for one pass
 * 			if A[i]>A[i+1]//Since we come left to right there, the left element should always be lower than right
 * 				swap A[i] with A[i+1]
 * return Array
 */
public class BubbleSort {
	public int[] bubbleSort(int array[]) {
		int n = array.length;
		for (int k = 1; k <=n - 1; k++) {
			for (int i = 0; i <= n-2; i++) {
				if (array[i] > array[i+1]) {
					int temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
				}
			}

		}
		return array;
	}
}