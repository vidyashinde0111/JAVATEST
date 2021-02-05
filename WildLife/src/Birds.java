
public class Birds extends Animals {
	

	@Override
	void move() {
		System.out.println("Move by flying");
		
	}

	@Override
	void eat() {
System.out.println("eat birdfood");		
	}

}
class Fish extends Animals{

	@Override
	void move() {
System.out.println("move by swimming");		
	}

	@Override
	void eat() {
System.out.println("eat seafood");		
	}
	
}
