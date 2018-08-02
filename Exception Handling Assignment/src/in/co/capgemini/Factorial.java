package in.co.capgemini;

import java.util.Scanner;

// Custom exception InvalidInputException to throw an exception if an input is less than 2
class InvalidInputException extends Exception {
	
	public InvalidInputException(String message) {
		super(message);
	}
}

// Custom exception FactorialExceedException to throw an exception if the result is more than the highest value of integer
class FactorialExceedException extends Exception {
	
	public FactorialExceedException(String message) {
		super(message);
	}
}

// Factorial class contains a method getFactorial() which return the factorial value of a number
public class Factorial {
	
//	this method throws two exceptions, InputValueException, FactorialExceedException
	public int getFactorial(long number) throws InvalidInputException, FactorialExceedException{
		
		int i, factorial = 1;
		
		if(number < 2)
			// Exception thrown explicitly
			throw new InvalidInputException("Invalid input, number should be greater than 2.");
		
		else {
			
			for(i = 1; i <= number; i++) {
				factorial *= i;
				if(factorial > Integer.MAX_VALUE)
					throw new FactorialExceedException("Values Exceeds the integer value");
			}
			
			
		}
		return factorial;
		
	}
	
	public static void main(String args[]) {
		
		Factorial factorial = new Factorial();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number: ");
		long number = scanner.nextInt();
		long answer;
		try {
			answer = factorial.getFactorial(number); //Risky code
			System.out.println("The factorial of " + number + " is " + answer); // Dependent code
		} catch(InvalidInputException invalidInput) {
			invalidInput.printStackTrace();
		} catch (FactorialExceedException fact) {
			fact.printStackTrace();
		} catch (Exception e) { // Defalut Extension
			e.printStackTrace();
		}
		
		
	}

}
