package program.practice;

public class Reverse_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String y="Ilangovan";
		String rev="";
		for(int i=y.length()-1;i>=0;i--) {
		rev=rev+y.charAt(i);
		}
		
		System.out.println(rev);

	}

}
