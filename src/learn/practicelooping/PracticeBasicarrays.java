package learn.practicelooping;

public class PracticeBasicarrays {
	
	
	
	//collection of similar data types
	//An array can store multiple value of same data type(int, char, String) at the same time and each stored data location has unique Index.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] b= {1,5,9,10,11};
		
		for (int i : b) {
			System.out.println(i);
		}
		
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		
		
		int c[]= new int[5];
		 c[0]=1;
		 c[1]=3;
		 c[2]=4;
		 c[3]=8;
		 c[4]=9;
		 //c[5]=10;
		 //System.out.println(c[5]);//java.lang.ArrayIndexOutOfBoundsException
		 
	
		
		String[][] v= new String[4][2];
		
		v[0][0]="user1";
		v[1][0]="user2";
		v[2][0]="user3";
		v[3][0]="user4";
		
		v[0][1]="Password1";
		v[1][1]="Password2";
		v[2][1]="Password3";
		v[3][1]="Password4";
		
		
		for(int i=0;i<v.length;i++) {
			
			for(int j=0;j<v[i].length;j++) {
		
		System.out.println(v[i][j]);
		
			}	
		
		}
		

	}

}
