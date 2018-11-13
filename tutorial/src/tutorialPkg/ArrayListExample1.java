package tutorialPkg;

import java.util.ArrayList;

public class ArrayListExample1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> listOfInts = new ArrayList<>();
		//useful methods of ArrayList:
		
		listOfInts.add(98);//adding to ArrayList
		listOfInts.add(55);
		listOfInts.add(1,80);//inserts to index 1
		listOfInts.remove(0);//removes item at first index
		listOfInts.get(0);//returns item at index 0
		listOfInts.size();//returns size of ArrayList
		
		//print ArrayList
		listOfInts.add(98);
		listOfInts.add(24);
		
		for(int i = 0; i < listOfInts.size(); i++) {
			System.out.println(listOfInts.get(i));
		}
		
		listOfInts.remove(listOfInts.size()-1);//remove last element
		//print new ArrayList
		for(int i = 0; i < listOfInts.size(); i++) {
			System.out.println(listOfInts.get(i));
		}

	}

}
