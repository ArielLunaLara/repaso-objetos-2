package uaslp.objetos.figuras;

public class Triangulo extends Figura {
    private double base;
    private double area;
    private double altura;
    private String description;

    public Triangulo(double altura, double base){
        super("Triangulo");
        this.altura=altura;
        this.base=base;
    }
    public Triangulo(){
        super("Triangulo");
        description="Cualquier triangulo";
    }
    public Triangulo(String msg){
        super(null);
        setDescription(msg);
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setBase(double base) {

    }

    public double getAltura() {
        return altura;
    }

    public double getBase() {
        return base;
    }

    public double getArea() {
        return base*altura/2;
    }
    public String getDescription(){
        return description;
    }

    public void setDescription(String msg) {
        this.description = msg;
    }
}
