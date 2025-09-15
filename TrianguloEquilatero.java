public class TrianguloEquilatero extends FiguraGeometrica {
    private double lado;

    public TrianguloEquilatero(String cor, double lado) {
        super(cor);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double calcularArea() {
        return (Math.sqrt(3) / 4) * lado * lado;
    }

    public double calcularPerimetro() {
        return 3 * lado;
    }

    public String getTipoFigura() {
        return "Triângulo Equilátero";
    }

    public String getDetalhes() {
        return String.format(
            "Lado: %.2f Área: %.2f Perímetro: %.2f",
            lado, calcularArea(), calcularPerimetro()
        );
    }

    // Sobrescrevendo o getInfo para incluir os detalhes
    @Override
    public String getInfo() {
        return super.getInfo() + " " + getDetalhes();
    }
}

