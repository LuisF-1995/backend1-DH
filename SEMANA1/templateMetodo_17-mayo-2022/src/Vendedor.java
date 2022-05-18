public abstract class Vendedor {
    protected String nombreVendedor;

    public Vendedor(String nombreVendedor) {
        this.nombreVendedor = nombreVendedor;
    }

    public void mostrarCategoria(){
        calcularPuntos();
        recategorizar();

        System.out.println(this.nombreVendedor+" tiene un total de "+ Integer.toString(calcularPuntos()) + " puntos, categoriza como "+recategorizar());
    }
    protected abstract String recategorizar();
    protected abstract int calcularPuntos();

}
