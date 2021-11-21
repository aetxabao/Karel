import java.util.Arrays;

public class Juego {

    private final int ANCHO = 6;
    private final int ALTO = 6;
    private final int LIMITE = 30;

    private Tablero tablero;
    private Karel karel;
    private Entrada entrada;

    public void run() {
        inicio();
        gameLoop();
        fin();
    }

    private void inicio() {
        entrada = new Entrada();
        tablero = new Tablero(ANCHO, ALTO);
        tablero.crearRocas();
        tablero.print();
        int x = entrada.leerEntero("Columna inicio", 0, ANCHO - 1);
        karel = new Karel(x);
        karel.print("Inicio");
    }

    private void gameLoop() {
        while (tablero.getNumeroRocas() > 0 && karel.getPasos() < LIMITE) {

            if (tablero.fueraLimite(karel.posicionAvanzada())) {
                karel.print("Limite");
                karel.gira();
                karel.print("Gira");
            } else if (tablero.chocaRoca(karel.posicionAvanzada())) {
                karel.print("* Roca");
                karel.gira();
                karel.print("Gira");
            } else {
                karel.avanza();
            }

        }
    }

    private void fin() {
        int rocas = tablero.getNumeroRocas();
        if (rocas == 0) {
            System.out.print("Karel ha dado " + karel.getPasos() + " pasos");
        } else {
            karel.print("Power off");
            System.out.print("Sin bateria, sin recoger " + rocas);
        }
        System.out.println(". FIN.");
    }

}
