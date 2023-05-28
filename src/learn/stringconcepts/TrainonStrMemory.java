package learn.stringconcepts;

public class TrainonStrMemory {
	
	String s1="welcome";
	String s2="welcome"; //It doesn't create a new instance
	//String literal-memory efficient
	// Both s1 and s2 will point to same welcome in string constant pool
	
	
	String s3 =new String("hi");
	String s4 =new String("hi");
	
	// s3 and s4(Two memories) will be created in heap memory.
	
	
	
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Words = "Knowledge";
		Words.concat("gain");
		System.out.println(Words);//string is immutable
		
		String addedword= Words.concat(" gain");
		System.out.println(addedword);

	}

}
