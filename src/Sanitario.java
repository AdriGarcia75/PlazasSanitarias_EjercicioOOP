public class Sanitario extends Persona{

    private String especialidad;
    private int diasTrabajados;

    public Sanitario(int id, String nombre, String primerApellido, String segundoApellido, String especialidad, int diasTrabajados) {
        super(id, nombre, primerApellido, segundoApellido);
        this.especialidad = especialidad;
        this.diasTrabajados = diasTrabajados;
    }

    @Override
    public String toString(){
        return "oe";
    }
}
