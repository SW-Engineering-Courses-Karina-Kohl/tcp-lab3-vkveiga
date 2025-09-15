public abstract class FiguraGeometrica implements CalculosGeometricos {
    private String cor;
    private int id;

    private static int totalFiguras = 0;

    public FiguraGeometrica(String cor) {
        this.cor = cor;
        totalFiguras++;
        this.id = totalFiguras;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getId() {
        return id;
    }

    public static int getTotalFiguras() {
        return totalFiguras;
    }

    public String getInfo() {
        return "ID: " + id + ", Cor: " + cor + ", Tipo: " + getTipoFigura();
    }

    public abstract String getDetalhes();
}

