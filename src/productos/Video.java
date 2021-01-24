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
 * En esta clase hereda de disco alguno de sus atributos ademas en esta clase disco se crean constructores, getters, setters y to string.
 */
public class Video extends Disco{
    int duracion;
    /**
     * Es el constructor sin parametros.
     */
    public Video() {
    }
    /**
     * Es el constructor que tiene parámetros.
     * @param duracion Es la duración del video, es de tipo int.
     * @param artista Es el artista del video, es de tipo String.
     * @param numCanciones Es el numero de canciones del video, es de tipo int.
     * @param precio Es el precio del video, es de tipo float.
     * @param codigoBarra Es el codigo de barra del video, es de tipo int.
     * @param nombre Es el nombre del video, es de tipo String.
     * @param marca Es la marca del video, es de tipo String.
     */
    public Video(int duracion, String artista, int numCanciones, float precio, int codigoBarra, String nombre, String marca) {
        super(artista, numCanciones, precio, codigoBarra, nombre, marca);
        this.duracion = duracion;
    }
    /**
     * Getter que devuelve la información de duración, es la duración del video.
     * @return duración, es de tipo int.
     */
    public int getDuracion() {
        return duracion;
    }
    /**
     * Setter que contiene la información de la duración, es la duración del video.
     * @param duracion Es de tipo int.
     */
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    /**
     * Getter que da la información del artista, es el artista del video.
     * @return artista, es de tipo String.
     */
    @Override
    public String getArtista() {
        return artista;
    }
    /**
     * Setter que tiene la información del artista, es el artista del video.
     * @param artista Es de tipo String.
     */
    @Override
    public void setArtista(String artista) {
        this.artista = artista;
    }
    /**
     * Getter que retorna el valor de número de canciones, es el número de canciones de video.
     * @return numCanciones, es de tipo int.
     */
    @Override
    public int getNumCanciones() {
        return numCanciones;
    }
    /**
     * Setter que almacena el número de canciones, es el número de canciones de video.
     * @param numCanciones Es de tipo int.
     */
    @Override
    public void setNumCanciones(int numCanciones) {
        this.numCanciones = numCanciones;
    }
    /**
     * Getter que tiene el valor de precio, es el precio del video.
     * @return precio, es de tipo float.
     */
    @Override
    public float getPrecio() {
        return precio;
    }
    /**
     * Setter que almacena el valor de precio, es el precio del video.
     * @param precio Es de tipo float.
     */
    @Override
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    /**
     * Getter que retorna el valor del codigo de barra, es del codigo de barra del video.
     * @return codigoBarra, es de tipo int.
     */
    @Override
    public int getCodigoBarra() {
        return codigoBarra;
    }
    /**
     * Setter contiene la información de codigo de Barra, es el codigo de barra del video.
     * @param codigoBarra Es de tipo int.
     */
    @Override
    public void setCodigoBarra(int codigoBarra) {
        this.codigoBarra = codigoBarra;
    }
    /**
     * Getter que devuelve la información de nombre, es el nombre del video.
     * @return nombre, es de tipo String.
     */
    @Override
    public String getNombre() {
        return nombre;
    }
    /**
     * Setter  que almacena la información del nombre, es el nombre del video.
     * @param nombre Es de tipo String.
     */
    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Getter que muestra la información de marca, marca del video.
     * @return marca, es de tipo String.
     */
    @Override
    public String getMarca() {
        return marca;
    }
    /**
     * Setter que contiene la información de marca, es de tipo Strig.
     * @param marca Es de tipo String.
     */
    @Override
    public void setMarca(String marca) {
        this.marca = marca;
    }
    /**
     * Método toString que nos devuelve la información general de video.
     * @return información de video, es de tipo String.
     */
    @Override
    public String toString() {
        return super.toString()+"Video{" + "duracion=" + duracion + '}';
    }

}
