package program.practice;

import java.util.Arrays;

public class Leetcodearray {
	
    
	public static int[] ar(int[] nums,int target) {
		for(int i=0;i<nums.length;i++){
            for(int j=i+1;i<nums.length;j++){
                       if (nums[i]+nums[j]==target){
                        return new int[] {i,j};
                          
                       }
                       
                       }
	}
		return null;
	
	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={1,3,3,5,6};
		int[] x=ar(nums,7);
		System.out.println(Arrays.toString(x));
		

		
            }
		
		
	}


