package program.practice;

public class swaptwonumbers {
	int a=10, b=100;
	int c;
	public void hem() {
		
		/*
		 * c=a; a=b;
		 * 
		 * b=c;
		 */
		 
		a=a+b;
		b=a-b;
		a=a-b;
	
		
		System.out.println("a value: "+a +","+" "+"b value: "+b);
		
		
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		swaptwonumbers  ab= new swaptwonumbers();
		ab.hem();
		
		

	}

}
