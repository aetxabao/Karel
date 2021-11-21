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
        //
        // TODO:
        //
        // escribe un bucle para que mientras el numero de rocas del
        // tablero sea mayor que cero y karel no haya llegado al limite
        // de pasos (definido como constante de la clase) se ejecuten
        // las siguientes acciones:
        //
        // si la posicion a la que avanzaria karel esta fuera de los
        // limites del tablero, se imprime el estado de karel despues
        // del mensaje "Limite", karel gira y se vuelve a imprimir el
        // nuevo estado con la direccion cambiada junto al mensaje
        // "Gira".
        //
        // si la posicion a la que avanzaria karel coincide con alguna
        // roca, la roca se debe destruir como se ha indicado en el
        // metodo chocaRoca de la clase Tablero. En esta circunstancia
        // imprime el estado de karel despues del mensaje "* Roca",
        // gira a karel y vuelve a imprimir el nuevo estado con la
        // direccion cambiada junto al mensaje "Gira".
        //
        // si karel no se encuentra en ninguna de las dos circunstancias
        // anteriores karel debe avanzar una posicion en la direccion
        // que tenga, nada se lo impide.
        //
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
