public class Main {
    public static void main(String[] args) {

    Vendedor juan = new Afiliado("Juan", 1);
    Vendedor pedro = new Empleado("Pedro", 2, 3, 3);

    juan.mostrarCategoria();
    pedro.mostrarCategoria();

    }
}
