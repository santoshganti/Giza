package edu.game.snakesandladder;

import java.io.*;

public class Snakes_and_Ladders {
	public static void main(String[] args) throws IOException {
		BufferedReader myInput2 = new BufferedReader(new InputStreamReader(
				System.in));
		// Print the welcome screen and instructions
		System.out.println("\t\t\t\t\t\tWelcome To Snakes And Ladders\n\n");
		System.out.println("\t\t\t\t\t\t\tInstructions:");
		System.out
				.println("\t\t\t This program will simulate a regular snakes and ladders game, where you will be");
		System.out
				.println("\t\t\t facing the computer. You and the computer start at square 1, and the first one to");
		System.out
				.println("\t\t\t square 100 wins, however, there will be preset squares which will be the snakes or ladders.");
		System.out
				.println("\t\t\t Once you land on top of a snake you go down a few squares, and move up if you land");
		System.out
				.println("\t\t\t\t\t\t on the bottom of a ladder. Good Luck and Have FUN!!!");

		int counter = 100, iteration = -1; // sets the counter and iteration
											// vaiables to be used in making the
											// board
		System.out
				.println("-----------------------------------------------------Game Board-----------------------------------------------------------------------------");

		/*
		 * This while loop makes the board for the player to visualize what the
		 * game looks like, it uses a counter to increment or decrement by 1. It
		 * will also subtract by 9 or 10 when necessary to create a board
		 * exactly like the one given.
		 */
		while (counter > 0) {// start while
			if (counter % 10 == 0 && counter != 100) {// checks if the counter
														// is at a 90, or 80...
				if (iteration == -1) {
					// subtract 9 from the counter
					// and sets it to start adding by one
					counter -= 9;
					iteration = 1;
				} else {
					System.out.print(counter + "\t");
					counter -= 10;
					iteration = -1; // set the counter to start subtract by ones
				}
				if (counter != 0)
					System.out.print("\n" + counter + "\t"); // just prints out
																// the counter
																// with a line
																// breck
			} else
				System.out.print(counter + "\t"); // just prints out the counter
			counter += iteration; // sets counter to add by iteration
		}// end while
		System.out.println();
		System.out
				.println("--------------------------------------------------------------------------------------------------------------------------------------------");
		String sGame = "y";
		System.out.println("Do you want to play? Y or y     >  ");
		sGame = myInput2.readLine();
		System.out.println("\n\n\n\n\n\n");
		while (sGame.equals("y") || sGame.equals("Y")) {
			sGame = startGame(sGame); // give startGame a variable to work with
		}
		System.out.println("\n\n\n\n\t\t\t\t\t\tSEE YA!!");

	}

	public static String startGame(String start) throws IOException {
		BufferedReader myInput = new BufferedReader(new InputStreamReader(
				System.in));
		int userPosition = 1;
		int compPosition = 1;
		int diceRoll = 0;
		int diceRoll2 = 0;
		int userRoll = 1;
		int compRoll = 1;
		String playAgain = "y";

		int snakesLaddersArray[] = new int[6];
		snakesLaddersArray[0] = 54;
		snakesLaddersArray[1] = 90;
		snakesLaddersArray[2] = 99;
		snakesLaddersArray[3] = 9;
		snakesLaddersArray[4] = 40;
		snakesLaddersArray[5] = 67;

		while (playAgain.equals("y") || playAgain.equals("Y")) {
			userRoll = getDice(diceRoll, diceRoll2);
			compRoll = getDice(diceRoll, diceRoll2);
			System.out
					.println("-----------------------------------------------------------------------------------------------------------------------------------------");
			System.out.println("\t\t\t\t\t----------------------------------");
			System.out.println("\t\t\t\t\t|\tYou Rolled a " + userRoll
					+ "\t\t|");
			System.out.println("\t\t\t\t\t----------------------------------");

			userPosition = userPosition + userRoll;
			compPosition = compPosition + compRoll;

			userPosition = getP(userPosition, userRoll, snakesLaddersArray);
			compPosition = compgetP(compPosition, compRoll, snakesLaddersArray,
					compPosition);
			System.out
					.println("\t\t\t*****************************************************************");
			System.out.println("\t\t\t*\t\t You are current on square "
					+ userPosition + "\t\t\t*");
			System.out
					.println("\t\t\t*\t\t The computer is currently on square "
							+ compPosition + "\t\t*");
			System.out
					.println("\t\t\t*****************************************************************");

			if (userPosition == 100 || compPosition == 100) {
				userPosition = 1;
				compPosition = 1;
				System.out.println("Do you want to play ? Y or N > ");
				playAgain = myInput.readLine();
				System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n");
			} else {
				System.out.println("Do you want to play ?Y or N  > ");
				playAgain = myInput.readLine();

			}

		}// end of Playagain while

		return playAgain;

	}// end of startgame

	// -------------------------------------------------------------------compgetP
	// Method------------------------------------------------------------------------------

	/*
	 * compgetP method:
	 * 
	 * This method is responsible for checking if the COMPUTER is on top of a
	 * snake, or at the bottom of a ladder, and then adjusting the compuer's
	 * position to mathch the snakes or ladders value.
	 */

