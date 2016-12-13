package boletin_4_4;

public class Boletin_4_4 {

    public static void main(String[] args) {

        Restaurante mesa1 = new Restaurante(2, 1);

        mesa1.mostrarPulpo();

        mesa1.mostrarPatatas();

        mesa1.mostrarClientes();

        mesa1.añadirPulpo(4);

        mesa1.añadirPatatas(2);

        mesa1.mostrarClientes();
    }

}
