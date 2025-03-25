package ejercico2;

import java.util.Scanner;

public class Estadistica {
	public static double promedio(double[] datos) {
        double suma = 0;
        for (double num : datos) suma += num;
        return suma / datos.length;
    }

    public static double desviacion(double[] datos, double media) {
        double suma = 0;
        for (double num : datos) suma += Math.pow(num - media, 2);
        return Math.sqrt(suma / (datos.length - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] datos = new double[10];
        System.out.print("Ingrese 10 números: ");
        for (int i = 0; i < 10; i++) datos[i] = sc.nextDouble();
        sc.close();

        double media = promedio(datos);
        System.out.println("El promedio es " + media);
        System.out.println("La desviación estándar es " + desviacion(datos, media));
    }
}
