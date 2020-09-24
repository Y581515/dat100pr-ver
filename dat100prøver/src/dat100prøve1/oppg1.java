package dat100prøve1;

public class oppg1 {
	//1a
	public static void main(String[] args) {
		int a=1;
		if(a<0) {
			System.out.println(a+ " er mindre enn 0");
		}else if (a == 0) {
			System.out.println(a+ " er lik 0");
		}else {
			System.out.println(a+ " er støre enn 0");
		}
		
		//1b
		if (a>=5 && a<=8){
			System.out.println(a + " er innenfor intervallet");
		} else {
			System.out.println(a + " er utenfor intervallet");
		}
		int tall=0;
		//1c
		String svar = "";
		switch (1) {
		case 0:
		svar = "null";
		break;
		case 1:
		svar = "en";
		break;
		case 2:
		svar = "to";
		break;
		case 3:
		svar = "tre";
		break;
		case 4:
		svar = "fire";
		break;
		default:
		svar = "ulovlig verdig";
		}
		System.out.println(svar);
	}
	
}
	