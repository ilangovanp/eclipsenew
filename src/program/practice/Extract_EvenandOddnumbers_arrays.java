package program.practice;

import java.util.ArrayList;
import java.util.List;

public class Extract_EvenandOddnumbers_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int	a[]= {1,2,3,4,5,6,7,8,9};
	
	List<Integer> ab= new ArrayList<Integer>();	
	
	
	for (int i=0;i<a.length;i++) {

		if(a[i]%2==0) {
		
			//System.out.println(a[i]);
			ab.add(a[i]);
			
		}

	}
	System.out.println("even numbers: "+ab);
	
	List<Integer> ab1= new ArrayList<Integer>();	
	
    for (int i=0;i<a.length;i++) {
		
		if(a[i]%2!=0) {
			
			ab1.add(a[i]);
		}

	}
		System.out.println("Odd numbers are: "+ ab1);
	}

}
