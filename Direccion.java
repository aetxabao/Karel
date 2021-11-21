public class Direccion {

    public final static int SINDIR = 0;
    public final static int NORTE = 1;
    public final static int ESTE = 2;
    public final static int SUR = 3;
    public final static int OESTE = 4;

    public static char letra(int direccion) {
        switch (direccion) {
            case Direccion.NORTE:
                return 'N';
            case Direccion.ESTE:
                return 'E';
            case Direccion.SUR:
                return 'S';
            case Direccion.OESTE:
                return 'O';
            default:
                return 'X';
        }
    }

}
