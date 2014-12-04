package edu.lab.algorithms.sorting;

public class QuickSort {
	// global variable for the interchange used in the exchange method
	// private int exchangeArray[];

	// Actual method for performing the quick sort
	/*
	 * PSEUDOCODE FOR QUICK SORT METHOD if p<r q = PARTITION(A,p,r)
	 * QUICKSORT(A,p,q-1) QUICKSORT(A,q+1,r)
	 */
	public int[] quickSort(int array[], int p, int r) {
		if (p < r) {
			int q = partition(array, p, r);
			quickSort(array, p, q - 1);
			quickSort(array, q + 1, r);
		}
		return array;
	}

	// Partitions the algorithm into sorted two sets of sub arrays
	/*
	 * PSEUDOCODE FOR PARTITION METHOD x=A[r] i=p-1 for j=p to r-1 if A[j] <= x
	 * i=i+1 exchange A[i+1] with A[i] exchage A[i+1] with A[r] return i+1
	 */
	public int partition(int array[], int p, int r) {
		int x = array[r];
		int i = p - 1;
		for (int j = p; j <= r - 1; j++) {
			if (array[j] <= x) {
				i = i + 1;
				exchange(array, i, j);
			}
		}
		exchange(array, i + 1, r);
		return (i + 1);

	}

	// Method to interchange elements
	private void exchange(int array[], int a, int b) {
		int temp = 0;
		temp = array[a];
		array[a] = array[b];
		array[b] = temp;

	}

}