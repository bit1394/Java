
public class Arrrs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arFromNew [] = new int [10];
		int arFromSet [] = {12, 13, 45, 67};
		
		arFromNew [0] = 23;
		arFromNew [3] = 42;
		arFromNew [9] = 63;
		
		for (int index = 0; index < arFromNew.length; index++ ){
		System.out.println(arFromNew[index]);
		}
		
		for (int yandex = 0; yandex < arFromSet.length; yandex++){
			System.out.println(arFromSet[yandex]);
		}
		
		

	}

}
