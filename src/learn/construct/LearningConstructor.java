package learn.construct;

public class LearningConstructor {
	int a;
	int b;
	
	//assign values to instance variables
	//constructor is called when object is created
	//It should not have return type.
	//same name as class name
	
	
	public LearningConstructor( int a, int b){
		
		System.out.println("calling constructor");
		
		this.a=a;
		this.b=b;
		
		System.out.println(a+" "+b);
	}
	
	//parameterized constructor
	//Non-parameterized constructor.
	//default constructor.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LearningConstructor rr = new LearningConstructor(5,6);
		

	}

}
