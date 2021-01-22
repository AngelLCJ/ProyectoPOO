/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos;

/**
 *
 * @author Correa Juárez Ángel Leonardo
 * @author Cruz Martínez Raúl
 * @author Mendoza Bolaños Carlos Gabriel
 * @author Villanueva Corona Miguel Ángel
 * 
 * La clase producto va a ser la clase en la que vamos a partir para generar los otros tipos de productos
 * en esta clase lo que se va a generar son getters, setters, to string y constructores
 */
public class Producto {
    public int codigoBarra;
    public float precio;
    String nombre , marca;

    public Producto() {
    }

    public Producto(float precio, int codigoBarra, String nombre, String marca) {
        this.precio = precio;
        this.codigoBarra = codigoBarra;
        this.nombre = nombre;
        this.marca = marca;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
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
