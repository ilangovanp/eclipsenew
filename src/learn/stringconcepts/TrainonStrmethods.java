package learn.stringconcepts;

public class TrainonStrmethods {
	
	
	public char learn(int c) {
		
		String name = "Hardwork";
		char value= name.charAt(c);
		
		return value;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TrainonStrmethods vc = new TrainonStrmethods();
		char qwer=vc.learn(3);
		System.out.println(qwer);
		
		
		
		String Words = "Knowledge";
		Words.concat("gain");
		System.out.println(Words);//string is immutable
		
		String addedword= Words.concat("gain");
		System.out.println(addedword);
		
		String ccx=Words.substring(3);//
		System.out.println(ccx);
		
		String ccxx=Words.substring(4, 8);//will not consider last index
		System.out.println(ccxx);
		
		
		
		
		
		
		/*
		 * Words.length(); Words.contains("w"); Words.equals("Knowledge");
		 * Words.equalsIgnoreCase("knowledge"); Words.indexOf(5);
		 */
		
		
		
		String Sentence="hi how are you";
				
		String[] ab=Sentence.split(" ");//using space
		String vv="";
		int count=0;
		/*
		 * for (String vhjc : ab) {
		 * 
		 * System.out.println(vhjc); }
		 */
		for(int i=0;i<ab.length;i++) {
			
			System.out.println(ab[i]);
			 vv=vv+ab[i]+" ";
			count++;
			
		}
		System.out.println(vv);
		System.out.println(count);
		
		
		
		
		
		

	}

}
