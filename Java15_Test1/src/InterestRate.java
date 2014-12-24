import java.text.NumberFormat;
import java.util.Scanner;


public class InterestRate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		NumberFormat money, percent;
		int depositAmount, interestRate,  years; //для целых значений валюты и срока в годах
		double result;
		int i;
				
		money = NumberFormat.getCurrencyInstance();
		percent = NumberFormat.getPercentInstance();
		result = 0.0;
		
		Scanner userInput = new Scanner (System.in);
		
		System.out.print("Input Your deposit amount: ");
		depositAmount = userInput.nextInt();
		
		System.out.print("Input Your annual interest rate: ");
		interestRate = userInput.nextInt();
		
		
		System.out.print("Input Your time in years: ");
		years = userInput.nextInt();
		
		for (i = 0; i < years; i++){
			result += depositAmount + depositAmount * interestRate/100;
		}
		
		System.out.print
		("Since " + years + " years, with Your interest rate in " + percent.format((double)interestRate/100));
		System.out.print(" You will have " + money.format(result));
		
	}

}
