package edu.ocaguide.arrays;

public class MatrixMultiplication {
	int rowsinA, columnsinA, rowsinB, columnsinB;

	MatrixMultiplication(int r1, int c1, int r2, int c2) {
		this.rowsinA = r1;
		this.rowsinB = r2;
		this.columnsinA = c1;
		this.columnsinB = c2;
	}

	public int[][] matrixMultiplication(int[][] firstarray, int[][] secondarray) {
		int c[][] = new int[rowsinA][columnsinB];
		for (int i = 0; i < rowsinA; i++) {
			for (int j = 0; j < columnsinB; j++) {
				c[i][j] = 0;
				for (int k = 0; k < rowsinB; k++)
					c[i][j] = c[i][j] + firstarray[i][k] * secondarray[k][j];
			}
		}
		return c;
	}

}
