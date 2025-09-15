public class Retangulo extends FiguraGeometrica {
    private double largura;
    private double altura;

    public Retangulo(String cor, double largura, double altura) {
        super(cor);
        this.largura = largura;
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularArea() {
        return largura * altura;
    }

    public double calcularPerimetro() {
        return 2 * (altura + largura);
    }

    public String getTipoFigura() {
        return "Retângulo";
    }

    public String getDetalhes() {
        return String.format(
            "Largura: %.2f Altura: %.2f Área: %.2f Perimetro: %.2f",
            largura,altura, calcularArea(), calcularPerimetro()
        );
    }

    // Sobrescrevendo o getInfo para incluir os detalhes
    @Override
    public String getInfo() {
        return super.getInfo() + " " +getDetalhes();
    }
}

