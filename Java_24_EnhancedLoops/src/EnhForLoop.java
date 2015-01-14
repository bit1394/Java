
public class EnhForLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	String names[] = {"Joe", "Bob", "Mike", "Eugene"};

	for(int i=0; i < names.length; i++){
		System.out.println(names[i]);
	}
	System.out.println();
	//другой способ вывода элементов массива
	
	for(String x: names){
		System.out.println(x);
		
	}
	}

}
