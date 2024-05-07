public abstract class Persona {

    private int id;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private static int contador;

    public Persona(String nombre, String primerApellido, String segundoApellido) {
        setId(id);
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
    }

    //constructor por defecto
    public Persona(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        id++;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Persona.contador = contador;
    }

    @Override
    public abstract String toString();


}
