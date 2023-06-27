package paquete02;

import java.util.ArrayList;
import paquete03.Menu;

public class Cuenta {

    private String nombre;
    private ArrayList<Menu> lista;
    private double subtotal;
    private double iva;
    private double valorTotal;

    public Cuenta(String n, ArrayList<Menu> l, double i) {
        nombre = n;
        lista = l;
        iva = i;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerLista(ArrayList<Menu> l) {
        lista = l;
    }

    public void calcularSubtotal() {
        double suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            Menu l = lista.get(i);
            suma += l.obtenerValorMenu();
        }

        subtotal = suma;
    }

    public void establecerIva(double i) {
        iva = i;
    }

    public void calcularValorTotal() {
        valorTotal = subtotal + (subtotal * (iva/100));
    }

    public String obtenerNombre() {
        return nombre;
    }

    public ArrayList<Menu> obtenerLista() {
        return lista;
    }

    public double obtenerSubtotal() {
        return subtotal;
    }

    public double obtenerIva() {
        return iva;
    }

    public double obtenerValorTotal() {
        return valorTotal;
    }
    
    public String toString(){
        String cadena = "Factura";
        
        cadena = String.format(""
                + "%s\n"
                + "Cliente: %s\n",
                cadena,
                nombre);
        
        for (int i = 0; i < lista.size(); i++) {
            cadena = String.format(""
                    + "%s\n"
                    + "%s\n",
                    cadena,
                    lista.get(i));
        }
        
        cadena = String.format(""
                + "%s"
                + "Subtotal: %.1f\n"
                + "IVA %.1f\n"
                + "Total a pagar: %.3f\n",
                cadena,
                subtotal, 
                iva,
                valorTotal);
        return cadena;
    }

}
