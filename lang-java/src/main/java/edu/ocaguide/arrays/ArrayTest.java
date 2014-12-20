package edu.ocaguide.arrays;

//Trying to get rows and column for matrix. 
public class ArrayTest {
	public static void main(String[] args) {
		int[][] firstarray = new int[][] { { 1, 1, 1 }, { 1, 1, 1 } };
		//int[][] secondarray = new int[][] { { 1, 1 }, { 1, 1 }, { 1, 1 } };
		int[][] secondarray = new int[][]{{3,3},{3,3}};
		int r1 = firstarray.length;
		int c1 = firstarray[1].length;
		int r2 = secondarray.length;
		int c2 = secondarray[1].length;
		System.out.println(r2);
		System.out.println(c2);
		
		//System.out.println(r1 + " " + c1 + " " + r2 + " " + c2 + "\n");

//		for (int i = 0; i < r1; i++) {
//			for (int j = 0; j < c1; j++)
//				System.out.println(firstarray[i][j] + " ");
//			System.out.println();
//		}

	}
}
