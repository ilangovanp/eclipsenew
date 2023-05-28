package program.practice;

public class Reverse_eachwordina_sentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String h="Work hard in silence";
		
		String revWord="";
		String Rev="";
		String[] Words=h.split(" ");
		
		for(int k=0;k<Words.length;k++) {
			String W=Words[k];//Work
			for(int i=W.length()-1;i>=0;i--) {
				
				revWord= revWord+ W.charAt(i);//krow
				
			
				
			}
			
			Rev=Rev+revWord+" ";
			revWord="";
			}
		
		System.out.println(Rev.trim());
		
		

	}

}
