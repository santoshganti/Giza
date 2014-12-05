package edu.lab.algorithms.sorting;

/*
 * PSEUDOCODE FOR SELECTION SORT
 * 1. I will scan the array till the last but one element because the last element will be in its appropriate place.
 * 2. I will have an element called minindex which hold the minimum element in the array
 * SELECTIONSORT(A)
 * 	for i=0 to A.length-1 (will scout till the last but one element. 
 * 							We don't need to consider the final 
 * 							position because it will already be sorted)
 * 		minindex=i  (This index holds the minimum value and 
 * 					by default we assume the index to be the 0th position 
 * 					and compare within loop to find the actual minimum)
 * 		for j=i+1 to A.length (Because i is at 0 and we don't need to 
 * 								compare with i again. We increase the i and call it j.
 * 								 We will run this till final position because 
 * 									we have to be sure to check all elements in the array)
 * 			if A[minindex]>A[j] (check if any number in the array is 
 * 								less than the number we assumed to be minimum)
 * 				minindex=j; (If you have come here means, our number which 
 * 								we have assumed is larger than some of the
 * 								elements in the array)
 * 			exchange i and minindex (Hence we will exchange it)
 * return this array (for testing the output)
 */
public class SelectionSort {
	public int[] selectionSort(int array[]) {
		for (int i = 0; i < array.length - 1; i++) {
			int minindex = i;// minindex consists of the minimum element in the
								// array
			for (int j = i + 1; j < array.length; j++) {
				if (array[minindex] > array[j])
					minindex = j;
			}
			int temp = array[i];
			array[i] = array[minindex];
			array[minindex] = temp;
		}
		return array;
	}
}
