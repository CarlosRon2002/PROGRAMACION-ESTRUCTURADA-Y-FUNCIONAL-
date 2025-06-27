
package sistemapeaje;

/**
 *
 *@author CARLOS Ron
 * @Fecha: 29/06/2025
 * Descripcion: Crear una clase Camion
 */

//Creamos la clase camion con la herencia de Vehiculo
public class Camion extends Vehiculo {
    //Colocamos los atributos 
    private int numeroEjes;
    private int valorPeajeEje = 1;
    //Creamos el contructutor para el String de placas y numeros de ejes.
    public Camion(String placa, int numeroEjes) {
        super(placa);
        this.numeroEjes = numeroEjes;
    }
    //Usamos polimorfismo para calcular el peaje segun el numero de ejes
    @Override
    public int getValorPeaje() {
        //Multiplicamos el numero de ejes x el valor del peaje por eje 
        return numeroEjes * valorPeajeEje;
    }
}
