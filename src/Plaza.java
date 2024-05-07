public class Plaza {

    private int id;
    //"D" es para docentes, "S", es para sanitarios
    private char tipoPlaza;
    private boolean adjudicada;
    private Persona trabajador;

    public Plaza(int id, char tipoPlaza) {
        this.id = id;
        try {
            // en este if valido si el tipo de plaza es D/S
            if (tipoPlaza == 'D' || tipoPlaza == 'S') {
                this.tipoPlaza = tipoPlaza;
            } else {
                //si no es lanzo un error
                throw new IllegalArgumentException("Tipo de plaza no válido");
            }
            //y aqui lo recojo e imprimo el mensaje de error
        } catch (IllegalArgumentException e){
            System.err.println("ERROR: " + e.getMessage());
        }
        //daremos como valores por defecto el estado de que "esté vacia la plaza" ya que "inicialmente cuando se crean las
        //plazas no tienen adjudicados ningún interino" segun el enunciado
        this.adjudicada = false;
        this.trabajador = null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getTipoPlaza() {
        return tipoPlaza;
    }

    public void setTipoPlaza(char tipoPlaza) {
        this.tipoPlaza = tipoPlaza;
    }

    public boolean isAdjudicada() {
        return adjudicada;
    }

    public void setAdjudicada(boolean adjudicada) {
        this.adjudicada = adjudicada;
    }

    public Persona getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(Persona trabajador) {
        this.trabajador = trabajador;
    }

    @Override
    public String toString() {
        return "Plaza{" +
                "id=" + id +
                ", tipoPlaza=" + tipoPlaza +
                ", adjudicada=" + adjudicada +
                ", trabajador=" + trabajador +
                '}';
    }
}
