package learn.methdsconcepts;

public class Methovrload {
	
	//different methods to have the same name, but different signatures
	public double learn(int a, double b) {
		return (a+b);
		
		
	}
	
    public int  learn(int c) {
    	
    	return c;
		
		
	}
	
	
	/*
	 * Changing the Number of Parameters. 
	 * Changing Data Types of the Arguments.
	 * Changing the Order of the Parameters of Methods
	 */

	public static void main(String[] args) {
      
		
		Methovrload b = new Methovrload();
		double f=b.learn(8, 9.8d);
		int g= b.learn(14);
		
		System.out.println(f  + " " +g );

	}

}
