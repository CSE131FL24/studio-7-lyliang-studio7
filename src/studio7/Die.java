package studio7;

public class Die {
	private int sideNumber;
	
	public Die(int n) {
		this.sideNumber = n;
	}
	public int integer(){
		int integerReturned = (int)(Math.random()*(this.sideNumber))+1;
		return integerReturned;
		
	}
	
	public String toString() {
		String stringName="Side="+this.sideNumber+"Integer="+integerReturned;
		return stringName;
	}
	
	public static void main(String[] args) {
		Die die1 = new Die(6);
		die1.integer();
		System.out.println(die1.integer());
	}
	
}
