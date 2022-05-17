public class Main {
    public static void main(String[] args) {

        Cuadrado square1 = new Cuadrado("cuadrado", 12.6);
        Figura circulo1 = new Circulo("circulo", 5.3);

        circulo1.calcularArea();
        square1.calcularArea();

    }
}
