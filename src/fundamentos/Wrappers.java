package fundamentos;

import java.util.Scanner;

public class Wrappers {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		//byte
		Byte b = 100;
		Short s = 1000;
		Integer i = Integer.parseInt("10000"); //int
		
		System.out.println("Digite um valor inteiro:");
		Integer a = Integer.parseInt(entrada.nextLine()); //convertendo String em int
		
		Long l = 100000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i);
		System.out.println(a);
		System.out.println(l);
		System.out.println(a * 3);
		System.out.println(l / 3);
		
		Float f = 123.10F;
		System.out.println(f);
		
		Double d = 1234.5678;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("True"); //convertendo String em boolean
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());// convertendo boolean para String
		
		Character c = '#'; //char
		System.out.println(c + "...");
		
		
		entrada.close();
		
	}
}
