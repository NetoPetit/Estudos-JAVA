package fundamentos.operadores;

public class DesafioLogicosResolucaoAula {

	public static void main(String[] args) {
		
		boolean trabalho1 = false;
		boolean trabalho2 = false;
		
		boolean comprouTV50 = trabalho1 && trabalho2;
		boolean comprouTV32 = trabalho1 ^ trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2;
		boolean maisSaudavel = !comprouSorvete; //Operador Unário !
		
		System.out.println("Comprou TV50\" ? " + comprouTV50);
		System.out.println("Comprou TV32\" ? " + comprouTV32);
		System.out.println("Comprou sorvete ? " + comprouSorvete);
		System.out.println("Mais saudável ? " + maisSaudavel);
		
	}   
}
