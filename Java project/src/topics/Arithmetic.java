package topics;

import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		/*Test Data:
			Radius = 7.5 
			Expected Output
			Perimeter is = 47.12388980384689 
			Area is = 176.71458676442586 
			*/
		
		Scanner input = new Scanner(System.in);
	System.out.println("Enter the value for radius r =" );

	Double r = input.nextDouble();
	Double Perimeter = 2* Math.PI * r;
	Double Area = Math.PI*r*r;
	System.out.println("Perimeter ="+ Perimeter);
	
	System.out.println("Area is = "+ Area);


		  

	}

}
