package topics;

public class PatternUsingArray {

	public static void main(String[] args) {
		
		/* +"""""+                                                                                                      
		 [| o o |]                                                                                                     
		  |  ^  |                                                                                                      
		  | '-' |                                                                                                      
		  +-----+ 
*/
		String[] arr =new String[5];
		arr[0]=" +\"\"\"\"\"+ ";
		arr[1]= "[| o o |]";
		arr[2]= " |  ^  |";
		arr[3]= " | '-' |";
		arr[4]= " +-----+";
		
		for (int i=0; i<5; i++){
		
		System.out.println(arr[i]);
		}
		
	}

}
