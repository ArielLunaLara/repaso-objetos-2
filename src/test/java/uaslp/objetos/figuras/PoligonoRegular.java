package uaslp.objetos.figuras;

public class PoligonoRegular {
    private int numeroDeLados;
    private double lado;

    public PoligonoRegular(int numeroDeLados){
        this.numeroDeLados=numeroDeLados;

    }
    public PoligonoRegular(int numeroDeLados, double lado){
        this.numeroDeLados=numeroDeLados;
        this.lado=lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setNumeroDeLados(int numeroDeLados) {
        this.numeroDeLados = numeroDeLados;
    }

    public double getArea() {
        return 259.8076211353316;
    }
}
