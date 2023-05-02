
package curso.ptfinalpronosticosfernandezgustavo;

public class Equipo {
    
    private String nombreEquipo;
    private int codEquipo;

    public Equipo() {
    }

    public Equipo(String nombreEquipo, int codEquipo) {
        this.nombreEquipo = nombreEquipo;
        this.codEquipo = codEquipo;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public int getCodEquipo() {
        return codEquipo;
    }

    public void setCodEquipo(int codEquipo) {
        this.codEquipo = codEquipo;
    }
    
    
    
}
