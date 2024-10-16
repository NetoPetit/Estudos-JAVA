package fundamentos;

import java.util.Scanner;

public class TratamentoNext {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		 
		System.out.println("Qual a sua idade?");
	    int idade = teclado.nextInt();
	    //nextInt vai deixar um "\n" para trás que será lido pelo nextLine seguinte

	    System.out.println("Qual o seu nome?");
	    String nome = teclado.nextLine();
	    //nextLine vai ler o "\n" deixado para trás e pular para o sobrenome
	    
	    System.out.println("Qual o seu sobrenome?");
	    String sobrenome = teclado.nextLine();
	 
	    //***COMO CORRIGIR***
	    
	    System.out.println("Qual a sua idade?");
	    int idadeDois = teclado.nextInt();// vai pegar apenas o inteiro digitado e deixará o "\n" para trás
	    
	    //"\n" ficará na fila de entrada
	    
	    //*correção*
	    teclado.nextLine(); //lê o "\n" que a interação teclado.nextInt() deixa para trás.
	    
	    //depois o resto do código será executado normalmente, sem pular interação com o usuário
	    System.out.println("Qual o seu nome?");
	    String nomeDois = teclado.nextLine();
	    System.out.println("Qual o seu sobrenome?");
	    String sobrenomeDois = teclado.nextLine();
	 
	    teclado.close();
	    
	}

}
