/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos;

/**
 *
 * @author perry
 */
public class Audifonos extends Productos {
    String color, tipo;

    public Audifonos() {
    }
    
    public Audifonos(String color, String tipo, String nombre, String marca, int codigoBarra, int precio) {
        super(nombre, marca, codigoBarra, precio);
        this.color = color;
        this.tipo = tipo;
    }
 
}
