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
 * Aqui se generan la clase audifonos con sus respectivos constructores, getters y setters y to string,
 * esta clase hereda de producto el cual contiene el nombre, precio, marca, etc. esta clase los atributos que contiene 
 * son el color y el tipo de audifonos
 */
public class Audifonos extends Producto {
    String color, tipo;
    /**
     * Constructor sin paramétros.
     */
    public Audifonos() {
    }
    /**
     * Es el constructor con paramétros.
     * @param color Es el color de los audifonos, es de tipo String.
     * @param tipo Es el tipo de los audifonos, es de tipo String.
     * @param precio Es el precio de los audifonos, es de tipo float.
     * @param codigoBarra Es el codigo de barra, es de tipo int.
     * @param nombre Es el nombre de los audifonos, es de tipo String.
     * @param marca Es la marca de los audifonos, es de tipo String.
     */
    public Audifonos(String color, String tipo, float precio, int codigoBarra, String nombre, String marca) {
        super(precio, codigoBarra, nombre, marca);
        this.color = color;
        this.tipo = tipo;
    }
    /**
     * Getter que almacena la información de colo, es el color de los audifonos.
     * @return color, es de tipo de String.
     */
    public String getColor() {
        return color;
    }
    /**
     * Setter contiene la información de color, es el color de los audifonos.
     * @param color Es de tipo String.
     */
    public void setColor(String color) {
        this.color = color;
    }
    /**
     * Getter que devuelve la información de tipo, es el tipo del audifonos.
     * @return tipo, es de tipo String.
     */
    public String getTipo() {
        return tipo;
    }
    /**
     * Setter que contiene la información de tipo, es el tipo de audifonos.
     * @param tipo Es de tipo Sring.
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    /**
     * Getter que tiene el valor de precio, es el precio de los audifonos.
     * @return precio, es de tipo float.
     */
    @Override
    public float getPrecio() {
        return precio;
    }
    /**
     * Setter que almacena el valor de precio, es el precio de los audifonos.
     * @param precio Es de tipo float.
     */
    @Override
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    /**
     * Getter que retorna el valor del codigo de barra, es del codigo de barra de los audifonos.
     * @return codigoBarra, es de tipo int.
     */
    @Override
    public int getCodigoBarra() {
        return codigoBarra;
    }
    /**
     * Setter contiene la información de codigo de Barra, es el codigo de barra de los audifonos.
     * @param codigoBarra Es de tipo int.
     */
    @Override
    public void setCodigoBarra(int codigoBarra) {
        this.codigoBarra = codigoBarra;
    }
    /**
     * Getter que devuelve la información de nombre, es el nombre de los audifonos.
     * @return nombre, es de tipo String.
     */
    @Override
    public String getNombre() {
        return nombre;
    }
    /**
     * Setter  que almacena la información del nombre, es el nombre de los audifonos.
     * @param nombre Es de tipo String.
     */
    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Getter que muestra la información de marca, marca de los audifonos.
     * @return marca, es de tipo String.
     */
    @Override
    public String getMarca() {
        return marca;
    }
    /**
     * Setter que contiene la información de marca, marca de los audifonos.
     * @param marca Es de tipo String
     */
    @Override
    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return super.toString()+"Audifonos{" + "color=" + color + ", tipo=" + tipo + '}';
    }
    
    
}
