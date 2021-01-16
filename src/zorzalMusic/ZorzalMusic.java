/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zorzalMusic;

/**
 *
 * @author angel
 */
import empleados.*;
import aparatosDeAmbiente.*;
import crud.*;
import inicio.*;
import productos.*;
import crud.*;
import inventario.*;
import java.util.Hashtable;
public class ZorzalMusic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion1 ;
        int opcion2;
        Inventario inventario = new Inventario();
        Hashtable<Integer,Musica>inventarioMusica=new Hashtable<Integer,Musica>();
        Hashtable<Integer,Video>inventarioVideo=new Hashtable<Integer,Video>();
        Hashtable<Integer,Audifonos>inventarioAudifonos=new Hashtable<Integer,Audifonos>();
        inventario.inventarioMusicaMetodo(inventarioMusica);
        inventario.inventarioVideoMetodo(inventarioVideo);
        inventario.inventarioAudifonosMetodo(inventarioAudifonos);
        
        do{
        KeyboardInput input  =new KeyboardInput();
        System.out.println("******* Crud *********\n");
        System.out.println("1)Crear\t 2)Leer\t 3)Actualizar\t 4)Borrar\t\n");
        System.out.println("Que opción desea realizar\n");
        //Object menu=new Object();
        opcion1 = input.readInteger();
        switch(opcion1){
                case 1:
                    do{
                        Crear crearCrud=new Crear();
                        System.out.println("¿Que producto deseas crear\n");
                        System.out.println("1) Disco de musica\t2) Disco de video\t3) Audifonos");
                        KeyboardInput input2=new KeyboardInput();
                        opcion2=input.readInteger();
                        switch(opcion2){
                            case 1:
                                crearCrud.crearMusica(inventarioMusica);
                                for(Musica valor: inventarioMusica.values()){
                                    System.out.println(valor);
                                }
                                break;
                            case 2:
                                crearCrud.crearVideo(inventarioVideo);
                                for(Video valorVideo: inventarioVideo.values()){
                                    System.out.println(valorVideo);
                                }
                                break;
                            case 3:
                                crearCrud.crearAudifonos(inventarioAudifonos);
                                for(Video valorAudifonos: inventarioVideo.values()){
                                    System.out.println(valorAudifonos);
                                }
                                break;
                        }
                    }
                    while(opcion2<4);
                    //crearCrud.CrearMusica();
                    
        }
        }while(opcion1<5);
    }
    
}