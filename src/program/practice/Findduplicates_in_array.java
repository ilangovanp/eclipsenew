package program.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Findduplicates_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String[] a= {"orange", "apple", "lemon","melon","apple","lemon"};
		/*List<String> vv= new ArrayList<String>();
		for(String z:a) {
		if(!vv.contains(z)) {
		 
			vv.add(z);
			}
		}
		System.out.println(vv);
		}*/
		
//		Set<String> gy=new HashSet<String>();
//		for(String l:a) {
//			gy.add(l);
//			}
//		System.out.println(gy);
//		}
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println(a[i]);
				}
			}
			
		}
		}
		
		
		
		
		

}
