import java.util.Scanner;


public class J4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] nums;
		int nod, nok;
				
		System.out.println("NOD & NOK of 2 nums");
		
		Scanner inp = new Scanner(System.in);
		System.out.println("Input number of nums: ");
		int n = inp.nextInt();
		
		nums = new int[n];
		
		for (int i = 0; i < nums.length; i++){
			System.out.print("Input num: ");
			nums[i] = inp.nextInt();
		}
		
		nod = Nod(nums[0], nums[1]);
		for (int x = 2; x < nums.length; x++){
			nod = Nod(nod, nums[x]);
		}
		
		System.out.println("NOD = " + nod);
		
		nok = Nok(nums[0], nums[1]); 
			for (int y = 2; y < nums.length; y++){
			nok = Nok(nok, nums[y]);
		}
			
		System.out.println("NOK = " + nok);

	}
	static int Nod(int a, int b){
		int nod_ = 0;
		int min;
		if (a > b) {
			min = b;
		} else {
			min = a;
		}
		
		
		for (int c = 1; c <= min; c++){
			if ((a % c == 0) && (b % c == 0)){
				if (c > nod_){
					nod_ = c;
				}
			}
		}
		return nod_;
	}
	
	static int Nok (int a, int b){
		int nok_;
		nok_ = a / Nod(a, b) * b;
		return nok_;
	}
	
	

}
