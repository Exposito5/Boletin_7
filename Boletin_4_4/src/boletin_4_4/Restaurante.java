package boletin_4_4;

public class Restaurante {

    private int pulpo;
    private int patatas;

    public Restaurante() {
        pulpo = 0;
        patatas = 0;
    }

    public Restaurante(int pulp, int pat) {
        pulpo = pulp;
        patatas = pat;
    }

    public void añadirPulpo(int pulp) {
        pulpo = pulpo + pulp;
    }

    public void añadirPatatas(int pat) {
        patatas = patatas + pat;
    }

    public void mostrarPulpo() {
        System.out.println("Hay " + pulpo + " kg de pulpo en el almacén");
    }

    public void mostrarPatatas() {
        System.out.println("Hay " + patatas + " kg de patatas en el almacén");
    }

    public void mostrarClientes() {

        int a = (((pulpo * 3) / 2) + (patatas * 3)) / 2;

        System.out.println("Se pueden atender " + a + "clientes");
    }
}
