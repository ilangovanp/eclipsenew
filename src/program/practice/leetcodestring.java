package program.practice;

import java.util.HashSet;
import java.util.Set;

public class leetcodestring {
	
	
	 public static String longestprefix(String[] strs){
System.out.println(strs.length);
	        if(strs.length == 0){
	        	
	            return "";
	        }
	        String firstElement = strs[0];

	        for (int i = 1; i < strs.length; i++) {

	            while (strs[i].indexOf(firstElement) != 0){
	                firstElement = firstElement.substring(0, firstElement.length() - 1);
	            }
	            //System.out.println(strs[i]);
	        }
	        return firstElement;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String [] s = {"flower","flower","flight","flower"};
		String [] s = {"dog","racecar","car"};

        String output = longestprefix(s);

        System.out.println(output);
		
		
	}

}
