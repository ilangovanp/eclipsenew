package learn.practicelooping;

public class PracticeFor1 {
	
	//For-loops are typically used when the number of iterations is known before entering the loop
	
	public void printnumbers() {
		
	for(int i=1;i<=10;i++) {
		System.out.println(i);		
	}}
		
	
	public void printwords() {
		
	for(int i=1;i<=5;i++) {
		System.out.println("Hello world");
	}}
	

	public void addallnumbers() {
		int temp= 0;
		
		for(int i=1;i<=5;i++) {
			 temp= temp + i;		
		}
		System.out.println(temp);
	}
	
	public void printreverse() {
		
		for(int i=5;i>=1;i--) {
			System.out.println(i);		
		}
	
	}
	
public void printfifthtables() {
		int n=5;
		for(int i=1;i<=10;i++) {
			System.out.println(n+""+ "*"+ i +"=" +(n*i));		
		}
	
	}
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PracticeFor1 pf= new PracticeFor1();
		pf.printnumbers();
		pf.printwords();
		pf.addallnumbers();
		pf.printreverse();
		pf.printfifthtables();
			

	}

}
