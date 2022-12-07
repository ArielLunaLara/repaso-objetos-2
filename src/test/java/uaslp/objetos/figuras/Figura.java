package uaslp.objetos.figuras;

public class Figura extends DrawableItem {
    private String name;
    private double area;
    private double perimetro;

    public Figura(String name){
        this.name=name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

