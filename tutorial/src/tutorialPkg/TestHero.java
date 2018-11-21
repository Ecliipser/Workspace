package tutorialPkg;

public class TestHero {

//constructors
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero h1 = new Hero();
		Hero h2 = new Hero("Superman", "Strength",35);
		Hero h3 = new Hero("Spiderman","Webs",20);
		Hero h4 = new Hero("Daneel","Dad",16);
		
		
		System.out.println(h1.toString());
		System.out.println(h2.toString());
		System.out.println(h3.toString());
		
		Meteorite m = new Meteorite();
		m.mutate(h1);
		m.mutate(h2);
		m.mutate(h3);
		m.mutate(h4);
	}

}
