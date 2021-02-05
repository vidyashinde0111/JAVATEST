
 class Eagle implements Animal, Bird {

	@Override
	public void fly() {
		System.out.println("fly upto 10000 ft");
	}

	@Override
	public void eat() {
		System.out.println("eat reptiles");		

	}

	@Override
	public void sound() {
		System.out.println("highpitch whistle");		
		
	}

}
