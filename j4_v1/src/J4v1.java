import java.util.Scanner;


public class J4v1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		System.out.println("NOD & NOK from array faster");
		long nod, nok;
		int n;
		long[] nums;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input number of nums: ");
		n = sc.nextInt();
		nums = new long[n];
		
		for (int j = 0; j < nums.length; j++){
			System.out.print("Input num: ");
			nums[j] = sc.nextInt();
		}
		
		nod = gcd(nums[0], nums[1]);
		nok = lcm(nums[0], nums[1]);
		for (int i = 2; i < nums.length; i++){
			nod = gcd(nod, nums[i]);
			nok = lcm(nok, nums[i]);
		}
		
		System.out.println("NOD = " + nod);
		System.out.print("NOK = " + nok);
			
	}
	
	static long gcd(long a, long b){
		return b == 0 ? a : gcd(b, a %b);
	}
	
	static long lcm(long a, long b){
		return a / gcd(a, b) * b;
	}
	

}
