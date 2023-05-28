package learn.practicelooping;

import java.util.ArrayList;

public class Practicelooping {
	
	//You can define ArrayList as re-sizable array. Size of the ArrayList is not fixed. ArrayList can grow and shrink dynamically.
	//Elements can be inserted at or deleted from a particular position.
	//ArrayList class has many methods to manipulate the stored objects.
	//If generics are not used, ArrayList can hold any type of objects.
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> jk = new ArrayList<Integer>();
		
		
		
		for(int n=0;n<=5;n++) {
		jk.add(n);
		}
		
		System.out.println(jk);
		jk.remove(0);
		
		System.out.println(jk);
		System.out.println(jk.size());
		for(int n=0;n<jk.size();n++) {
			
			System.out.println(jk.get(n));	
		}
		
		
		
		
	}

}
