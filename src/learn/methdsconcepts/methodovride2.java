package learn.methdsconcepts;

public class methodovride2 extends methodovride1 {
	
	
	
   public void study() {
		
	   System.out.println("Child implementation");
		
	}
	
	/*
	 * Rules: The access modifier for an overriding method can allow more, but not less, access than the overridden method.
	 * Final methods, static methods and private methods can not be overridden. 
	 * The overriding method must have same return type (or subtype) Invoking overridden method from sub-class:We can
	 * call parent class method in overriding method using super keyword.
	 *  If the super-class overridden method does throws an exception, subclass overriding method can only throw same, subclass exception
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		methodovride2  jk= new methodovride2();
		jk.study();
		
		
		methodovride1  vk= new methodovride2();
		vk.study();
		
		methodovride1  ak= new methodovride1();
		ak.study();
	}

}
