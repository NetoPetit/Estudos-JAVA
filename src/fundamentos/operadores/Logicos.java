package fundamentos.operadores;

public class Logicos {
	
	public static void main(String[] args) {
		
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		
		System.out.println(condicao1 && condicao2);
		System.out.println(condicao1 && !condicao2); //operadores lógicos podem ser misturados
		System.out.println(condicao1 || condicao2);
		System.out.println(condicao1 ^ condicao2);
		System.out.println(!condicao1);
		System.out.println(!!condicao1); //dupla negação
		System.out.println(!condicao2);
		
		//TABELA VERDADE E (AND)
		System.out.println(true && true); //true
		System.out.println(true && false); //false
		System.out.println(false && true); //false
		System.out.println(false && false); //false
		
		//TABELA VERDADE OU (OR)
		System.out.println(true || true); //true
		System.out.println(true || false); //true
		System.out.println(false || true); //true
		System.out.println(false || false); //false
		
		//TABELA VERDADE OU EXCLUSIVO (XOR)
		System.out.println(true ^ true); //false
		System.out.println(true ^ false); //true
		System.out.println(false ^ true); //true
		System.out.println(false ^ false); //false
		
		//TABELA VERDADE NAO (NOT)
		System.out.println(!true); //false
		System.out.println(!false); //true
		
	}

}
