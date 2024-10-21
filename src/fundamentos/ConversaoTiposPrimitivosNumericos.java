package fundamentos;

public class ConversaoTiposPrimitivosNumericos {

	public static void main(String[] args) {

		double a = 1; //Conversão implícita de int para double
		System.out.println(a);
		
		float b = (float) 1.1234567888; //Conversão explícita com perca de informação (CAST)
		System.out.println(b);
		
		int c = 340;
		byte d = (byte) c; //Conversão explícita (CAST)
		System.out.println(d);
		
		double e = 1.99999;
		int f = (int) e; //Conversão explícita (CAST)
		System.out.println(f);
	}

}
