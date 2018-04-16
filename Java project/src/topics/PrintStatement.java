package topics;

import java.util.Scanner;

public class PrintStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.out.println("java\n suganthi ");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Firstnumber=");
		int Firstno = input.nextInt();
		System.out.println("Enter the Secondnumber=");
		int Secondno =input.nextInt();
		int sum = Firstno + Secondno;
		System.out.println();
		
		System.out.println("sum of "+ Firstno +"and"+ Secondno+"is" + sum);
		
		
		

	}

}
