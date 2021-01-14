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
public class Musica extends Disco{
    String[] nombreCanciones = new String[10];

    public Musica() {
    }

    public Musica(String[] nombreCanciones, String artista, int numCanciones, int precio, int codigoBarra, String nombre, String marca) {
        super(artista, numCanciones, precio, codigoBarra, nombre, marca);
        this.nombreCanciones = nombreCanciones;
    }

    public String[] getNombreCanciones() {
        return nombreCanciones;
    }

    public void setNombreCanciones(String[] nombreCanciones) {
        this.nombreCanciones = nombreCanciones;
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
        return super.toString()+"Musica{" + "nombreCanciones=" + nombreCanciones + '}';
    }

}
