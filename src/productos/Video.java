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

    public Video() {
    }

    public Video(int duracion, String artista, int numCanciones, float precio, int codigoBarra, String nombre, String marca) {
        super(artista, numCanciones, precio, codigoBarra, nombre, marca);
        this.duracion = duracion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getNumCanciones() {
        return numCanciones;
    }

    public void setNumCanciones(int numCanciones) {
        this.numCanciones = numCanciones;
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
        return super.toString()+"Video{" + "duracion=" + duracion + '}';
    }

}
