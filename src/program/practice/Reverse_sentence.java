package program.practice;

public class Reverse_sentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String d="Hard Work Never Fails";
		
		String[] b=d.split(" ");
		String Rev="";
		for(int i=b.length-1;i>=0;i--) {
			
			Rev=Rev+" "+b[i];
			
			
		}
		System.out.println(Rev.trim());
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
