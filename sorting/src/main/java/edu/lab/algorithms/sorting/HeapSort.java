package edu.lab.algorithms.sorting;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;

public class HeapSort {
	int A[];
	private int heapsize;

	// private static final Logger logger =
	// LogManager.getLogger(HeapSort.class);

//	public int parent(int i) {
//		return (i / 2);
//	}

	public int left(int i) {
		return (2 * i);
	}

	public int right(int i) {
		return (2 * i + 1);
	}

	public void buildMaxHeap(int[] A) {

		heapsize = A.length - 1;
		for (int i = heapsize / 2; i >= 0; i--) {
			maxHeapify(A, i);
		}

	}

	public void maxHeapify(int A[], int i) {
		int l = left(i);
		int r = right(i);
		int largest = i;
		if (l <= heapsize && A[l] > A[i]) {
			largest = l;
		}

		if (r <= heapsize && A[r] > A[largest]) {
			largest = r;
		}
		if (largest != i) {
			swap(A, i, largest);
			maxHeapify(A, largest);
		}

	}

	public int[] heapSort(int A[]) {

		buildMaxHeap(A);
		for (int i = heapsize; i > 0; i--) {
			swap(A, 0, i);
			heapsize = heapsize - 1;
			maxHeapify(A, 0);

		}
		return A;
	}

	public void swap(int A[], int i, int j) {
		int temp = A[i];
		A[i] = A[j];
		A[j] = temp;
	}
}
