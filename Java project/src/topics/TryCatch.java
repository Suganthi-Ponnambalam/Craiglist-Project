package topics;

import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		
		Scanner scanner=null;
		String name=null;
		try{
		scanner=new Scanner(System.in);
		if(scanner!=null){
		System.out.println("Enter your name");
		name=scanner.nextLine();
		}//if
		System.out.println("Hello "+name);
		}//try
		catch(Exception e){
		e.printStackTrace();
		}//catch
		finally{
		try{
		if(scanner!=null)
		scanner.close();
		}
		catch(Exception e){
		e.printStackTrace();
		}
		}//finally
		}//main


	}


