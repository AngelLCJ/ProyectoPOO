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
 * aqui se generan la clase audifonos con sus respectivos constructores, getters y setters y to string,
 * esta clase hereda de producto el cual contiene el nombre, precio, marca, etc. esta clase los atributos que contiene 
 * son el color y el tipo de audifonos
 */
public class Audifonos extends Producto {
    String color, tipo;

    public Audifonos() {
    }

    public Audifonos(String color, String tipo, float precio, int codigoBarra, String nombre, String marca) {
        super(precio, codigoBarra, nombre, marca);
        this.color = color;
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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
        return super.toString()+"Audifonos{" + "color=" + color + ", tipo=" + tipo + '}';
    }
    
    
}
