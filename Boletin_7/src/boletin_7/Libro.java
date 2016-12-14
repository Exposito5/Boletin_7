package boletin_7;

import javax.swing.JOptionPane;

public class Libro {

    private String titulo, autor;
    private int ejemplares, prestados;

    public Libro() {
    }

    public Libro(String titulo, String autor, int nEjemplares, int nPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = nEjemplares;
        this.prestados = nPrestados;
    }

    public void setTitulo() {
        titulo = JOptionPane.showInputDialog("Introducir título del libro");
    }

    public void setAutor() {
        autor = JOptionPane.showInputDialog("Introducir nombre del autor");
    }

    public void setEjemplares(int nEjemplares) {
        this.ejemplares = nEjemplares;
    }

    public void setPrestados(int nPrestados) {
        this.prestados = nPrestados;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void prestamo(int prestamo) {
        if (ejemplares > prestados) {
            prestados = prestados + prestamo;
        } else {
            JOptionPane.showMessageDialog(null, "Lo sentimos, no hay ejemplares de ese libro disponibles para prestar.");
        }
    }

    public void devolucion(int devolucion) {
        if (prestados > 0) {
            ejemplares = ejemplares + devolucion;
        } else {

            JOptionPane.showMessageDialog(null, "No se puede devolver un ejemplar que no ha sido prestado");
        }
    }

    public void getEjemplares() {
        JOptionPane.showMessageDialog(null, "El nº de ejemplares disponibles es de " + (ejemplares - prestados));
    }

    public void getPrestados() {

        JOptionPane.showMessageDialog(null, "El nº de ejemplares prestados es de " + (prestados));
    }

}
