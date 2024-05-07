public class Docente extends Persona{

    private String titulacion;
    private double puntos;

    public Docente( String nombre, String primerApellido, String segundoApellido, String titulacion, double puntos){
        super(nombre, primerApellido, segundoApellido);
        this.titulacion = titulacion;
        this.puntos = puntos;

    }

    //constructor por defecto
    public Docente(){}

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public double getPuntos() {
        return puntos;
    }

    public void setPuntos(double puntos) {
        this.puntos = puntos;
    }

    @Override
    public String toString() {
        return "Docente{" +
                "titulacion='" + titulacion + '\'' +
                ", puntos=" + puntos +
                '}';
    }
}
