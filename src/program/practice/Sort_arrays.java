package program.practice;

import java.util.Arrays;

public class Sort_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] u= {5,4,6,2,7,3};
		int temp;
		for(int i=0;i<u.length;i++) {
			for(int j=i+1;j<u.length;j++) {
				
				if(u[i]>u[j]) {
					temp= u[i];
					u[i]=u[j];
					u[j]=temp;			
				}		
			}
				
		}
		System.out.println(Arrays.toString(u));	
		
		
		
		
		
		
		
		
		
		

	}

}
