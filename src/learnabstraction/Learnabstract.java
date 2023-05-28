package learnabstraction;

abstract public class Learnabstract {
	
	//Abstract classes and abstract methods are declared using ‘abstract‘ keyword. 
	//The class which has at least one abstract method must be declared as abstract.

	//We can’t create objects to those classes which are declared as abstract. 
	//But, we can create objects to sub classes of abstract class, provided they must implement abstract methods.
	//abstract classes can contain both normal and abstract methods
	
	public void normal() {
		
	System.out.println("hello");
	}
	
	public abstract void create();
	public abstract void delete();
	public abstract void remove();
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
		

	}

}
