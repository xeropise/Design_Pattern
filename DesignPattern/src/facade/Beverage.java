package facade;

public class Beverage {

	private String name="";
	
	public Beverage(String name) {
		
		this.name = name;
	}
	
	public void Prepare() {
		
		System.out.println(name + " ���� �غ� �Ϸ� ");
	}
}
