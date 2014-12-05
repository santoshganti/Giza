package edu.lab.algorithms.sorting;

public class InserstionSort {

/*
 * PSEUDOCODE FOR INSERTION SORT
 * for j=2 to A.length
 * 		key=A[j]
 * 		i=j-1
 * while i>0 and A[i] >key
 * 	A[i+1] = A[i]
 * 	i=i-1
 * A[i+1] = key
 */
	public double[] inserstionSort(double inputarray[]) {

		for (int j = 1; j < inputarray.length; j++) {
			double key = inputarray[j];
			int i = j - 1;

			while ((i > -1) && (inputarray[i] > key)) {
				inputarray[i + 1] = inputarray[i];
				i--;
			}
			inputarray[i + 1] = key;

		}

		return inputarray;
	}
}
