package LAB3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Random;

public class LAB3topic41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Number1 = new Scanner(System.in);  // Create a Scanner object
		System.out.print("Please enter your random value : ");
		String InputUser = Number1.nextLine();  // Read user input
			    
		
		// create instance of Random class
        Random rand = new Random();
       
		
		//Store Array
		ArrayList<Integer> mynum = new ArrayList<Integer>();
		int convertnumber = Integer.parseInt(InputUser);
		System.out.println("----------------------------");
		for(int i  = 0; i<=convertnumber;i++) {
			 //random number 0 to 99
			int rand_int2 = rand.nextInt(99);
			mynum.add(rand_int2);
			
		}
		for(int a : mynum) {
			System.out.println(a);
		}
	}

}
