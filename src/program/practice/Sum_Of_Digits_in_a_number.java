package program.practice;

public class Sum_Of_Digits_in_a_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "123456";
		int sum=0;
		for(int i=0;i<a.length();i++) {
			char v=a.charAt(i);
			int h=Integer.parseInt(String.valueOf(v));
			sum=sum+h;
			
		}
		
	System.out.println(sum);	
		

	}

}
