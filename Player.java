/* A guessing game example
 * This code is taken from the "head first java" book (2nd edition)
 * Written by Kathy Sierra and Bert Bates
 * Published by O'Reilly Media Inc.
 */

package guessingGame1;

// Creating Player class
public class Player {

	// Adding player's number variable
	// This is where the player's guess is stored
	int number = 0;
	
	// Adding the player's guess method
	public void guess() {
		number = ( int)( Math.random() * 10);
		System.out.println( "I'm guessing: "+ number);
		
	} // Closing guess method
} // closing Player class
