import java.text.NumberFormat;


public class Money {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberFormat money = NumberFormat.getCurrencyInstance();
		NumberFormat percent = NumberFormat.getPercentInstance();
		NumberFormat x = NumberFormat.getIntegerInstance();
		
		double initialValue, total, interestRate;
		
		initialValue = 10;
		interestRate = .7;
		
		total = initialValue + initialValue * interestRate;
		
		System.out.println(x.format(total));
		
		

	}

}
