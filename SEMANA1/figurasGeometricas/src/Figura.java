public abstract class Figura {
    private String tipoFigura;
    private Double lado;
    private double radio;

    public Figura(String tipoFigura, Double lado) {
        this.tipoFigura = tipoFigura;
        this.lado = lado;
    }

    public Figura(String tipoFigura, double radio) {
        this.tipoFigura = tipoFigura;
        this.radio = radio;
    }

    abstract void calcularArea();

    public String getTipoFigura() {
        return tipoFigura;
    }

    public Double getLado() {
        return lado;
    }

    public double getRadio() {
        return radio;
    }

}
