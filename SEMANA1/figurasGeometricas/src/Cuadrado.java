public class Cuadrado extends Figura{

    public Cuadrado(String tipoFigura, Double lado) {
        super(tipoFigura, lado);
    }

    @Override
    void calcularArea() {
        double areaCuadrado = super.getLado()*super.getLado();
        System.out.println("El area del " + super.getTipoFigura() + " es: " + areaCuadrado);
    }
}
