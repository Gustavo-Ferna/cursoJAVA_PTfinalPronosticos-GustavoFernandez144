package curso.ptfinalpronosticosfernandezgustavo;

public class Apuesta {
    
    private final Partido partido;
    private final Equipo equipo;
    private final EnumDatos resultado;

 
    public Apuesta(Partido partido, Equipo equipo, EnumDatos resultado) {
        this.partido = partido;
        this.equipo = equipo;
        this.resultado = resultado;
    }

    public Partido getPartido() {
        return partido;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public EnumDatos getResultado() {
        return resultado;
    }
    
    // verifica los resultados para devolver un punto
    public int puntos(){
        EnumDatos resultadoReal = this.partido.resultado(this.equipo);
        if (resultado.equals(resultadoReal)){
            return 1;
        }else{
            return 0;
        }

    }
    
}
