
public class Animalss {
	private String name;
	private int numberoflegs;
	
	public Animalss(String name, int numberoflegs) {
		super();
		this.name = name;
		this.numberoflegs = numberoflegs;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumberoflegs() {
		return numberoflegs;
	}
	public void setNumberoflegs(int numberoflegs) {
		this.numberoflegs = numberoflegs;
	}
	@Override
	public String toString() {
		return "Animalss [name=" + name + ", numberoflegs=" + numberoflegs + "]";
	}
	

}
