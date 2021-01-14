/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos;

/**
 *
 * @author angel
 */
public class Productos {
    int precio,codigoBarra;
    String nombre,marca;

    public Productos() {
    }

    public Productos(int precio, int codigoBarra, String nombre, String marca) {
        this.precio = precio;
        this.codigoBarra = codigoBarra;
        this.nombre = nombre;
        this.marca = marca;
    }
    
    
}
