
public class LearnInheritance4 extends LearnInheritance1 {
	
	
	
	//LearnInheritance4 and LearnInheritance5 are examples of hierarchial inheritance.
	// class LearnInheritance1 serves as a base class for the derived classes (LearnInheritance4 and LearnInheritance5).
 public void showroom()
 {
	 System.out.println("sales in showroom");
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LearnInheritance4 mm = new LearnInheritance4();
		mm.applyBrake();
		mm.showroom();
	}

}
