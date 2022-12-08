package uaslp.objetos.escuela;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList

public class EvaluadorDePromediosAdapter {
    private final EvaluadorDePromediosAdapter evaluadorDePromediosAdapter;
    private final List<Double> listaDeCalificaciones = new ArrayList<>();
    private final EvaluadorDePromedios

    public EvaluadorDePromediosAdapter(EvaluadorDePromedios evaluadorDePromedios) {
        this.evaluadorDePromediosAdapter=evaluadorDePromedios;
    }
    public double evalua(String listaDeCalifiaciones){
        List<String> califiaciones = new ArrayList<>(Arrays.asList(listaDeCalifiaciones.split((",")));

        for ((String calificacion : califiaciones){
            this.listaDeCalificaciones.add(Double.parseDouble(califiacion));

        }
        return evaluadorDePromedios.evalua(this.listaDeCalificaciones);
    }
}
