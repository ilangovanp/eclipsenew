package program.practice;

public class Fibonacci_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//0,1,1,2,3,5,8,13
		 int a,b;
		 a=0;
		 b=1;
		 int i=0;
		 int n=8;
	while(i<=n) { 
		if(i!=n) {
		System.out.print(a+","+" ");}
		else {
			System.out.print(a);
		}
		int c=a+b;//1
		a=b;//1
		b=c;//1
		i++;
		}

	}

}