	private static int compgetP(int compPosition, int compRoll,
			int[] snakesLaddersArray, int userPosition) throws IOException {
		if (compPosition == snakesLaddersArray[0]) {
			compPosition = 19;
			System.out
					.println("\t\t\t\t~~~~~~~~~~~~~Computer Got Bit By A Snake, HE WENT GO DOWN!!!~~~~~~~~~~~~~");

		} else if (compPosition == snakesLaddersArray[1]) {
			compPosition = 48;
			System.out
					.println("\t\t\t\t~~~~~~~~~~~~~Computer Got Bit By A Snake, HE WENT GO DOWN!!!~~~~~~~~~~~~~");

		} else if (compPosition == snakesLaddersArray[2]) {
			compPosition = 77;
			System.out
					.println("\t\t\t\t~~~~~~~~~~~~~Computer Got Bit By A Snake, HE WENT GO DOWN!!!~~~~~~~~~~~~~");
		} else if (compPosition == snakesLaddersArray[3]) {
			compPosition = 34;
			System.out.println("Computer Got TO A Ladder, HE WENT UP!!!");
		} else if (compPosition == snakesLaddersArray[4]) {
			compPosition = 64;
			System.out.println("Computer Got TO A Ladder, HE WENT UP!!!");

		} else if (compPosition == snakesLaddersArray[5]) {
			compPosition = 86;
			System.out.println("Computer Got TO A Ladder, HE WENT UP!!!");
		}

		if (compPosition < 0 || compPosition > 112) // ERROR TRAP to catch any
													// unwanted system errors
													// that may occur by chance
		{
			System.out
					.println("An error has occured for the computer, please reset the game!!!!!!");
		}

		else if (compPosition > 100) // checks if computers's location if
										// greater then a 100
		{
			compPosition = compPosition - compRoll; // get old position
			System.out
					.println("THE COMPUTER CAN'T JUMP!!! He must land on a 100"); // give
																					// message
																					// that
																					// the
																					// computer
																					// cant
																					// jump

		} else if (compPosition == 100 && userPosition != 100) {
			System.out.println("THE COMPUTER WON, YOU FAILED!!!"); // print out
																	// that the
																	// computer
																	// won

		}

		return compPosition;
	}

	// -------------------------------getP
	// Method---------------------------------------
	/*
	 * getP Method
	 * 
	 * This method is responsible for checking if the user is on top of a snake,
	 * or at the botteom of a ladder, and then adjusting the user's position to
	 * match the snake or ladders value
	 */
	private static int getP(int userPosition, int userRoll,
			int[] snakesLaddersArray) throws IOException {

		if (userPosition == snakesLaddersArray[0]) // if position equals snake 1
		{
			userPosition = 19; // set new position
			System.out
					.println("\t\t\t\t~~~~~~~~~~~~~You Got Bit By A Snake, GO DOWN!!!~~~~~~~~~~~~~");
		} else if (userPosition == snakesLaddersArray[1]) // if position equals
															// snake 2
		{
			userPosition = 48; // set new position
			System.out
					.println("\t\t\t\t~~~~~~~~~~~~~You Got Bit By A Snake, GO DOWN!!!~~~~~~~~~~~~~");

		} else if (userPosition == snakesLaddersArray[2]) // if position equals
															// snake 3
		{
			userPosition = 77; // set new position
			System.out
					.println("\t\t\t\t~~~~~~~~~~~~~You Got Bit By A Snake, GO DOWN!!!~~~~~~~~~~~~~");
		} else if (userPosition == snakesLaddersArray[3]) // if position equals
															// ladder 1
		{
			userPosition = 34; // set new position
			System.out
					.println("\t\t\t\t~~~~~~~~~~~~~You Got A Ladder!! GO UP!!!~~~~~~~~~~~~~");

		} else if (userPosition == snakesLaddersArray[4]) // if position equals
															// ladder 2
		{
			userPosition = 64; // set new position
			System.out
					.println("\t\t\t\t~~~~~~~~~~~~~You Got A Ladder!! GO UP!!!~~~~~~~~~~~~~");

		} else if (userPosition == snakesLaddersArray[5]) // if position equals
															// ladder 3
		{

			userPosition = 86; // set new position
			System.out
					.println("\t\t\t\t~~~~~~~~~~~~~You Got A Ladder!! GO UP!!!~~~~~~~~~~~~~");
		}

		if (userPosition < 0 || userPosition > 112) // This is ab ERROR TRAP to
													// catch any unwanted system
													// errors that may occur by
													// chance
		{
			System.out
					.println("An error has occured please reset the game!!!!!!");
		}

		else if (userPosition > 100) // checks if user's location if greater
										// then a 100
		{
			userPosition = userPosition - userRoll; // subtract userRoll from
													// the userposition to get
													// back old position
			System.out.println("OHHH You cant jump, you must land on a 100"); // print
																				// out
																				// the
																				// users
																				// current
																				// location

		} else if (userPosition == 100) {
			System.out.println("YOU WON, GOOD JOB!!!"); // print out that the
														// user won

		}

		return userPosition; // return the final position to starGame: this
								// position had gone through all checks and test
								// and can be displayed on screen
	}

	private static int getDice(int diceRoll, int diceRoll2) {
		diceRoll = (int) (Math.random() * 6) + 1; // creates dice roll number 1
		diceRoll2 = (int) (Math.random() * 6) + 1; // creates dice roll number 2
		int move = diceRoll + diceRoll2; // adds the two dice rolls to get a
											// final move
		return move; // return parameter move: this will give the final dice
						// roll back to startGame
	}
}
