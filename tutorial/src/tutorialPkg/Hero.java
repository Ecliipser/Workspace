package tutorialPkg;

public class Hero {

	private String name;
	private String power;
	private int age;
	private int health;
	private int dmgPerHit;
	
	
	public Hero() {
		name = "Jane Doe";
		power = "Super speed";
		age = 20;
		health = 100;
		dmgPerHit = 10;
	}
//constructors
	public Hero(String name, String power, int age, int health, int dmgPerHit) {
		this.name = name;
		this.power = power;
		this.age = age;
		this.health = health;
		this.dmgPerHit = dmgPerHit;
	}
	
	public void setPower(String power) {
		this.power = power;
	}
	
	public void setHealth(int health) {
		this.health = health;
	}
	
	public int getDmgPerHit() {
		return dmgPerHit;
	}
	
	public int getHealth() {
		return health;
	}
	
	public void attack(Hero h) {
		h.setHealth(h.getHealth() - dmgPerHit);
	}
	
	public String toString() {
		return "Name: " + name + " Power: " + power + " Age: " + age;
	
	}

	
}
