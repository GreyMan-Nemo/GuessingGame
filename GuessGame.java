/* A guessing game example
 * This code is taken from the "head first java" book (2nd edition)
 * Written by Kathy Sierra and Bert Bates
 * Published by O'Reilly Media Inc.
 */

package guessingGame1;

// Creating GuessGame class
public class GuessGame {

	// Instance variables for 3 players
	Player p1;
	Player p2;
	Player p3;
	
	// Adding startGame method
	public void startGame() {
		
		// Create new player objects
		// These will be assigned to the instance variables
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();
		
		// Creating variables to hold the player guesses
		int guessP1 = 0;
		int guessP2 = 0;
		int guessP3 = 0;
		
		// Adding boolean variables
		// This will be used to determine correct guesses
		boolean p1IsRight = false;
		boolean p2IsRight = false;
		boolean p3IsRight = false;
		
		// Generate a random number (between 0 and 9)
		// This will be what the players must guess
		int targetNumber = ( int)( Math.random() *10);
		System.out.println( "I'm thinking of a number between 0 and 9");
		
		// Adding a while statement 
		// This will loop until a correct guess is made
		while( true) {
			System.out.println( "Number to guess is: "+ targetNumber);
			
			// Call the player guess method for each player
			p1.guess();
			p2.guess();
			p3.guess();
			
			// Get results form the guess() method
			// These will be accessed through the player's number variable
			guessP1 = p1.number;
			System.out.println( "Player one guessed: "+ guessP1);
			
			guessP2 = p2.number;
			System.out.println( "Player two guessed: "+ guessP2);
			
			guessP3 = p3.number;
			System.out.println( "Player three guessed: "+ guessP3);
				
			// Using if statements to determine if guesses are correct
			// This will be an if statement for each player
			if( guessP1 == targetNumber) {
				p1IsRight = true;
				
			} // Closing player one if statement
			
			if( guessP2 == targetNumber) {
				p2IsRight = true;
				
			} // Closing player two if statement
			
			if( guessP3 == targetNumber) {
				p3IsRight = true;
				
			} // Closing player three if statement
			
			// What to do if any player is correct
			if( p1IsRight || p2IsRight || p3IsRight) {
				System.out.println( "We have a winner...");
				System.out.println( "Player one got it right? "+ p1IsRight);
				System.out.println( "Player two got it right? "+ p2IsRight);
				System.out.println( "Player three got it right? "+ p3IsRight);
				System.out.println( "Game over");
					break;
					
			} // Closing player correct if statement
			
			// Adding an else statement for if no correct guess
			else {
				System.out.println( "No Correct guesses, try again");
				
			} // Closing else statement
		} // Closing the while statement
	} // Closing startGame method
} // Closing GuessGame class
