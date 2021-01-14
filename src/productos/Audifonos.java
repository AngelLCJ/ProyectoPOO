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

    public Audifonos(String color, String tipo, int precio, int codigoBarra, String nombre, String marca) {
        super(precio, codigoBarra, nombre, marca);
        this.color = color;
        this.tipo = tipo;
    }
}
