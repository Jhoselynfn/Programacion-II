package ejercico2;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] datos = new double[10];
        System.out.print("Ingrese 10 numeros: ");
        for (int i = 0; i < 10; i++) datos[i] = sc.nextDouble();
        

        EstadisticaP estadistica = new EstadisticaP(datos);
        estadistica.mostrarResultados();
    }
}
