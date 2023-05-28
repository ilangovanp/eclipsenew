package learnabstraction;

public class LearnInterface1 implements LearnInterface {

	
	 /* If a class implements an interface and does not provide method bodies for all functions specified in the interface, 
	 * then the class must be declared abstract.*/	
	
	
	
	
	//A class that implements an interface must implement all the methods declared in the interface.
	//To implement interface use implements keyword.
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		LearnInterface1 abv= new LearnInterface1();
		abv.hello();
		abv.intro();
		
		
	}

	@Override
	public void hello() {
		// TODO Auto-generated method stub
		System.out.println("hi ");
	}

	@Override
	public void details() {
		// TODO Auto-generated method stub
		System.out.println("details method body ");
		
	}

	@Override
	public void statement() {
		// TODO Auto-generated method stub
		System.out.println("statement method body ");	
	}

	@Override
	public void stock() {
		// TODO Auto-generated method stub
		System.out.println("stock method body ");	
	}

}
