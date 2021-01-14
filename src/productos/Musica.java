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
    String nombreCanciones;

    public Musica() {
    }

    public Musica(String nombreCanciones, String artista, int numCanciones, String nombre, String marca, int codigoBarra, int precio) {
        super(artista, numCanciones, nombre, marca, codigoBarra, precio);
        this.nombreCanciones = nombreCanciones;
    }

    

    
}
