package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		
		 System.out.print("Bom");
		 System.out.print(" dia!\n\n");
		 
		 System.out.println("Bom");
		 System.out.println("dia!");
		 
		 System.out.printf("Megasena: %d %d %d %d %d %d \n", 1, 2, 3, 4, 5, 6);
		 
		 System.out.printf("Salário: %.1f\n", 1234.5678);
		 
		 System.out.printf("Nome: %s\n", "João");
		 
		 Scanner entrada = new Scanner(System.in);
		 
		 System.out.println("Qual seu nome?");
		 String nome = entrada.nextLine();
		 
		 System.out.println("Qual seu sobrenome?");
		 String sobrenome = entrada.nextLine();
		 
		 System.out.println("Qual sua idade?");
		 int idade = entrada.nextInt();
		 
		 System.out.println("Seu nome é " + nome + " " + sobrenome + ", idade " + idade);
		 
		 System.out.printf("%s %s é seu nome. %d é sua idade.", nome, sobrenome, idade);
		 
		 entrada.close();
		 
		
	}
}
