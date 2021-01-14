/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos;

/**
 *
 * @author carlos
 */
public class Disco extends Productos{
    String artista;
    int numCanciones;

    public Disco() {
    }

    public Disco(String artista, int numCanciones, int precio, int codigoBarra, String nombre, String marca) {
        super(precio, codigoBarra, nombre, marca);
        this.artista = artista;
        this.numCanciones = numCanciones;
    }

}
