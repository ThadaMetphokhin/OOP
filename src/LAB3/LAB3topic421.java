package LAB3;

import java.io.*;
import java.util.*;

public class LAB3topic421 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create Stack
		int usecon;
		int Numsize;
		Stack<String> stack = new Stack<String>();
		Scanner Number11 = new Scanner(System.in);  // Create a Scanner object
		System.out.print("Please Insert num to set Stack : ");
		String Numofsize = Number11.nextLine();  // Read user input
		Numsize = Integer.parseInt(Numofsize);
		stack.setSize(Numsize);
		System.out.println("SetStackSize("+stack.size()+")");
		stack.clear();
		do {
			Scanner Menu11 = new Scanner(System.in);  // Create a Scanner object
			System.out.print("Menu Choose Number : \n 1 : isEmpty | 2 : Top | 3 : Push | 4 : Pop | 5 : Exit \n You Choose: ");
			String getMenu = Menu11.nextLine();  // Read user input
			usecon = Integer.parseInt(getMenu);
			
			switch(usecon) {
				case 1:
					System.out.println("isEmpty");
					if(stack.isEmpty() == true) {
						System.out.println("----| YES");
						
					}else {
						System.out.println("----| No");
					}
					break;
				case 2:
					System.out.println("Top");
					try {
						System.out.println("----| "+stack.peek());
					}catch(Exception E) {
						System.out.println("----| Null");
					}
					
					break;
				case 3:
					Scanner getpush = new Scanner(System.in);  // Create a Scanner object
					System.out.print("Push : ");
					String value = getpush.nextLine();  // Read user input
					int Checknum = stack.size();
					if(Checknum != Numsize) {
						stack.push(value);
						System.out.println("ChackStack");
						System.out.println(stack);
						System.out.println("----| STACK : " + Arrays.toString(stack.toArray()).replace("[",""));
					}else {
						System.out.println("Stack Over Flow");
					}
					
					break;
				case 4:
					stack.pop();
					System.out.println("Pop");
					System.out.println("ChackStack");
					System.out.println("----| STACK : " + Arrays.toString(stack.toArray()).replace("[","").replace("]","") );
					
					break;
			}
		}while(usecon != 5);
		System.out.println("Program is shutdown");
	}
	
}
