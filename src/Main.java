import java.util.ArrayList;

public class Main {


    /* implementa el método simularAdjudicacion o métodos que consideres
    oportunos para realizar una simulación de adjudicación, es decir, crea una lista automática
    de plazas y personas */
    public static void simularAdjudicacion(ArrayList<Plaza> listaPlazas, ArrayList<Persona> listaPersonas){
        //entrada de datos copiada del solucionario

        //creacion de plazas, damos un ID y el tipo, que ha de ser D o S (si no, se mostraría un error y se omitiria la creacion de dicha plaza
        Plaza plazaPalma = new Plaza(0,'D');
        Plaza plazaCiutadella = new Plaza(1,'S');
        Plaza plazaInca = new Plaza(2,'D');
        Plaza plazaMahon = new Plaza(3,'S');
        Plaza plazaMuro = new Plaza(4,'D');
        Plaza plazaLlubi = new Plaza(5,'S');
        Plaza plazaSineu = new Plaza(6,'D');
        Plaza plazaSaPobla = new Plaza(7,'S');
        Plaza plazaFormentera = new Plaza(8,'D');
        Plaza plazaMarratxi = new Plaza(9,'S');

        //añadimos las plazas a la array de plazas
        listaPlazas.add(plazaPalma);
        listaPlazas.add(plazaCiutadella);
        listaPlazas.add(plazaInca);
        listaPlazas.add(plazaMahon);
        listaPlazas.add(plazaMuro);
        listaPlazas.add(plazaLlubi);
        listaPlazas.add(plazaSineu);
        listaPlazas.add(plazaSaPobla);
        listaPlazas.add(plazaFormentera);
        listaPlazas.add(plazaMarratxi);

        //creamos unos cuantos docentes/sanitarios
        Docente jaumeBarcelo = new Docente("Jaume","Barceló","Vicenç","Doctor", 2.4);
        Docente marcCosta = new Docente( "Marc","Costa","Marquez","Máster", 3.2);
        Docente maximoFernandez = new Docente("Máximo","Fernández","Riera","Grado", 2.7);
        Sanitario franciscaOliver = new Sanitario("Francisca","Oliver","Sanz","Grado", 13);
        Sanitario margaritaRobles = new Sanitario("Margarita","Robles","Perez","Master", 7);
        Sanitario paulaSanchez = new Sanitario("Paula","Sanchez","Aguirre","Doctor", 31);

        //los añadimos en la lista de Personas
        listaPersonas.add(jaumeBarcelo);
        listaPersonas.add(marcCosta);
        listaPersonas.add(maximoFernandez);
        listaPersonas.add(franciscaOliver);
        listaPersonas.add(margaritaRobles);
        listaPersonas.add(paulaSanchez);

    }

    public static void adjudicarPlazas(ArrayList<Plaza> listaPlazas, ArrayList<Persona> listaPersonas){

        //podemos utilizar un foreach ya que no necesitamos en ningun momento el indice del primer bucle
        for (Plaza listaPlaza : listaPlazas) {
            /* iniciamos esta variable en -1, esta guardará el indice de la persona con más puntos,
            luego se usará este mismo indice para añadirla a una plaza y luego borrarla de la lista */
            int indexPersona = -1;
            //miramos si la plaza es para docentes
            if (listaPlaza.getTipoPlaza() == 'D') {
                //creamos un docente nuevo (en cada vuelta, obviamente) con el constructor por defecto, como intermediario
                Docente docenteHelper = new Docente();
                //iteramos sobre la lista de personas en busca del docente con más puntos
                for (int j = 0; j < listaPersonas.size(); j++) {
                    //primero miramos si es Docente utilizando instance of
                    if (listaPersonas.get(j) instanceof Docente) {
                        //luego iteramos hasta obtener el Docente con mas puntos que el Docente "intermediario" (helper)
                        if (((Docente) listaPersonas.get(j)).getPuntos() > docenteHelper.getPuntos()) {
                            //y guardamos (copiamos) los datos del docente encontrado en el "intermediario"
                            //es obligatorio convertir la "persona" en un docente, al ser padre/hijo no hay problemas ni perdida de datos
                            docenteHelper = (Docente) listaPersonas.get(j);
                            /* importante, tenemos que actualizar el index, ya que luego lo usaremos para
                            seleccionar a "index" persona para asignarle una plaza y luego borrarla de la lista */
                            indexPersona = j;
                        }
                    }
                } // se acaba el bucle
                //metemos a la persona en la lista y actualizamos con un setter el estado de "adjudicada"
                listaPlaza.setTrabajador(docenteHelper);
                listaPlaza.setAdjudicada(true);
                //borramos a la persona de la lista (chequeando de que exista, si es -1 no existe y esto podria dar (lo da) out of bounds
                if (indexPersona != -1) {
                    listaPersonas.remove(indexPersona);
                }
                //si no pues se hará exactamente el mismo proceso pero para los sanitarios
            } else {
                Sanitario sanitarioHelper = new Sanitario();
                for (int i = 0; i < listaPersonas.size(); i++) {
                    if (listaPersonas.get(i) instanceof Sanitario) {
                        if (((Sanitario) listaPersonas.get(i)).getDiasTrabajados() > sanitarioHelper.getDiasTrabajados()) {
                            sanitarioHelper = (Sanitario) listaPersonas.get(i);
                            indexPersona = i;
                        }
                    }
                } // se acaba el bucle
                listaPlaza.setTrabajador(sanitarioHelper);
                listaPlaza.setAdjudicada(true);
                //borramos a la persona de la lista
                if (indexPersona != -1) {
                    listaPersonas.remove(indexPersona);
                }
            } // se cierra el else
        } // termina el bucle principal
    }

    public static void mostrarPlazas(ArrayList<Plaza> listaPlazas, ArrayList<Persona> listaPersonas){

        System.out.println("Se mostraran las plazas de Sanitarios");
        for (Plaza plaza : listaPlazas) {
            if (plaza.getTipoPlaza() == 'S') {
                System.out.println(plaza);
            }
        }
        System.out.println("Se mostraran las plazas de Docentes");
        for (Plaza plaza : listaPlazas) {
            if (plaza.getTipoPlaza() == 'D') {
                System.out.println(plaza);
            }
        }
    }

    public static void main(String[] args) {

        ArrayList<Plaza> listaPlazas = new ArrayList<Plaza>();
        ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
        simularAdjudicacion(listaPlazas, listaPersonas);
        adjudicarPlazas(listaPlazas, listaPersonas);
        mostrarPlazas(listaPlazas, listaPersonas);

    }
}