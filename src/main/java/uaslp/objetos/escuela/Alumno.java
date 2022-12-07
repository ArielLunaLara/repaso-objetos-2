package uaslp.objetos.escuela;

package uaslp.objetos.escuela;

import java.time.LocalDate;
import java.util.Date;

public class Alumno {
    private String clave;
    private String claveDeCarrera;
    private String nombre;
    private int anioDeIngreso;
    private LocalDate fechaNacimiento;

    public Alumno(String clave,String claveDeCarrera, String nombre, int anioDeIngreso, LocalDate fechaNacimiento){
        this.clave = clave;
        this.claveDeCarrera = claveDeCarrera;
        this.nombre = nombre;
        this.anioDeIngreso = anioDeIngreso;
        this.fechaNacimiento = fechaNacimiento;
    }
    public static AlumnoBuilder builder(){
        return new AlumnoBuilder();
    }

    public String getNombre(){
        return this.nombre;
    }
    public String getClave(){
        return this.clave;
    }
    public String getClaveDeCarrera(){
        return this.claveDeCarrera;
    }
    public int getAnioDeIngreso(){return this.anioDeIngreso;}
    public LocalDate getFechaNacimiento(){
        return this.fechaNacimiento;
    }
}