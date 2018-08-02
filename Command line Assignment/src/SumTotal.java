// class which takes command line arguments and print their sum
public class SumTotal {
	
	public static void main(String args[]) {
		
		int sum = 0;
		
		for(int i = 0; i < args.length; i++ ) {
			
			sum = sum + Integer.parseInt(args[i]);	//it will convert the string value to int and then add it to sum variable
		}
		
		System.out.println("Total: " + sum); // print the total sum of values passed using command line
	}

}
