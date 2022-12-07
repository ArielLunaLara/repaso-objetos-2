package uaslp.objetos.escuela;

import java.time.LocalDate;


public class AlumnoBuilder {
    private String nombre;
    private String clave;
    private String claveDeCarrera;
    private String anioDeIngreso;
    private LocalDate fechaNacimiento;

    public static BuilderAlumno builder(){
        BuilderAlumno builderAlumno=new BuilderAlumno();
        return builderAlumno;

    }
    public String getNombre(){
        return nombre;
    }

    public String getClave() {
        return clave;
    }

    public String getClaveDeCarrera() {
        return claveDeCarrera;
    }

    public String getAnioDeIngreso() {
        return anioDeIngreso;
    }
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public static class BuilderAlumno implements builder{
        private String nombre;
        private String clave;
        private int anioDeIngreso;
        private LocalDate fechaNacimiento;
        private String claveDeCarrera;

        public BuilderAlumno nombre(String nombre){
            this.nombre=nombre;
            return this;
    }
        public  BuilderAlumno clave(String clave){
            this.clave=clave;
            return  this;
        }
        public BuilderAlumno claveDeCarrera(String claveDeCarrera){
            this.claveDeCarrera=claveDeCarrera;
            return this;
        }
        public BuilderAlumno anioDeIngreso(int anioDeIngreso){
            this.anioDeIngreso=anioDeIngreso;
            return  this;
        }
        public BuilderAlumno fechaNacimiento(LocalDate fechaNacimiento){
            this.anioDeIngreso=anioDeIngreso;
            return this;
        }
        public AlumnoBuilder build(){
            AlumnoBuilder alumno=new AlumnoBuilder();
            alumno.nombre=this.nombre;
            alumno.clave=this.clave;
            alumno.claveDeCarrera=this.claveDeCarrera;
            alumno.anioDeIngreso=this.anioDeIngreso;
            alumno.fechaNacimiento=this.fechaNacimiento;
            return alumno;
        }

    }


}

