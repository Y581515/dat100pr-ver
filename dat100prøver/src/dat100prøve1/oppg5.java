package dat100prøve1;

import static java.lang.Math.round;

public class oppg5 {

	public static void main(String[] args) {
		
		double areal = round1(sirkelAreal(1.5));
		System.out.println("Areal av sirkelen: " + areal);

	}
	
	private static double sirkelAreal(double radius) {
		
		return Math.PI * radius * radius;
	}
	
	
	private static double round1(double n){
		
		return (double)(round(n*100))/100;
	}

	

}
