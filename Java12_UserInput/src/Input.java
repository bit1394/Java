import java.util.Scanner;


public class Input {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner inp = new Scanner(System.in);
		
		System.out.println ("Whats your name?");
		String name = inp.next();
		
		System.out.println ("Hello " + name);
		
		System.out.print ("Whats your number?");
		Scanner inpNum = new Scanner (System.in);
		int num = inpNum.nextInt ();
		System.out.println ("My num is " + num);
		
	

	}

}
