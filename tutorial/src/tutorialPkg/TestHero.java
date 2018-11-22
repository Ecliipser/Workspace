package tutorialPkg;

public class TestHero {

//constructors
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero h1 = new Hero();
		Hero h2 = new Hero("Superman", "Strength",35,100,12);
		Hero h3 = new Hero("Spiderman","Webs",20,125,20);
		Hero h4 = new Hero("Daneel","Dad",16,9000,9000);
		
		
		System.out.println(h1.toString());
		System.out.println(h2.toString());
		System.out.println(h3.toString());
		System.out.println(h4.toString());
		
		Meteorite m = new Meteorite();
		m.mutate(h1);
		m.mutate(h2);
		m.mutate(h3);
		m.mutate(h4);
		
		System.out.println(h1.toString());
		System.out.println(h2.toString());
		System.out.println(h3.toString());
		System.out.println(h4.toString());
		System.out.println();
		
		while(h1.getHealth() > 0) {
		h2.attack(h1);
		System.out.println("Hero 1 health: " + h1.getHealth());
	}//end while
	}

}
