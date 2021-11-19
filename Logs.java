/*
* The "Logs" program calculates how many logs you can fit into a truck with different cut sizes*
*
* @author  Myles Trump
* @version 1.0
* @since   2020-11-18
*/

import java.util.Scanner;

/**
* This is the standard "Hello, World!" program.
*/
final class Logs {

    /**
    * Density of logs, in kg/m.
    */
    public static final double DENSITY = 20.0;

    /**
    * Max truck load.
    */
    public static final double MAX_LOAD = 1100; 

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Logs() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
	// variables
	final double numberOfLogs;
       
	final Scanner userInput = new Scanner (System.in);

      	// ask the user to input if they are loading 1 m longs, 0.5 m logs or 0.25 m logs
	System.out.print("Enter log length (0.25, 0.5 or 1): ");
	
	// Stores float in length
	final float length = userInput.nextFloat();

	// calculate number of logs
	numberOfLogs = (MAX_LOAD / DENSITY) / length;

	// Outputs how many logs the truck can carry
	System.out.println("The truck will be able to take "
			+ numberOfLogs + " logs that are " + length
			+ " meter(s) in length.");

        System.out.println("\nDone.");
    }
}

