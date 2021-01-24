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
 * @author Correa Juárez Ángel Leonardo
 * @author Cruz Martínez Raúl
 * @author Mendoza Bolaños Carlos Gabriel
 * @author Villanueva Corona Miguel Ángel
 * 
 * Crear es una clase de tipo Crud en la cual el gerente puede crear cualquier producto de los tres diferentes tipos 
 * esto se realizo con la ayuda de for para poder generar un menu interactivo en el cual el usuario en este caso el gerente
 * va ingresar el numero correspondiente con el producto a crear,despues pregunta cual es la cantidad de productos deceas crear
 * ,siguiente a eso se le pide al gerente que ingrese los datos importantes del producto dentro de los apartados indicados
 * despues todos los datos racabados los almacena durante la ejecucion en una tabla hash la cual usamos para el inventario
 */
public class Crear {
    
   public Crear(){ 
       
   }
   /**
    * 
    * @param inventarioTabla Es el inventario al cual se le le añadirá uno o 
    * varios discos de música.
    * de música
    * @return el inventario el cual contendra los discos de música creados.
    */
   public Hashtable crearMusica(Hashtable inventarioTabla){
       int numDiscos;
       ArrayList nombreCanciones;
       String artista, nombre, marca; 
       int numCanciones, codigoBarra;
       float precio;
       
       System.out.println("¿Cuantos discos de musica desea crear?");
       KeyboardInput input=new KeyboardInput();
       numDiscos = input.readInteger();
       for (int i = 0; i < numDiscos; i++) {
           System.out.println("Ingrese el nombre del album "+(i+1));
           nombre = input.readString();
           System.out.println("Ingrese el nomnbre del artista");
           artista = input.readString();
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
   return inventarioTabla;
   }
   /**
    * 
    * @param inventarioTabla Es el inventario al cual se le le añadirá uno o 
    * varios discos de video.
    * @return el inventario el cual contendra los discos de video creados.
    */
   public Hashtable crearVideo(Hashtable inventarioTabla){
       int numDiscos, duracion, numCanciones, codigoBarra;
       float precio;
       String artista, nombre, marca;
       
       System.out.println("¿Cuantos discos de video desea crear?");
       KeyboardInput input=new KeyboardInput();
       numDiscos = input.readInteger();
       
       for (int i = 0; i < numDiscos; i++) {
           System.out.println("Ingrese el nombre del DVD "+(i+1));
           nombre = input.readString();
           System.out.println("Ingrese el nombre del artista");
           artista = input.readString();
           System.out.println("Ingrese el nombre de la disquera");
           marca = input.readString();
           System.out.println("Ingrese el precio");
           precio = input.readFloat();
           System.out.println("Ingrese el numero de canciones");
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
   /**
    * 
    * @param inventarioTabla Es el inventario al cual se le le añadirá uno o 
    * varios audífonos.
    * @return el inventario el cual contendra los audífonos creados.
    */
   public Hashtable crearAudifonos(Hashtable inventarioTabla){
       String color, tipo, nombre, marca;
       int codigoBarra, numAudifonos;
       float precio;
       
       System.out.println("¿Cuantos audifonos desea crear?");
       KeyboardInput input=new KeyboardInput();
       numAudifonos = input.readInteger();
       
       for (int i = 0; i < numAudifonos; i++) {
           System.out.println("Ingrese el nombre de los audifonos numero "+(i+1));
           nombre = input.readString();
           System.out.println("Ingrese la marca de los audifonos");
           marca = input.readString();
           System.out.println("Ingrese el tipo de audifonos");
           tipo = input.readString();
           System.out.println("Ingrese el color de los audifonos");
           color = input.readString();
           System.out.println("Ingrese el codigo de barras");
           codigoBarra = input.readInteger();
           System.out.println("Ingrese el precio");
           precio = input.readInteger();
           
           Audifonos audifonosX = new Audifonos(color, tipo, precio, codigoBarra, nombre, marca);
           inventarioTabla.put(audifonosX.codigoBarra,audifonosX);
       }
       
       return inventarioTabla;
   }
   
}
