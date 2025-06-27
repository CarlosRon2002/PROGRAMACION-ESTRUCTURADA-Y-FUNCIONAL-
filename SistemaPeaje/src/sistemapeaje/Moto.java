
package sistemapeaje;

/**
 *
 *@author CARLOS Ron
 *@Fecha: 29/06/2025
 * Descripcion: Crear una clase Moto
 */

//Creamos una clase moto con herencia de vehiculo
public class Moto extends Vehiculo {
    //Colocamos el atributo de moto 
    private int valorPeaje = 1;
    //Creamos un constructor  para String de placa
    public Moto(String placa) {
        //Llamamos al constructor de la clase base vehiculo con la placa
        super(placa);
    }
    //Usamos polimorfismo para sobreescribir en un metodo existente 
    @Override
    public int getValorPeaje() {
        //Retornamos el valor del peaje almacenado en la variable valorPeaje
        return valorPeaje;
    }
}
