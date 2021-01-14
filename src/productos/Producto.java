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
public class Producto {
    int precio,codigoBarra;
    String nombre , marca;

    public Producto() {
    }

    public Producto(int precio, int codigoBarra, String nombre, String marca) {
        this.precio = precio;
        this.codigoBarra = codigoBarra;
        this.nombre = nombre;
        this.marca = marca;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCodigoBarra() {
        return codigoBarra;
    }

    public void setCodigoBarra(int codigoBarra) {
        this.codigoBarra = codigoBarra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Producto{" + "precio=" + precio + ", codigoBarra=" + codigoBarra + ", nombre=" + nombre + ", marca=" + marca + '}';
    }
    
}
