package ejercicio;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese a, b, c: ");
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
        sc.close();

        Ecuacion eq = new Ecuacion(a, b, c);
        eq.resolver();
    }
}
