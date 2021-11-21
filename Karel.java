public class Karel {

    private Posicion posicion;
    private Posicion posicionSiguiente;
    private int direccion;
    private int pasos;

    public Karel(Posicion posicion, int direccion) {
        //
        // TODO: constructor 1
        //
        // crea el robot en la posicion y direccion dados en los 
        // parametros e inicializa todos los atributos logicamente. 
        // El atributo posicionSiguiente se debe inicializar con una 
        // referencia no nula a un objeto con los mismos valores que 
        // posicion. Los atributos posicion y posicionSiguiente deben 
        // ser dos objetos clones.
        //
    }

    public Karel(int x) {
        //
        // TODO: constructor 2
        //
        // crea el robot en una posicion inicial (x,0) y direccion 
        // norte (usa la constante de la clase Direccion). Igual que en
        // el constructor anterior, todos los atributos deben quedar 
        // explicitamente inicializados. El atributo posicionSiguiente 
        // debe ser iniciado igual que en el metodo constructor anterior. 
        //
    }
    
    public int getPasos() {
        return pasos;
    }

    public void gira() {
        //
        // TODO: gira
        //
        // mutador para cambiar la direccion de movimiento del robot. 
        // La direccion ha de cambiar de 90º en 90º hacia la derecha. 
        // Para ello se debe utilizar un switch (no vale if) y las 
        // constantes estaticas de la clase Direccion. La secuencia 
        // seria: N -> E, E -> S, S -> O,  O -> N.
        //
    }

    public Posicion posicionAvanzada() {
        //
        // TODO: posicionAvanzada
        //
        // fija las coordenadas x e y en el atributo posicionSiguiente 
        // que se devuelve en este metodo. Las coordenadas son las de 
        // la posicion a la que avanzaria el robot con la direccion que
        // tiene, independientemente de si es fuera del tablero o si 
        // puede haber una roca, esto se controlara en otra clase. 
        // Las coordenadas del atributo posicion no son modificadas, 
        // solo consultadas. Solo se modificaran las coordenadas de la 
        // referencia posicionSiguiente, no se debe instanciar ningun 
        // nuevo objeto.
        //
        return posicionSiguiente;
    }

    public void avanza() {
        //
        // TODO: avanza
        //
        // incrementa el numero de pasos en uno y copia los valores de 
        // la posicion avanzada tras ejecutar el método posicionAvanzada 
        // en el atributo posicion. El atributo posicion debe ser la 
        // misma instancia cuyo estado cambiara, no debe ser una 
        // referencia de memoria nueva ni ser el mismo objeto que 
        // posicionAvanzada. El atributo posicion sera el mismo objeto 
        // con los valores iguales a los del objeto posicionSiguiente
        // que se habran modificado en el metodo posicionAvanzada. 
        // Para copiar valores entre posiciones utiliza un metodo de la
        // clase Posicion. 
        // 
    }

    public String toString() {
        String s = "";
        //
        // TODO: toString
        //
        // devuelve un texto de la forma: (0,5) E 17. Siendo la 
        // representación entre parentesis el resultado del metodo 
        // toString de la clase Posicion, E la direccion del robot 
        // devuelta por el metodo letra de la clase Direccion y 
        // 17 el numero de pasos que se ha desplazado. Utiliza el 
        // metodo String.format con los parametros indicados.
        // 
        // Observa en las trazas como se alinean los valores incluyendo
        // las unidades de los pasos dados.
        //
        // Limite    : (5,5) E  7
        // Gira      : (5,5) S  7
        // * Roca    : (5,2) S 10
        //
        return s;
    }

    public void print(String txt) {
        //
        // TODO: print
        //
        // imprime por salida estandar el texto del parametro junto a 
        // la representacion del robot como se ve en los resultados de 
        // las trazas, alineando el texto a la izquierda utilizando un 
        // espacio de diez caracteres para ello, p. ej. 
        // “* Roca    : (0,5) E 17” 
        // si el texto es “* Roca” y el estado el representado.
        //
        // Observa en las trazas como se alinean los valores incluyendo
        // las unidades de los pasos dados.
        //
        // Limite    : (5,5) E  7
        // Gira      : (5,5) S  7
        // * Roca    : (5,2) S 10
        //
    }

}
