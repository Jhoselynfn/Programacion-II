package ejercicio;

class Ecuacion {
    private double a, b, c;

    public Ecuacion(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminante() {
        return (b * b) - (4 * a * c);
    }

    public boolean tieneRaices() {
        return getDiscriminante() > 0;
    }

    public boolean tieneRaiz() {
        return getDiscriminante() == 0;
    }

    public double getRaiz1() {
        return (-b + Math.sqrt(getDiscriminante())) / (2 * a);
    }

    public double getRaiz2() {
        return (-b - Math.sqrt(getDiscriminante())) / (2 * a);
    }

    public void resolver() {
        double discriminante = getDiscriminante();
        if (tieneRaices()) {
            System.out.println("La ecuacion tiene dos raices: " + getRaiz1() + " y " + getRaiz2());
        } else if (tieneRaiz()) {
            System.out.println("La ecuación tiene una raiz: " + getRaiz1());
        } else {
            System.out.println("La ecuacion no tiene raices reales");
        }
    }
}

