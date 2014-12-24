import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class App {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		String fileName = "test.txt";
		
		ArrayList<Player> players = new ArrayList<Player>();
		
		File file = new File (fileName);
		
		Scanner inp = new Scanner (file);
		
		while (inp.hasNextLine ()){
		
			int number = inp.nextInt ();
			String name = inp.next ();
			
			players.add(new Player (name, number));
		}
		
		inp.close ();
		
		for (Player p: players){
			System.out.println(p);
		}

	}

}
