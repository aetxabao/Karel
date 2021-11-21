public class Tablero {

    private int ancho;
    private int alto;
    private Posicion roca1;
    private Posicion roca2;
    private Posicion roca3;
    private int numeroRocas;

    public Tablero(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public int getNumeroRocas() {
        return numeroRocas;
    }

    public boolean fueraLimite(Posicion pos) {
        if (pos.getX() < 0 || pos.getX() >= ancho) {
            return true;
        }
        if (pos.getY() < 0 || pos.getY() >= alto) {
            return true;
        }
        return false;
    }

    public boolean chocaRoca(Posicion pos) {
        if (roca1 != null && roca1.equals(pos)) {
            roca1 = null;
            numeroRocas--;
            return true;
        }
        if (roca2 != null && roca2.equals(pos)) {
            roca2 = null;
            numeroRocas--;
            return true;
        }
        if (roca3 != null && roca3.equals(pos)) {
            roca3 = null;
            numeroRocas--;
            return true;
        }
        return false;
    }

    public void crearRocas() {
        roca1 = new Posicion(1, 5);
        roca2 = new Posicion(0, 4);
        roca3 = new Posicion(5, 1);
        numeroRocas = 3;
    }

    public void print() {
        String s = String.format("Tablero de tamano %dx%d\nRocas: ", ancho, alto);
        if (roca1 != null)
            s += roca1.toString() + " ";
        if (roca2 != null)
            s += roca2.toString() + " ";
        if (roca3 != null)
            s += roca3.toString() + " ";
        System.out.println(s);
    }

}
