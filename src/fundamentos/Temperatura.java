package fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		
		final int CONST1 = 32;
		final double CONST2 = 5/9.0;
		
		double grauCelsius;
		int fareinheint = 0;
		
		fareinheint = 86;
		
		grauCelsius = (fareinheint - CONST1) * CONST2;
		
		System.out.println(grauCelsius);
	}
}
