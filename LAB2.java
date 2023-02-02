
import java.util.Scanner;  // Import the Scanner class
public class LAB2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner number1 = new Scanner(System.in);  // Create a Scanner object
	    System.out.print("Enter Number: ");
	    String InputUser = number1.nextLine();  // Read user input
	      // Output user input
	    
	    int convertnumber = Integer.parseInt(InputUser);
	    System.out.println("----------------------------");
	    for(int i = 1; i <= convertnumber;i++) {
	    	if(i == 5) {
	    		//หากค่าของ i มีค่าเท่า 5 จะขึ้นบรรทัดใหม่
	    		System.out.println(i);
	    	}else if(i == 10) {
	    		//หากค่าของ i มีค่าเท่า 10 จะขึ้นบรรทัดใหม่
	    		System.out.println(i);
	    	}
	    	else if(i == 15) {
	    		//หากค่าของ i มีค่าเท่า 15 จะขึ้นบรรทัดใหม่
	    		System.out.println(i);
	    	}
	    	else if(i == 20) {
	    		//หากค่าของ i มีค่าเท่า 20 จะขึ้นบรรทัดใหม่
	    		System.out.println(i);
	    	}
	    	else if(i == convertnumber){
	    		System.out.print(i);
	    	}
	    	else {
	    		System.out.print(i+",");
	    	}
	    }
	}
}
