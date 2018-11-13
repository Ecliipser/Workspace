package tutorialPkg;
import java.util.Random;
public class Array1{
	public static void main(String[] args) {
		String[] nameArray = {"christian","Tyrone","uniqua","scott","nya","mr.truong"};
		int[] gradesArray = new int[nameArray.length];
		int avg = 0;
		
		for(int i = 0; i < nameArray.length; i++) {//print
			System.out.println("Name: " + nameArray[i] + " Grade: " + gradesArray[i]);
		}
		Random r = new Random();//creates random object
		
		for(int i = 0; i < gradesArray.length; i++) {
			gradesArray[i] = r.nextInt(101);
		}
		
		for(int i = 0; i < nameArray.length; i++) {//print arrays
			System.out.println("Name: " + nameArray[i] + " Grades: " + gradesArray[i]);
			
		}
		gradesArray[5] = 85;//update index 5
		System.out.println();
		for(int i = 0; i < nameArray.length; i++) {
		System.out.println("Name: " + nameArray[i] + " Grades: " + gradesArray[i]);
		
		}
		
		for(int i = 0; i < nameArray.length; i++) {//avg
			avg += gradesArray[i];//summing the grades
//			 System.out.println(avg);
			
		}
		avg = avg/gradesArray.length;//dividing by total number of grades
		System.out.println("class average: " + avg);//print the avg
	}

}


