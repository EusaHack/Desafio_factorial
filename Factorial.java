package java_primeros_pasos;

public class Factorial {
	public static void main(String[] args) {
		int factorial = 1;
		for (int i = 1; i < 11; i++) {
			factorial *= i;
			System.out.println("El factorial de " + i + "! = " + factorial);
		}
//		Ejemplo 2
		int n = 0;
		int factorial1 = 1;
		if (n == 0) {
			System.out.println("El factorial de 0! = " + factorial1);
		}else {
			for (int i = 1; i <= n; i++) {
				factorial1 *= i;
				System.out.println("El factorial de " + i + "! = " + factorial1);
			}
		}
	}
}
