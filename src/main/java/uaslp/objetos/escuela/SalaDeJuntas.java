package uaslp.objetos.escuela;

public class SalaDeJuntas {
    private static String nombre;
    public static String getNombre(){
        return nombre;
    }
    public SalaDeJuntas(String name){
        this.nombre = name;
    }
}
