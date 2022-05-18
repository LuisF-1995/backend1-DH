public class Empleado extends Vendedor{

    private int numeroVentas;
    private int antiguedad; //Antiguedad en años
    private int cantAfiliados;
    private int puntos;


    public Empleado(String nombreVendedor, int numeroVentas, int antiguedad, int cantAfiliados) {
        super(nombreVendedor);
        this.numeroVentas = numeroVentas;
        this.antiguedad = antiguedad;
        this.cantAfiliados = cantAfiliados;
    }

    @Override
    protected String recategorizar() {
        if (puntos<20) return "novato";
        else if (20<= puntos && puntos <= 30) return "aprendiz";
        else if(31 < puntos && puntos < 40){
            return "bueno";
        }
        else if (puntos > 40) {
            return "maestro";
        }
        return " ";
    }

    @Override
    protected int calcularPuntos() {
        puntos = (10*this.cantAfiliados) + (5*this.numeroVentas) + (5*this.antiguedad);
        return puntos;
    }

}
