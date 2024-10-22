package fundamentos;

public class DesafioAritmeticos {
	
	public static void main(String[] args) {
		
		/*
		int a = 3 * 4 - 10;
		int b = (int) Math.pow(a, 3); //(CAST)
		double c = Math.pow(a, 3);
		
		System.out.println(b);
		System.out.println(c);
		*/
		int var1 = 6 * (3 + 2);
		int var2 = (int) Math.pow(var1 , 2) / (3 * 2); //(CAST)
		
		int var3 = (1-5) * (2 - 7) / 2;
		int var4 = (int) Math.pow(var3 , 2); //(CAST)
		
		int var5 = var2 - var4;
		int var6 = (int) Math.pow(var5, 3); //(CAST)
		
		int var7 = (int) Math.pow(10, 3); //(CAST)
		
		int resultado = var6 / var7;
		
		System.out.println(resultado);
		
	}

}
