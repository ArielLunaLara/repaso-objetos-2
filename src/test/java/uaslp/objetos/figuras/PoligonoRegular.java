package uaslp.objetos.figuras;

import static java.lang.Math.tan;
import static java.lang.Math.toRadians;

public class PoligonoRegular extends Figura {
    private double lado;
    private final int numDeLados;

    public PoligonoRegular(int numDeLados){
        super("PoligonoRegular");
        this.numDeLados=numDeLados;
    }
    public PoligonoRegular(int numDeLados, double lado){
        super("PoligonoRegular");
        this.lado=lado;
        this.numDeLados=numDeLados;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }
    public double getArea(){
        double perimetro=getPerimetro(numDeLados);
        double apotema=(lado/2)/tangente;
        double tangente=tan(toRadians(360/(2*numDeLados)));
        return perimetro*apotema/2;
    }
    public double getPerimetro (int contadordeLados){
        if (contadordeLados ==1){
            return lado;

        }else {
            return getPerimetro(--contadordeLados)+lado;
        }
    }

}
