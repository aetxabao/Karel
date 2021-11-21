public class Direccion {

    public final static int SINDIR = 0;
    public final static int NORTE = 1;
    public final static int ESTE = 2;
    public final static int SUR = 3;
    public final static int OESTE = 4;

    public static char letra(int direccion) {
        switch (direccion) {
            case NORTE:
                return 'N';
            case ESTE:
                return 'E';
            case SUR:
                return 'S';
            case OESTE:
                return 'O';
            default:
                return 'X';
        }
    }

}
