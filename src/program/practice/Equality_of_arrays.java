
package program.practice;

import java.util.Arrays;

public class Equality_of_arrays {

	public static void main(String[] args) {
		
		Boolean status=true;
		int[] b1= {1,3,8,5};
		int[] b2= {1,3,4,5};
		Boolean g=Arrays.equals(b1, b2);
		System.out.println(g);
		if(b1.length==b2.length) {
			for(int i=0;i<b1.length;i++)
				
				if(b1[i]!=b2[i]) {
					status=false;	
					}	
			
		}else {
			status=false;
		}
		
	if(status==false)	{
		System.out.println("arrays are not equal");
	}else {
		System.out.println("arrays are equal");
	}
		
		
		
		
		
		
		

	}

}
