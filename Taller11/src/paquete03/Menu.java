package paquete03;

public abstract class Menu {

    protected String nombrePlato;
    protected double valorInicialMenu;
    protected double valorMenu;

    public Menu(String n, double v) {
        nombrePlato = n;
        valorInicialMenu = v;
    }

    public void establecerNombrePlato(String n) {
        nombrePlato = n;
    }

    public void establecerValorInicialMenu(double v) {
        valorInicialMenu = v;
    }

    public abstract void calcularValorMenu();

    public String obtenerNombrePlato() {
        return nombrePlato;
    }

    public double obtenerValorInicialMenu() {
        return valorInicialMenu;
    }

    public double obtenerValorMenu() {
        return valorMenu;
    }

    @Override
    public String toString() {
        String cadena = "Menu";
        cadena = String.format(""
                + "\tPlato: %s\n"
                + "\tValor Inicial: %.2f\n",
                nombrePlato,
                valorInicialMenu);
        return cadena;
    }

}
