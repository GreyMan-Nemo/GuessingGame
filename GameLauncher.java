/* A guessing game example
 * This code is taken from the "head first java" book (2nd edition)
 * Written by Kathy Sierra and Bert Bates
 * Published by O'Reilly Media Inc.
 */

package guessingGame1;

// Adding GameLauncher class
public class GameLauncher {

	// Adding main method
	public static void main( String[] args) {
		
		GuessGame game = new GuessGame();
		game.startGame();
		
	} // Closing main method
} // Closing GameLauncher class
