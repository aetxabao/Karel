public class Posicion {

    private int x;
    private int y;

    public Posicion(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setPosicion(Posicion posicion) {
        this.x = posicion.x;
        this.y = posicion.y;
    }

    public boolean equals(Posicion posicion) {
        return this.x == posicion.x && this.y == posicion.y;
    }

    public Posicion clone() {
        return new Posicion(x, y);
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }

}