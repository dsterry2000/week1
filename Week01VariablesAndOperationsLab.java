//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  Variables & Operations Lab
// Java Week 01 Lab  
//
package week01;

public class Week01VariablesAndOperationsLab {

	public static void main(String[] args) {
		
		System.out.println("			Week 1 Lab");//Header

		// 1. Create a variable to hold the quantity of 
		//		available plane seats left on a flight	
		int planeSeatsRemaining = 20;

		
		// 2. Create a variable to hold the cost of groceries at checkout
		double groceriesTotal = 55;

		
		// 3. Create a variable to hold a person's middle initial
		char middleInitial = 'S';

	
		// 4. Create a variable to hold true if it's hot outside 
		//		and false if it's cold outside
		boolean isHot = true;

		
		// 5. Create a variable to hold a customer's first name
		String customerFirstName = "Darrell";

		
		// 6. Create a variable to hold a street address
		String streetAddress = "1234 Any Street";
		

		// 7. Print all variables to the console
		System.out.println("Remaining seats on the plane = " + planeSeatsRemaining);
		System.out.println("Groceries Total = " + groceriesTotal);
		System.out.println("Customer's middle initial is " + middleInitial);
		System.out.println("Is it hot outside? " + isHot);
		System.out.println("Customer's first name is " + customerFirstName);
		System.out.println("Customer's Address is " + streetAddress);

		// 8. A customer booked 2 plane seats, 
		//		remove 2 seats from the available seats variable
		planeSeatsRemaining = planeSeatsRemaining - 2;
		System.out.println("Two more seats were purchased. Remaining seats on the plane = " + planeSeatsRemaining);
	

		// 9. Impulse candy bar purchase, add 2.15 to the grocery total
		// 		costOfGroceries = costOfGroceries + 2.15;
		groceriesTotal = groceriesTotal + 2.15; 
		System.out.println("Cost of groceries with candy bar = " + groceriesTotal);


		// 10.  The birth certificate was printed incorrectly, 
		//		change the middle initial to something else
		middleInitial = 'K';
		System.out.println("Customer's middle Initial was changed to " + middleInitial);
		

		// 11.  The season has changed, update the hot outside 
		//			variable to be opposite of what it was
		isHot = false;
		System.out.println("Winter started. Is it still hot outside? " + isHot);


		// 12.  Create a new variable called full name using the customer's first name, 
		//			the middle initial, and a last name of your choice
		String customerFullName = customerFirstName + " " + middleInitial;
		System.out.println("Customer's full name is " + customerFullName + " Terry" );
	

		// 13.  Print a line to the console that introduces the customer and says they live
		// 			at the address variable
		System.out.println("Our newest customer is " + customerFirstName + ". " + "He lives at " + streetAddress);

		
		
	}
}
