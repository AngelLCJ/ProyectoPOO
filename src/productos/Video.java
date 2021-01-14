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
public class Video extends Disco{
    int duracion;

    public Video() {
    }

    public Video(int duracion, String artista, int numCanciones, String nombre, String marca, int codigoBarra, int precio) {
        super(artista, numCanciones, nombre, marca, codigoBarra, precio);
        this.duracion = duracion;
    }
    
    
}
