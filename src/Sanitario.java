public class Sanitario extends Persona{

    private String especialidad;
    private int diasTrabajados;

    public Sanitario(String nombre, String primerApellido, String segundoApellido, String especialidad, int diasTrabajados) {
        super(nombre, primerApellido, segundoApellido);
        this.especialidad = especialidad;
        this.diasTrabajados = diasTrabajados;
    }

    public Sanitario(){}

    @Override
    public String toString() {
        return "Sanitario{" +
                "especialidad='" + especialidad + '\'' +
                ", diasTrabajados=" + diasTrabajados +
                '}';
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getDiasTrabajados() {
        return diasTrabajados;
    }

    public void setDiasTrabajados(int diasTrabajados) {
        this.diasTrabajados = diasTrabajados;
    }
}
