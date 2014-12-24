
public class Player {
	private String name;
	private int JerseyNumber;
	
	public Player (String name, int JerseyNumber) {
		
		this.name = name;
		this.JerseyNumber = JerseyNumber;
	}
	
	public String toString (){
		String output = name + " wears num " + JerseyNumber;
		return output;
	}
}
