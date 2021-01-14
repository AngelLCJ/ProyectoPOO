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

    public Disco(String artista, int numCanciones, String nombre, String marca, int codigoBarra, int precio) {
        super(nombre, marca, codigoBarra, precio);
        this.artista = artista;
        this.numCanciones = numCanciones;
    }
    
    
}
