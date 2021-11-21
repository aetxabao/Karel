import java.util.Arrays;

public class Juego {
    private final boolean PIDE_ENTER = true;
    private final boolean PINTA = true;
    private final boolean PINTA_PASOS = true;

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
        pinta();
        int x = entrada.leerEntero("Columna inicio", 0, ANCHO - 1);
        karel = new Karel(x);
        karel.print("Inicio");
        pinta();
    }

    private void gameLoop() {
        while (tablero.getNumeroRocas() > 0 && karel.getPasos() < LIMITE) {

            if (tablero.fueraLimite(karel.posicionAvanzada())) {
                karel.print("Limite");
                pinta();
                karel.gira();
                karel.print("Gira");
                pinta();
            }else if (tablero.chocaRoca(karel.posicionAvanzada())) {
                karel.print("* Roca");
                pinta();
                karel.gira();
                karel.print("Gira");
                pinta();
            } else {
                karel.avanza();
                if (PINTA_PASOS) pinta();
            }

        }
    }

    private void fin() {
        int rocas = tablero.getNumeroRocas();
        if (rocas == 0) {
            System.out.print("Karel ha dado " + karel.getPasos() + " pasos");
        } else {
            karel.print("Power off");
            pinta();
            System.out.print("Sin bateria, sin recoger " + rocas);
        }
        System.out.println(". FIN.");
    }

    private void pinta() {
        if (!PINTA) return;
        String[][] panel = {
                {"#","#","#","#","#","#","#","#"},
                {"5"," "," "," "," "," "," ","#"},
                {"4"," "," "," "," "," "," ","#"},
                {"3"," "," "," "," "," "," ","#"},
                {"2"," "," "," "," "," "," ","#"},
                {"1"," "," "," "," "," "," ","#"},
                {"0"," "," "," "," "," "," ","#"},
                {"#","0","1","2","3","4","5","#"}
        };
        if (tablero!=null) {
            tablero.situacion(panel);
        }
        if (karel !=null) {
            karel.situacion(panel);
        }
        System.out.println();
        for(String[] fila : panel){
            System.out.println(Arrays.toString(fila));
        }
        System.out.println();
        if (PIDE_ENTER){
            entrada.leerEnter();
        }
    }

}
