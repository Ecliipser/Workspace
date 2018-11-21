package tutorialPkg;

public class Hero {

	private String name;
	private String power;
	private int age;
	
	public Hero() {
		name = "Jane Doe";
		power = "Super speed";
		age = 20;
	}
//constructors
	public Hero(String name, String power, int age) {
		this.name = name;
		this.power = power;
		this.age = age;
	}
	
	public void setPower(String power) {
		this.power = power;
	}
	public String toString() {
		return "Name: " + name + " Power: " + power + " Age: " + age;
	
	}

	
}
