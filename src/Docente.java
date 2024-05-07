public class Docente extends Persona{

    private String titulacion;
    private double puntos;

    public Docente(int id, String nombre, String primerApellido, String segundoApellido, String titulacion, double puntos){
        super(id, nombre, primerApellido, segundoApellido);
        this.titulacion = titulacion;
        this.puntos = puntos;
    }

    @Override
    public String toString(){
        return "oe";
    }
}
