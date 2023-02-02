package LAB4;

import java.util.*;

public class MyCurrentArray extends MyClassicalArray{
	static void Sort(int Ar[]) {
		int n = Ar.length;
		Arrays.sort(Ar);
		System.out.println("Sort Array :");
		for(int i : Ar) {
			System.out.print(i+" ");
		}
	}
	static void Search(int Find,int Ar[]) {
		
		for(int i : Ar) {
			if( i == Find) {
				System.out.println("has data in array");
				break;
			}else {
				System.out.println("Not Found");
				break;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCurrentArray wow = new MyCurrentArray();
		Sort(wow.MyArray);
		System.out.println("");
		System.out.println("Please insert num to Find Array");
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		System.out.print("Enter Num: ");

		String num = myObj.nextLine();  // Read user input
		int number = Integer.parseInt(num);
		Search(number,wow.MyArray);
	}

}
