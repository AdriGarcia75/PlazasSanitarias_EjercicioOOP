public class Plaza {

    private int id;
    //"D" es para docentes, "S", es para sanitarios
    private char tipoPlaza;
    private boolean adjudicada;
    private Persona trabajador;

    public Plaza(int id, char tipoPlaza, boolean adjudicada, Persona trabajador) {
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


}
