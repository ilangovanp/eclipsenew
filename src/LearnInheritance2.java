
public class LearnInheritance2 extends LearnInheritance1{
	//single inheritance
	public void car() {
		
		System.out.println("new model");
	}
	//by using the object of the subclass we can also access the members of a superclass. 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		LearnInheritance2 hyi = new LearnInheritance2();
		hyi.car();
		hyi.applyBrake();
		int a=hyi.vechcost;
          System.out.println(a);
	}

}
