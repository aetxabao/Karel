public class Karel {

    private Posicion posicion;
    private Posicion posicionSiguiente;
    private int direccion;
    private int pasos;

    public Karel(Posicion posicion, int direccion) {
        this.posicion = posicion;
        this.direccion = direccion;
        this.posicionSiguiente = posicion.clone();
        this.pasos = 0;
    }

    public Karel(int x) {
        this.posicion = new Posicion(x, 0);
        this.direccion = Direccion.NORTE;
        this.posicionSiguiente = posicion.clone();
        this.pasos = 0;
    }

    public int getPasos() {
        return pasos;
    }

    public void gira() {
        switch (this.direccion) {
        case Direccion.NORTE:
            this.direccion = Direccion.ESTE;
            break;
        case Direccion.ESTE:
            this.direccion = Direccion.SUR;
            break;
        case Direccion.SUR:
            this.direccion = Direccion.OESTE;
            break;
        case Direccion.OESTE:
            this.direccion = Direccion.NORTE;
            break;
        }
    }

    public Posicion posicionAvanzada() {
        switch (this.direccion) {
        case Direccion.NORTE:
            posicionSiguiente.setX(posicion.getX());
            posicionSiguiente.setY(posicion.getY() + 1);
            break;
        case Direccion.ESTE:
            posicionSiguiente.setX(posicion.getX() + 1);
            posicionSiguiente.setY(posicion.getY());
            break;
        case Direccion.SUR:
            posicionSiguiente.setX(posicion.getX());
            posicionSiguiente.setY(posicion.getY() - 1);
            break;
        case Direccion.OESTE:
            posicionSiguiente.setX(posicion.getX() - 1);
            posicionSiguiente.setY(posicion.getY());
            break;
        }
        return posicionSiguiente;
    }

    public void avanza() {
        pasos++;
        this.posicion.setPosicion(posicionAvanzada());
    }

    public String toString() {
        return String.format("%s %c %2d", posicion, Direccion.letra(direccion), pasos);
    }

    public void print(String txt) {
        System.out.printf("%-10s: %s\n", txt, this.toString());
    }

}
