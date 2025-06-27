
package sistemapeaje;

/**
 *
 *@author CARLOS Ron
 *@Fecha: 29/06/2025
 * Descripcion: Crear una clase Carro
 */

//Creamos una clase carro con herencia de vehiculo 
public class Carro extends Vehiculo {
    //Colocamos los atributos con los valores del diagrama 
    private int valorPeaje = 2;
    //Creamos un metodo constructor de la clase vehiculo con la placa 
    public Carro(String placa) {
        super(placa);
    }
    //Usamos polimorfismo para sobreescribir en un metodo existente 
    @Override
    public int getValorPeaje() {
        //Retornamos el valorPeaje 
        return valorPeaje;
    }
}
