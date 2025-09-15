public class Circulo extends FiguraGeometrica {
    private double raio;

    public Circulo(String cor, double raio) {
        super(cor);
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    public String getTipoFigura() {
        return "Triângulo Equilátero";
    }

    public String getDetalhes() {
        return String.format(
            "Raio: %.2f Área: %.2f Perímetro: %.2f",
            raio, calcularArea(), calcularPerimetro()
        );
    }

    // Sobrescrevendo o getInfo para incluir os detalhes
    @Override
    public String getInfo() {
        return super.getInfo() + " " + getDetalhes();
    }
}

