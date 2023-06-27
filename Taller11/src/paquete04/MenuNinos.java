
package paquete04;

import paquete03.Menu;

public class MenuNinos extends Menu{
    private double valorPorcionHelado;
    private double valorPorcionPastel;

    public MenuNinos(String plato, double vMenu, double vpH, double vpP) {
        super(plato, vMenu);
        valorPorcionHelado = vpH;
        valorPorcionPastel = vpP;
    }

    public void establecerValorPorcionHelado(double vpH) {
        valorPorcionHelado = vpH;
    }

    public void establecerValorPorcionPastel(double vpP) {
        valorPorcionPastel = vpP;
    }
    
    @Override
    public void calcularValorMenu(){
        valorMenu = (valorInicialMenu + valorPorcionHelado + valorPorcionPastel);
    }

    public double obtenerValorPorcionHelado() {
        return valorPorcionHelado;
    }

    public double obtenerValorPorcionPastel() {
        return valorPorcionPastel;
    }
    
    public String toString(){
        String cadena = "Menú de Niños";
        cadena = String.format(""
                + "%s\n"
                + "%s"
                + "\tValor helado: %.2f\n"
                + "\tValor pastel: %.2f\n"
                + "\tValor del Menú: %.2f\n",
                cadena,
                super.toString(),
                valorPorcionHelado,
                valorPorcionPastel,
                valorMenu);
        return cadena;
    }
    
    
    

    
}
