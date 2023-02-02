package LAB4;
import java.util.*;

public class MyClassicalArray {
	//properties
	int MyArray[] = {11,23,32,44,15,29,93,74,88,44};
	static void FindMax(int sarray[]) {
		//Search value Max in Array
		int max = sarray[0];
		for (int i = 1; i < sarray.length; i++)
		{
		     if (sarray[i] > max)
		     {
		           max = sarray[i];
		     }
		}
		System.out.println("Max Value is: "+max);
	}
	static void FindMin(int marray[]) {
		//Search value Min in Array
		int min = marray[0];
		for (int i = 1; i < marray.length; i++)
		{
		     if (marray[i] < min)
		     {
		    	 min = marray[i];
		     }
		}
		System.out.println("Min Value is: "+min);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClassicalArray ar = new MyClassicalArray();
		FindMax(ar.MyArray);
		FindMin(ar.MyArray);
		
	}

}

