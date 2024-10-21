package fundamentos;

public class Aritmeticos {

	public static void main(String[] args) {
		
		var x = 34.56;
		double y = 2.2;
		
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		
		int a = 3;
		int b = 8;
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a / (double) b);
		System.out.println(a / (float) b);
		
		System.out.println(a % b);
		System.out.println(8 % 3);
		
		System.out.println(x + y - a * b);
	}
}
