
public class LearnInheritance5 extends LearnInheritance1{
	
	//LearnInheritance4 and LearnInheritance5 are examples of hierarchial inheritance
	
//In Hierarchical Inheritance, one class serves as a superclass (base class-LearnInheritance1) for more than one subclass(LearnInheritance4 and LearnInheritance5)
// class LearnInheritance1 serves as a base class for the derived classes (LearnInheritance4 and LearnInheritance5).
	
	
	
	public void online() {
		
		System.out.println("sales in online");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LearnInheritance5 zz = new LearnInheritance5();
		zz.applyBrake();
		zz.online();
		
		
		
		
	}

}
