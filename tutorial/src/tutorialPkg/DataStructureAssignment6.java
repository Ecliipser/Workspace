package tutorialPkg;
import java.util.ArrayList;
import java.util.Scanner;
public class DataStructureAssignment6 {

	public static void main(String[] args) {
		ArrayList<String> allSongs = new ArrayList<String>();
		ArrayList<String> artists = new ArrayList<>();
		ArrayList<String> partyPlaylist = new ArrayList<>();
		
		allSongs.add("Song: Thank u, next");
		artists.add("Artist: Ariana Grande");
		
		allSongs.add("Song: Happier");
		artists.add("Artist: Marshmallow");
		
		allSongs.add("Song: Without Me");
		artists.add("Artist: Halsey");
		
		int choice = 0;
		boolean flag = true;
		do {
		//print library of songs and artists
		System.out.println();
		for(int i = 0; i < allSongs.size(); i++) {//print all songs
			System.out.println(i + " " + allSongs.get(i) 
								+ " " + artists.get(i));
		}
		
		System.out.println("1. add to library\n " +
						   "2. delete from library\n" +
						   "3. add to party playlist \n" +
						   "4. exit");
		
	Scanner input = new Scanner(System.in);
	int choice1 = input.nextInt();
	
	switch(choice1) {
	case 1:
		input.nextLine();//Gets rid of extra enter character
		System.out.println("Enter song title: ");
		allSongs.add(input.nextLine());
		System.out.println("Enter artist: ");
		artists.add(input.nextLine());
		break;
	
	case 2:
		System.out.println("Enter song number to delete: ");
		int delete = input.nextInt();
		allSongs.remove(delete);
		artists.remove(delete);
		break;
	
	case 3:
		 System.out.println("Enter song # to add to party playlist: ");
		 partyPlaylist.add(allSongs.get(input.nextInt()));
		 break;
		 
	case 4:
		 System.out.println("Bye! ");
		 flag = false;
		 break;
		 
	default:
		System.out.println("Invalid option");
	}//end switch
	
		}while(flag);
	
	
	
	
	
	}

}







