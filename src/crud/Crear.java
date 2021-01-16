/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;
import java.util.ArrayList;
import productos.*;
import inventario.*;
import java.util.Enumeration;
import java.util.Hashtable;
import zorzalMusic.*;
/**
 *
 * @author angel
 */
public class Crear {
    
   public Crear(){ 
       
   }
   public Hashtable crearMusica(Hashtable inventarioTabla){
       int numDiscos;
       ArrayList nombreCanciones;
       String artista, nombre, marca; 
       int numCanciones, codigoBarra;
       float precio;
       ///alkjslkjalsk
       
       System.out.println("¿Cuantos discos de musica desea crear?");
       KeyboardInput input=new KeyboardInput();
       numDiscos = input.readInteger();
       for (int i = 0; i < numDiscos; i++) {
           System.out.println("Ingrese el nomnbre del artista");
           artista = input.readString();
           System.out.println("Ingrese el nombre del album");
           nombre = input.readString();
           System.out.println("Ingrese la disquera");
           marca = input.readString();
           System.out.println("Ingrese el precio");
           precio = input.readFloat();
           System.out.println("Ingrese el codigo de barras");
           codigoBarra = input.readInteger();
           System.out.println("Ingrese el numero de canciones");
           numCanciones = input.readInteger();
           ArrayList<String>nombreCancion = new ArrayList<String>();
           for (int j = 0; j < numCanciones; j++) {
               System.out.println("Ingrese el nombre de la cancion "+ i);
               String nombCancion= input.readString();
               nombreCancion.add(nombCancion);
           }
           Musica discoX = new Musica(nombreCancion, artista, numCanciones, precio, codigoBarra, nombre, marca);
           //InventarioMusica inventarioM = new InventarioMusica();
           /*inventarioM.inventarioMusica();
           inventarioM.put(discoEquis.codigoBarra,discoEquis);*/
           inventarioTabla.put(discoX.codigoBarra,discoX);
           
            
       }
       /*Musica cancionNueva=new Musica();
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
       inventarioMus.p
               .put(cancionNueva.codigoBarra,cancionNueva);*/
   return inventarioTabla;
   }
   
   public Hashtable crearVideo(Hashtable inventarioTabla){
       int numDiscos, duracion, numCanciones, codigoBarra;
       float precio;
       String artista, nombre, marca;
       
       System.out.println("¿Cuantos discos de video desea crear?");
       KeyboardInput input=new KeyboardInput();
       numDiscos = input.readInteger();
       
       for (int i = 0; i < numDiscos; i++) {
           System.out.println("Ingrese el nombre del artista");
           artista = input.readString();
           System.out.println("Ingrese el nombre del DVD");
           nombre = input.readString();
           System.out.println("Ingrese el nombre de la disquera");
           marca = input.readString();
           System.out.println("Ingrese el precio");
           precio = input.readFloat();
           System.out.println("Ingrese el numero de cacniones");
           numCanciones = input.readInteger();
           System.out.println("Ingrese el codigo de barra");
           codigoBarra = input.readInteger();
           System.out.println("Ingrese la duracion del disco de video");
           duracion = input.readInteger();
           
           Video videoX = new Video(duracion, artista, numCanciones, precio, codigoBarra, nombre, marca);
           inventarioTabla.put(videoX.codigoBarra,videoX);
       }
       
       return inventarioTabla;
   }
   
   
}
