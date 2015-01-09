import java.util.Scanner;


public class Loop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		int i, sumGrades, averGrade;
		
		sumGrades = 0;
		
		
		Scanner inp = new Scanner (System.in);
		
		System.out.println ("Input number of your classes: ");
		int numClasses = inp.nextInt();
		
		for (i = 1; i <= numClasses; i++){
			System.out.println ("Input your GRADE in " + i + " class: ");
			int grade = inp.nextInt();
			sumGrades = sumGrades + grade;			
		}
		
		averGrade = (int) ((Math.round(sumGrades / numClasses )) / 20);
		
//		if (averGrade >= 85){
//			System.out.println ("Your grade is 5");
//		}
//		if( (averGrade < 85 ) && (averGrade >= 75)) {
//			System.out.println ("Your grade is 4");
//		}
//		if ((averGrade < 75) && (averGrade >= 50) ){
//			System.out.println ("Your grade is 3");
//		}
//		if  (averGrade < 50){
//			System.out.println ("Your grade is 2");
//		}
		System.out.println (sumGrades / numClasses);
		System.out.println (averGrade);
		
		switch (averGrade){
		case 5:
			System.out.println ("Your grade is 5");
			break;
		case 4:
			System.out.println ("Your grade is 4");
			break;
		case 3:
			System.out.println ("Your grade is 3");
			break;
		default: 
			System.out.println ("Your grade is 2");
		}
	
				
		// TODO Auto-generated method stub

	}

}
