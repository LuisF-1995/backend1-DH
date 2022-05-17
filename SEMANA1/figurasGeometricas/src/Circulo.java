public class Circulo extends Figura{

    public Circulo(String tipoFigura, double radio) {
        super(tipoFigura, radio);
    }
    @Override
    void calcularArea() {
        double areaCirculo = Math.PI * super.getRadio()*super.getRadio();
        System.out.println("El area del " + super.getTipoFigura() + " es: " + areaCirculo);
    }
}
