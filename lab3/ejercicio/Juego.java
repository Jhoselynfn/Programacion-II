public class Juego {
    protected int numeroDeVidas;
    protected int record;

    public void reiniciaPartida() {
        numeroDeVidas = 3;
        System.out.println("Partida reiniciada. ¡Tienes " + numeroDeVidas + " vidas!");
    }

    public void actualizaRecord() {
        record++;
        System.out.println("Nuevo récord: " + record);
    }

    public boolean quitaVida() {
        numeroDeVidas--;
        System.out.println("Te queda(n) " + numeroDeVidas + " vida(s).");
        return numeroDeVidas > 0;
    }
}
