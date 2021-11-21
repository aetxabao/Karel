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
        //
        // TODO: chocaRoca
        //
        // si la posicion pasada como parametro tiene las mismas 
        // coordenadas que cualquiera de las tres rocas que pueda 
        // haber, se reducira en uno el contador de rocas, atributo 
        // numeroRocas, y se anulara la referencia de la roca que 
        // coincida. Por ejemplo, si quedan las rocas roca1 en (1,5) y 
        // roca3 en (5,1) y la posicion pos que se pasa esta en (5,1), 
        // ademas de descontar el numero de rocas se debe poner roca3 
        // igual a null. Se debe utilizar el metodo mas adecuado de la 
        // clase Posicion para comprobar si dos posiciones coinciden. 
        // Este metodo no debe lanzar ninguna excepcion de referencia 
        // nula.
        //
        return false;
    }

    public void crearRocas() {
        roca1 = new Posicion(1,5);
        roca2 = new Posicion(0,4);
        roca3 = new Posicion(5,1);
        numeroRocas = 3;
    }

    public void print() {
        String s = "Tablero de tamano " + ancho + "x " + alto + "\n";
        s += "Rocas: ";
        if (roca1 != null) {
            s += roca1.toString() + " ";
        }
        if (roca2 != null) {
            s += roca2.toString() + " ";
        }            
        if (roca3 != null) {
            s += roca3.toString() + " ";
        }
        System.out.println(s);
    }

}
