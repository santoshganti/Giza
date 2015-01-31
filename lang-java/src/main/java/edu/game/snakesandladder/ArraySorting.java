package edu.game.snakesandladder;

public class ArraySorting {

	public static void main(String[] args) {
		ArraySorting sorting = new ArraySorting();
		
		sorting.printMissingNumber(new int[] { 1, 2, 3, 5, 6 }, 6);
		sorting.printMissingNumber(new int[] { 1, 2, 3, 4, 6, 7, 9, 8, 10 }, 10);

	}

	private void printMissingNumber(int[] numbers, int count) {
		
		int actualArraySum = 0;
		int originalarraySum = (count * (count + 1)) / 2;
		
		for (int i = 0; i < numbers.length; i++) {
			actualArraySum = actualArraySum + numbers[i];
		}
		
		int missingnumber = originalarraySum - actualArraySum;

		System.out.println("The missing number is " + missingnumber);

	}

}
