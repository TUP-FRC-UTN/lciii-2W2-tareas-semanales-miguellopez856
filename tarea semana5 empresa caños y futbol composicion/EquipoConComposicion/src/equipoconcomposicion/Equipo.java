
package equipoconcomposicion;


public class Equipo {
    
    private String nombre;
    private Jugador[]jugadores;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Equipo(String nombre, int cantidad) {
        this.nombre = nombre;
        this.jugadores = new Jugador[cantidad];
    } 
    
     public void AgregarJugador(Jugador nuevo)
    {
        for (int i = 0; i < jugadores.length; i++) {
            if(jugadores[i] == null)
            {
              jugadores[i] = nuevo;
              
              break;
            }
            
        }
    }
     
    public int cantidadJugadoresMenos10()
    {  
       int cantidadJugadoresMenos10 = 0;
       for (int i = 0; i < jugadores.length; i++) {

            if(jugadores[i] != null && jugadores[i].getCantPartidosJugados() < 10)

                cantidadJugadoresMenos10++;
    
    }
       return cantidadJugadoresMenos10;
   
    }
    
    public String NombreJugadorMayorCantPartidos()
    {
        Jugador auxiliar = jugadores[0];
        
      for (int i = 0; i < jugadores.length; i++) {

            if(jugadores[i] != null && jugadores[i].getCantPartidosJugados() > auxiliar.getCantPartidosJugados())

                auxiliar = jugadores[i];

        }
      
      return auxiliar.getNombre();
    }
    
    public double PromedioEstadoFísicoEquipo()
    {
      int acumuladorEstadoFisico = 0;

        int contadorJugadores = 0;

        for (int i = 0; i < jugadores.length; i++) {

            if(jugadores[i] != null)

            {

                acumuladorEstadoFisico += jugadores[i].getPorcentajeEstadoFisico();

                contadorJugadores++;

            }

        }
        return  acumuladorEstadoFisico / contadorJugadores;
    
    }
    
    public double PromedioPartidoJugadosDeJugadoresCadaPosición4resultados()
    {
    
        int [] acumuladorPosiciones = new int[4];

        int [] contadorPosiciones = new int[4];

        for (int i = 0; i < jugadores.length; i++) {

            if(jugadores[i] != null)

            {

                switch(jugadores[i].getPosicion())

                {

                    case 1:

                        acumuladorPosiciones[0] += jugadores[i].getCantPartidosJugados();

                        contadorPosiciones[0]++;

                        break;

                    case 2:

                        acumuladorPosiciones[1] += jugadores[i].getCantPartidosJugados();

                        contadorPosiciones[1]++;

                        break;

                    case 3:

                        acumuladorPosiciones[2] += jugadores[i].getCantPartidosJugados();

                        contadorPosiciones[2]++;

                        break;

                    case 4:

                        acumuladorPosiciones[3] += jugadores[i].getCantPartidosJugados();

                        contadorPosiciones[3]++;

                        break;

                }

            }

        }
        
        return 
    
    
    }
   
   
    
}


