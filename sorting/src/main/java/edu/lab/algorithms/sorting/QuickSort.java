package edu.lab.algorithms.sorting;

public class QuickSort {
	
	//Actual method for performing the quick sort
	/*
	 * PSEUDOCODE FOR QUICK SORT METHOD
	 * if p<r
	 * q = PARTITION(A,p,r)
	 * QUICKSORT(A,p,q-1)
	 * QUICKSORT(A,q+1,r)
	 */
	public int[] quickSort(int Array[], int p, int r) {
		if (p < r) {
			int q = partition(Array, p, r);
			quickSort(Array, p, q - 1);
			quickSort(Array, q + 1, r);
		}
		return Array;
	}

	//Partitions the algorithm into sorted two sets of sub arrays
	/*
	 * PSEUDOCODE FOR PARTITION METHOD
	 * x=A[r]
	 * i=p-1
	 * for j=p to r-1 
	 * 		if A[j] <= x
	 * 			i=i+1
	 * 			exchange A[i+1] with A[i]
	 * 		exchage A[i+1] with A[r]
	 * return i+1
	 */
	public int partition(int Array[], int p, int r) {
		int x = Array[r];
		int i = p - 1;
		for (int j = p; j <= r - 1; j++) {
			if (Array[j] <= x) {
				i = i + 1;
				exchange(i, j);
			}
		}
		exchange(i + 1, r);
		return (i + 1);

	}

	//global variable for the interchange used in the exchange method
	private int ExchangeArray[];

	//Method to interchange elements
	private void exchange(int a, int b) {
		int temp = 0;
		temp = ExchangeArray[a];
		ExchangeArray[a] = ExchangeArray[b];
		ExchangeArray[b] = temp;

	}

}