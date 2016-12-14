package boletin_7;

import javax.swing.JOptionPane;

public class Boletin_7 {

    public static void main(String[] args) {

        Libro libro1 = new Libro();

        int a = Integer.parseInt(JOptionPane.showInputDialog("Inserte número de ejemplares"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Inserte número de ejemplares prestados"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Inserte número de ejemplares que va a recoger"));
        int d = Integer.parseInt(JOptionPane.showInputDialog("Inserte número de ejemplares que va a devolver"));

        libro1.setAutor();
        libro1.setTitulo();
        libro1.setEjemplares(a);
        libro1.setPrestados(b);
        libro1.prestamo(c);
        libro1.devolucion(d);
        libro1.getEjemplares();
        libro1.getPrestados();

    }
}
