
package sistemapeaje;

/**
 *
 *@author CARLOS Ron
 *@Fecha: 29/06/2025
 * Descripcion: Crear una clase Vehiculo , con sus atributos
 * para heredarlos a las clases hijos 
 */
//Creamos la clase padre vehiculo
public abstract class Vehiculo {
    //Colocamos sus atributos
    protected String placa;
    //Creamos el metodo constructor 
    public Vehiculo(String placa) {
        //Asignamos la placa recibida al atributo de la clase
        this.placa = placa;
    }
    //Cresamos el metodo para obtener la placa del vehiculo
    public String getPlaca() {
        //Retornamos el valor de la placa 
        return placa;
    }
    //Creamos el polimorfismo  para que las clases hijos puedan
    //implementar el calcular el valor del peaje 
    public abstract int getValorPeaje();
}
