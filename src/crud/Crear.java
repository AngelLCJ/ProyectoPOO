/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;
import java.util.ArrayList;
import productos.*;
import inventario.*;
/**
 *
 * @author angel
 */
public class Crear {
    
   public Crear(){ 
       
   }
   public void CrearMusica(){
       Musica cancionNueva=new Musica();
       System.out.println("Ingrese el nombre del artista ");
       KeyboardInput input=new KeyboardInput();
       String artista = input.readString();
       cancionNueva.setArtista(artista);
       System.out.println("Ingrese el nombre del album");
       String nombAlbum=input.readString();
       cancionNueva.setNombre(nombAlbum);
       System.out.println("Ingrese el numero de canciones ");
       int numCanciones=input.readInteger();
       cancionNueva.setNumCanciones(numCanciones);
       ArrayList<String>nuevaCancion = new ArrayList<String>();
       for(int i=0;i<numCanciones; i++){
           System.out.println("Ingrese el nombre de la cancion "+ i);
           String nombCancion= input.readString();
           nuevaCancion.add(nombCancion);
       }
       cancionNueva.setNombreCanciones(nuevaCancion);
       System.out.println("Ingrese el precio");
       int precio = input.readInteger();
       cancionNueva.setPrecio(precio);
       System.out.println("Ingrese el código de barra");
       int codigoB= input.readInteger();
       cancionNueva.setCodigoBarra(codigoB);
       System.out.println("Ingrese la marca");
       String marcaM=input.readString();
       cancionNueva.setMarca(marcaM);
       
       InventarioMusica inventarioMus=new InventarioMusica();
       inventarioMus.put
               .put(cancionNueva.codigoBarra,cancionNueva);
   }
       
}
