package paquete04;

import paquete03.Menu;

public class MenuEconomico extends Menu {

    private double porcentajeDescuento;

    public MenuEconomico(String plato, double vMenu, double pd) {
        super(plato, vMenu);
        porcentajeDescuento = pd;
    }

    public void establecerPorcentajeDescuento(double pd) {
        porcentajeDescuento = pd;
    }
    
    @Override
    public void calcularValorMenu(){
        valorMenu = valorInicialMenu -
                (valorInicialMenu * (porcentajeDescuento / 100));
    }

    public double obtenerPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    @Override
    public String toString(){
        String cadena = "Menu Económico";
        cadena = String.format(""
                + "%s\n"
                + "%s"
                + "\tPorcentaje Descuento: %.2f\n"
                + "\tValor de Menu: %.2f\n",
                cadena,
                super.toString(),
                porcentajeDescuento,
                valorMenu);
        
        return cadena;
    }
}
