package learn.Collection;

import java.util.HashMap;

public class PracticeHashmap {

	public static void main(String[] args) {
		
		
		HashMap<Integer, String> vv = new HashMap<Integer, String>();
		
		vv.put(1, "Hello"); 
		vv.put(null, "Ilango");
		
     System.out.println(vv);
     System.out.println(vv.get(null));
     
     
    System.out.println(vv.entrySet());
    System.out.println(vv.values());
    
    for(Object bc:vv.entrySet()) {
    	
    	
    	System.out.println(bc);
    	
    }
    
    
    for (Object stng :vv.keySet() ) {
    	System.out.println(stng);
		
	}
    
    for (String str : vv.values()) {
    	
    	System.out.println(str);
		
	}
    
    
    
    
    
   			
		
		// TODO Auto-generated method stub

	}

}
