package program.practice;

public class Stringmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String r="flo";
		/*
		 * int k=r.indexOf("flight"); System.out.println(k);
		 */
		
		//int f=r.substring(0, -1);
		
		System.out.println(r.substring(0, 0));
		String a="do%^&*#@ hardwork2345()$!@";
		String k=a.replaceAll("[^a-zA-Z0-9 ]","");
		System.out.println(k);
		
	
		
	}

}
