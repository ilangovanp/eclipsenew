package learnabstraction;
//To declare an interface, use the interface keyword

public interface LearnInterface {
	
	
	//variables in the interface are by default final, public and static.
	int ab=0;
	
	//There can be only abstract methods in the Java interface, not the method body. 
	
	//It is used to achieve abstraction and multiple inheritance in Java.
	
	//cannot create object for interface.
	
	
	
	//methods are by default public and abstract
	 void hello();
	public void details();
	public void statement();
	public void stock();
	
	//Any class can extend only 1 class but can any class implement infinite number of interface.(multiple Inheritance which java do not support)

	// abstract classes may contain non-final variables, whereas variables in the interface are final, public and static.
	
	// if we want to provide method body inside interface, we need to declare methods as default or static.
	
		static void hi() {
			
		}
	
		default void intro() {
		System.out.println("intro");	
		}
	
	
	
	
	
}
