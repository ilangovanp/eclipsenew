package learnabstraction;

public class Learnabstract1 extends Learnabstract {
	
	//you will get error to implement the abstract methods in the superclass here.
    //Any class extending an abstract class must implement all abstract methods. If it does not implement, it must be declared as abstract.
	
	public static void main(String[] args) {

		//You can’t create objects to abstract class even though it does not contain any abstract methods.
		Learnabstract1 yu =  new Learnabstract1();
		yu.normal();
		yu.create();
		yu.delete();

	}

	
	public void create() {

		System.out.println("create");
	}

	
	public void delete() {

		System.out.println("delete");
	}


	public void remove() {

		
		
		System.out.println("remove");
	}

}
