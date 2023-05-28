package learn.keywords;

public class Learnfinalkeyword {
	
	//In Java, the final method cannot be overridden by the child class. 
	//In Java, the final class cannot be inherited by another class.
	
	public  void display() {
		
		System.out.println("This is final method");
	}
}
	
 	class Second extends Learnfinalkeyword{
		
	
    public void display() {
		
		System.out.println("This is final method");
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Second nm= new Second();
		nm.display();
				
		//In Java, we cannot change the value of a final variable
		
		 final int AGE = 24;
		
	// AGE =55;
			 
		 System.out.println(AGE);		
		
	}	

	}


