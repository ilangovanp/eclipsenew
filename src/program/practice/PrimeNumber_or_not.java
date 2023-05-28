package program.practice;

import java.util.Scanner;

public class PrimeNumber_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag=0;
		System.out.println("Enter any number");
		Scanner n= new Scanner(System.in);
		int a=n.nextInt();
	
	for(int i=2;i<=a-1;i++) {
		if(a%i==0) {
			System.out.println("not prime");
			flag=1;
			break;
			
		}
	}
	if(flag==0) {
	System.out.println("prime");
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
