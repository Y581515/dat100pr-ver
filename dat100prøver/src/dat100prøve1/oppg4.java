package dat100prøve1;

public class oppg4 {

	public static void main(String[] args) {
		int a,b,c;
		a=6;
		b=3;
		c=9;
		
		int minste = min(a, b, c);
		System.out.println("Minste verdi: " + minste);
	}
	
	private static int min(int x, int y, int z) {
		int minste=x;
		if (y < minste) {
			minste=y;
		}
		if (z < minste) {
			minste=z;
		}
		 
		return minste;
	}
}	 


