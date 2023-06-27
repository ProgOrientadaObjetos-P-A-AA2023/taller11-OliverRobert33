package paquete04;

import paquete03.Menu;

public class MenuCarta extends Menu {

    private double valorPorcionGuarnicion;
    private double valorBebida;
    private double porcentajeAdicional;

    public MenuCarta(String plato, double vMenu, double vp,double vb, double pa) {
        super(plato, vMenu);
        valorPorcionGuarnicion = vp;
        valorBebida = vb;
        porcentajeAdicional = pa;
    }

    public void establecerValorPorcion(double vp) {
        valorPorcionGuarnicion = vp;
    }

    public void establecerValorBebida(double vb) {
        valorBebida = vb;
    }

    public void establecerPorcentajeAdicional(double pa) {
        porcentajeAdicional = pa;
    }

    @Override
    public void calcularValorMenu(){
        double suma = valorInicialMenu + valorPorcionGuarnicion + valorBebida;
        double op = suma * (porcentajeAdicional/100);
        valorMenu = suma + op;
    };

    public double obtenerValorPorcion() {
        return valorPorcionGuarnicion;
    }

    public double obtenerValorBebida() {
        return valorBebida;
    }

    public double obtenerPorcentajeAdicional() {
        return porcentajeAdicional;
    }
    
    
    @Override
    public String toString() {
        String cadena = "Menu de la Carta";
        cadena = String.format(""
                + "%s\n"
                + "%s"
                + "\tValor guarnición: %.1f\n"
                + "\tValor Bebida: %.1f\n"
                + "\tPorcentaje Adicional: %.2f\n"
                + "\tValor Menú: %.2f\n",
                cadena,
                super.toString(),
                valorPorcionGuarnicion,
                valorBebida,
                porcentajeAdicional,
                valorMenu);
        return cadena;
    }

}
