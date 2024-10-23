package fundamentos.operadores;

public class DesafioLogicos {

	public static void main(String[] args) {
		
		//Trabalho na terça (V ou F)
		//Trabalho na quinta (V ou F)
		
		boolean trabalhoTerca = true;
		boolean trabalhoQuinta = true;
		boolean tomouSorvete = true;
		
		//Operador AND
		if (trabalhoTerca == true && trabalhoQuinta == true) {
			
			System.out.println("Todos vão ao shopping comprar um TV de 50 pol. e tomar sorvete!");
			
			if (tomouSorvete) {
				System.out.println("Todos tomaram sorvete!");
			}
		}
		if (trabalhoTerca == true && trabalhoQuinta == false) {
			System.out.println("Todos vão ao shopping comprar um TV de 32 pol. e tomar sorvete!");
			
			if (tomouSorvete) {
				System.out.println("Todos tomaram sorvete!");
			}
		}
		if (trabalhoTerca == false && trabalhoQuinta == true) {
			System.out.println("Todos vão ao shopping comprar um TV de 32 pol. e tomar sorvete!");
			
			if (tomouSorvete) {
				System.out.println("Todos tomaram sorvete!");
			}
		}
		if (trabalhoTerca == false && trabalhoQuinta == false) {
			
			tomouSorvete = !tomouSorvete;
			
			System.out.println("Todos não vâo ao shopping e não vão tomar sorvete!\n");
			
			if (tomouSorvete == false) {
				System.out.println("Todos estão mais saudáveis!");
			}
			
		}
		
		//Operador OR
		if (trabalhoTerca == true || trabalhoQuinta == true) {
			
		}
		if (trabalhoTerca == true || trabalhoQuinta == false) {
			
		}
		if (trabalhoTerca == false || trabalhoQuinta == true) {
			
		}
		if (trabalhoTerca == false || trabalhoQuinta == false) {
			
		}
		
		//Operador XOR
		if (trabalhoTerca == true ^ trabalhoQuinta == true) {
			
		}
		if (trabalhoTerca == true ^ trabalhoQuinta == false) {
			
		}
		if (trabalhoTerca == false ^ trabalhoQuinta == true) {
			
		}
		if (trabalhoTerca == false ^ trabalhoQuinta == false) {
			
		}
		
		//Operador NOT
		if (!trabalhoTerca == false) {
			
		}
		if (!trabalhoTerca == true) {
			
		}
		if (!trabalhoQuinta == false) {
			
		}
		if (!trabalhoQuinta == true) {
			
		}
	}
	
}
