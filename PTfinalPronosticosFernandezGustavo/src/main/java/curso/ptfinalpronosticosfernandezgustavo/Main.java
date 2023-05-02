package curso.ptfinalpronosticosfernandezgustavo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        

        //lee Archivo Resultados.txt a travez de argumentos - Lo guarda en Coleccion
            Collection<Partido> partidos = new ArrayList<Partido>(); 
            Path pathResultados = Paths.get(args[0]);
            
            List<String> lineasResultados = null;
            try {
                lineasResultados = Files.readAllLines(pathResultados);
            } catch (IOException e) {
                System.out.println("¡NO SE PUDO LEER INFORMACION DE LOS RESULTADOS DE LOS PARTIDOS!");
                System.exit(1); //ante error sale del programa
            }
            

        
        
        //Se pasan los datos a una 
        
        
    }
}
