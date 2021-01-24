/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos;

import java.util.ArrayList;

/**
 *
 * @author Correa Juárez Ángel Leonardo
 * @author Cruz Martínez Raúl
 * @author Mendoza Bolaños Carlos Gabriel
 * @author Villanueva Corona Miguel Ángel
 * 
 * En esta clase hereda de disco alguno de sus atributos ademas en esta clase disco se crean constructores, getters, setters y to string.
 */
public class Musica extends Disco{
    //String nombreCanciones ;
    public ArrayList<String>nombreCanciones;
    
    /**
     * Es el constructor vacio de la clase Musica
     */
    public Musica() {
    }
    /**
     * Es el constructor con argumentos de la clase Musica
     * @param nombreCanciones, es la lista que contiene el nombre de las canciones
     * @param artista, es el String del nombre artista del disco de musica
     * @param numCanciones, es el numero entero de canciones del disco, 
     * @param precio, de tipo float que indica el precio del disco
     * @param codigoBarra, de tipo entero que indica el codigo de barras del disco
     * @param nombre, String que da el nombre del disco
     * @param marca, String de la marca o disquera del disco
     */
    public Musica(ArrayList nombreCanciones, String artista, int numCanciones, float precio, int codigoBarra, String nombre, String marca) {
        super(artista, numCanciones, precio, codigoBarra, nombre, marca);
        this.nombreCanciones = nombreCanciones;
        //nombreCanciones.add("Hola");
        //nombreCanciones.add("Adios");
    }
    /**
     * Getter que da el nombre
     * @return nombreCanciones, es de tipo ArrayList
     */
    public ArrayList getNombreCanciones() {
        return nombreCanciones;
    }
    /**
     * Es el metodo que modifica el nombre de las cancxiones
     * @param nombreCanciones es de tipo Array list
     */
    public void setNombreCanciones(ArrayList nombreCanciones) {
        this.nombreCanciones = nombreCanciones;
    }
    /**
     * Getter que da el nombre del artista
     * @return artista, es de tipo String
     */
    public String getArtista() {
        return artista;
    }
    /**
     * Metodo para modificar el nombre del artista
     * @param artista es de tipo String 
     */
    public void setArtista(String artista) {
        this.artista = artista;
    }
    /**
     * Getter que otorga el numero de canciones del disco
     * @return numCancioneas, es de tipo int
     */
    public int getNumCanciones() {
        return numCanciones;
    }
    /**
     * Metodo que nos permite modificar el numero de canciones
     * @param numCanciones es de tipo int
     */
    public void setNumCanciones(int numCanciones) {
        this.numCanciones = numCanciones;
    }
    /**
     * Metodo que nos da el precio del disco
     * @return precio, es de tipo float
     */
    public float getPrecio() {
        return precio;
    }
    /**
     * Metodo para modificar el precio del disco
     * @param precio es de tipo float
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    /**
     * Metodo que te otorga el codigo de barras del disco
     * @return codigoBarra, es de tipo int
     */
    public int getCodigoBarra() {
        return codigoBarra;
    }
    /**
     * Metodo para modificar el codigo de barra del disco
     * @param codigoBarra es de tipo int
     */
    public void setCodigoBarra(int codigoBarra) {
        this.codigoBarra = codigoBarra;
    }
    /**
     * Metodo que te da el nombre del disco
     * @return nombre, es de tipo String
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Metodo para modificar el nombre del disco
     * @param nombre es de tipo Striung
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Metodo que nos da la disquera del disco
     * @return marca, es de tipo String
     */
    public String getMarca() {
        return marca;
    }
    /**
     * Metodo que modifica la disquera
     * @param marca es de tipo String
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }
    /**
     * Metodo toString de Musica
     * @return la informacion del disco
     */
    @Override
    public String toString() {
        return super.toString()+"Musica{" + "nombreCanciones=" + nombreCanciones + '}';
    }

}
