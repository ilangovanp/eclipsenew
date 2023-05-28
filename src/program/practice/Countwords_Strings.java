package program.practice;

public class Countwords_Strings {

	
	public static void mn(String s) {
	String[] r=s.split(" ");
	int count=0;
	for(String a:r) {
		count++;
		System.out.println(a);	
	}
	System.out.println("Number of words: "+count);
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Work hard in silence";
		Countwords_Strings.mn(s);

	}

}
