package ejercico2;

public class EstadisticaP {
	 private double[] datos;

	 public EstadisticaP(double[] datos) {
	        this.datos = datos;
	 }

	 public double getPromedio() {
	        double suma = 0;
	        for (double num : datos) suma += num;
	        return suma / datos.length;
	 }

	 public double getDesviacion() {
	        double media = getPromedio();
	        double suma = 0;
	        for (double num : datos) suma += Math.pow(num - media, 2);
	        return Math.sqrt(suma / (datos.length - 1));
	 }

	 public void mostrarResultados() {
	        System.out.println("El promedio es " + getPromedio());
	        System.out.println("La desviación estándar es " + getDesviacion());
	 }
}
