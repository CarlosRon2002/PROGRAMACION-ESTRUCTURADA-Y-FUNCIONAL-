
package sistemapeaje;

/**
 *
 * @author CARLOS Ron
 * @Fecha: 29/06/2025
 * Descripcion: 
 */

//Importamos las librerias de lista 
import java.util.ArrayList;
import java.util.List;
//Creamos una la clase peaje 
public class Peaje {
    //Colocamos sus atributos 
    private String nombre;
    private String departamento;
    private int totalPeaje = 0;
    private int totalCamiones = 0;
    private int totalMotos = 0;
    private int totalCarros = 0;
    //Creamos una lista que reciba los valores de vehiculos 
    private List<Vehiculo> vehiculos = new ArrayList<>();
    //Creamos un metodo constructor con el String nombre y String departamento
    public Peaje(String nombre, String departamento) {
        this.nombre = nombre;
        this.departamento = departamento;
    }

    public void añadirVehiculo(Vehiculo vehiculo) {
        //Agregarmos el vehiculo a la lista de vehiculos que han pasado por 
        //el peaje 
        vehiculos.add(vehiculo);
        //Sumamos el valor del peaje del vehiculo al total recaudado
        totalPeaje += vehiculo.getValorPeaje();
           //Verificamos el tipo de vehiculo y aumenta el contador correspondiente
        if (vehiculo instanceof Carro) totalCarros++;
        if (vehiculo instanceof Moto) totalMotos++;
        if (vehiculo instanceof Camion) totalCamiones++;
    }
    //Devuelve el total recaudado del peaje 
    public int getTotalPeaje() {
        return totalPeaje;
    }
    //Devuelve la lista de vehiculos que han pasado por el peaje 
    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }
}

