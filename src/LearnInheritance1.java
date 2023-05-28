public class LearnInheritance1 {
	//re-usuability
	
	//A class that inherits from another class can reuse the methods and fields of that class. 
	//In addition, you can add new fields and methods to your current class as well.  
	
	
	int vechcost=5000;
	
	 /* when we want to create a new class and there is already a class that includes some of the code that we want, 
	 * we can derive our new class from the existing class.*/
	
	public void applyBrake() {
		System.out.println("applybrake");
		
	}
	public void gear() {
		System.out.println("gear");
	}
	
	private void vehicle() {
		System.out.println("vechicle");
	}
	

	
	
	public static void main(String[] args) {
	

	}

}
