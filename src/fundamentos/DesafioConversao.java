package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro salário:");
		String salario1 = entrada.nextLine().replace("," , ".");
		
		System.out.println("Digite o segundo salário:");
		String salario2 = entrada.nextLine().replace("," , ".");
		
		System.out.println("Digite o terceiro salário:");
		String salario3 = entrada.nextLine().replace("," , ".");
		
		double conversaoSalario1 = Double.parseDouble(salario1);
		double conversaoSalario2 = Double.parseDouble(salario2);
		double conversaoSalario3 = Double.parseDouble(salario3);
		
		double mediaSalario = (conversaoSalario1 + conversaoSalario2 + conversaoSalario3) / 3 ;
		
		System.out.printf("A média dos seus três últimos salários é R$%.2f", mediaSalario);
		
		entrada.close();
	}

}
