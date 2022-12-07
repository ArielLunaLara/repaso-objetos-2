package uaslp.objetos.escuela;

public class SalaDeJuntasFactory {
    public static SalaDeJuntas get(String Nombre){
        return new SalaDeJuntas(Nombre);
    }
}
