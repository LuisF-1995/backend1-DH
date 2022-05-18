public class Afiliado extends Vendedor{

    private int numeroVentas;
    private int puntos;

    public Afiliado(String nombreVendedor, int numeroVentas) {
        super(nombreVendedor);
        this.numeroVentas = numeroVentas;
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
        puntos = numeroVentas*15;
        return puntos;
    }

}
