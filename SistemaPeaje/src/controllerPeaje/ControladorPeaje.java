
package controllerPeaje;

/**
 *
 * @author: Carlos Ron
 * @fecha: 29/06/2025
 * Descripcion: Crear un archivo Gson para guardar los datos del peaje 
 */

//
import sistemapeaje.Peaje;           //Importamos la clase peaje del otro paquete
import com.google.gson.Gson;         //Librerias para gson
import com.google.gson.GsonBuilder;
import java.io.*;                    

public class ControladorPeaje {
    //Nombre del archivo 
    private static final String FILE_NAME = "datos_peaje.json";

    public static void guardar(Peaje peaje) {
        //Creacion de una instancia de Gson con formato PrettyPrinting
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        //Escribr el objeto peaje en el archivo especificado
        try (FileWriter writer = new FileWriter(FILE_NAME)) {
            gson.toJson(peaje, writer);
        } catch (IOException e) {
            e.printStackTrace(); //Muestra el error si fala la escritura 
        }
    }

    public static Peaje cargar() {
        //Crea una instancia de Gson
        Gson gson = new Gson();      
        try (FileReader reader = new FileReader(FILE_NAME)) {
            //Deserializa el Json en un Objeto peaje
            return gson.fromJson(reader, Peaje.class);
             //imprime el error si ocurre una exepcion
        } catch (IOException e) {            
            e.printStackTrace();
            //retorna null si falla la alectura
            return null;            
        }
    }
}
