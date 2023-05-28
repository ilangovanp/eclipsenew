

public class LearnInheritance3 extends LearnInheritance2{
	//multilevel inheritance
	public void bike() {
		
		System.out.println("new bike");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LearnInheritance3 kr = new LearnInheritance3();
		
		kr.applyBrake();
		kr.car();
		kr.bike();
		
		

	}

}
