
package paquete04;
import  paquete03.Menu;

public class MenuDia extends Menu{
    private double valorPostre;
    private double valorBebida;

    public MenuDia(String plato, double vMenu, double vp, double vb) {
        super(plato, vMenu);
        valorPostre = vp;
        valorBebida = vb;
    }

    public void establecerValorPostre(double vp) {
        valorPostre = vp;
    }

    public void establecerValorBebida(double vb) {
        valorBebida = vb;
    }
    
    @Override
    public void calcularValorMenu(){
        valorMenu = (valorInicialMenu + valorPostre + valorBebida);
    };


    public double obtenerValorPostre() {
        return valorPostre;
    }

    public double obtenerValorBebida() {
        return valorBebida;
    }
    
    @Override
    public String toString() {
        String cadena = "Menu del Dia";
        cadena = String.format(""
                + "%s\n"
                + "%s"
                + "\tValor bebida: %.2f\n"
                + "\tValor postre: %.2f\n"
                + "\tValor del Menu: %.2f\n",
                cadena,
                super.toString(),
                valorBebida,
                valorPostre,
                valorMenu);
        return cadena;
    }
    
    
    
    
    
    
}
