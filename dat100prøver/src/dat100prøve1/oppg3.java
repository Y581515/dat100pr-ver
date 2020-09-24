package dat100prøve1;
import static javax.swing.JOptionPane.*;

public class oppg3 {

	public static void main(String[] args) {
		
		int antall=0;
		int sum=0;
		int tall=0;
		
		tall=Integer.parseInt(showInputDialog("tall(avslut med 0)"));
		while (tall !=0) {
			sum+=tall;
			antall++;
			tall=Integer.parseInt(showInputDialog("tall(avslut med 0)"));	
		}System.out.println("sum: "+sum);
		System.out.println("antall tall :"+antall);
		
		do {
			tall = Integer.parseInt(showInputDialog("Tall (avslutt med 0)?"));
			if (tall != 0) {
			sum += tall;
			antall++;
			}
			} while (tall != 0);
			 
			System.out.println("Antall tall: " + antall);
			System.out.println("Sum: " + sum);
	
		
		
		
	
	
	
	}
}
