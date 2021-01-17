/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zorzalMusic;

import crud.Actualizar;
import crud.Borrar;
import crud.Crear;
import inventario.Inventario;
import java.util.Hashtable;
import productos.Audifonos;
import productos.Musica;
import productos.Video;

/**
 *
 * @author angel
 */
public class Gerente {
    public  void Gerente(){
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
                                
                        }  while(opcion2<4);
                    break;
                    //crearCrud.CrearMusica();
                case 2:
                    do{
                    //Leer leerCrud = new Leer();
                    System.out.println("¿Que catalogo deseas observar?");
                    System.out.println("1)Catálogo General\t2)Catálogo Disco de música\t3)Catálogo de disco de video\t4)Catálogo de audifonos");
                    KeyboardInput input2=new KeyboardInput();
                    opcion2=input.readInteger();
                    switch(opcion2){
                        case 1:
                                System.out.println("Discos de Música");
                                 for(Musica valor: inventarioMusica.values()){
                                    System.out.println(valor);
                                }
                                //leerCrud.LeerMusica(inventarioMusica);
                                System.out.println("Discos de Video");
                                for(Video valor: inventarioVideo.values()){
                                    System.out.println(valor);
                                }
                                System.out.println("Audifonos");
                                for(Audifonos valor: inventarioAudifonos.values()){
                                    System.out.println(valor);
                                }
                                break;
                            case 2:
                                System.out.println("Discos de Música");
                                for(Musica valor: inventarioMusica.values()){
                                    System.out.println(valor);
                                }
                                //leerCrud.LeerMusica(inventarioMusica);
                                break;
                            case 3:
                                System.out.println("Discos de Videos");
                                for(Video valor: inventarioVideo.values()){
                                    System.out.println(valor);
                                }
                                break;
                            case 4:
                                System.out.println("Audifonos");
                                for(Audifonos valor: inventarioAudifonos.values()){
                                    System.out.println(valor);
                                }
                                break;
                       }
                    }while(opcion2<5);
                    break;
                case 3:
                    do {                        
                        Actualizar actualizarCrud = new Actualizar();
                        System.out.println("¿Que producto deseas actualizar?\n");
                        System.out.println("1) Disco de musica\t2) Disco de video\t3) Audifonos");
                        KeyboardInput input2=new KeyboardInput();
                        opcion2=input.readInteger();
                        switch(opcion2){
                            case 1:
                                actualizarCrud.actualizarMusica(inventarioMusica);
                                for(Musica valor: inventarioMusica.values()){
                                    System.out.println(valor);
                                }
                                break;
                            case 2:
                                actualizarCrud.actualizarVideo(inventarioVideo);
                                for(Video valorVideo: inventarioVideo.values()){
                                    System.out.println(valorVideo);
                                }
                                break;
                            case 3:
                                actualizarCrud.actualizarAudifonos(inventarioAudifonos);
                                for(Audifonos valorAudifonos: inventarioAudifonos.values()){
                                    System.out.println(valorAudifonos);
                                }
                                break;
                            }
                    } while(opcion2 < 4);
                    break;
                case 4:
                    do{
                        Borrar borrarCrud=new Borrar();
                        System.out.println("¿Que producto deseas borrar\n");
                        System.out.println("1) Disco de musica\t2) Disco de video\t3) Audifonos");
                        KeyboardInput input2=new KeyboardInput();
                        opcion2=input.readInteger();
                        switch(opcion2){
                            case 1:
                                borrarCrud.borrarElemento(inventarioMusica);
                                for(Musica valor: inventarioMusica.values()){
                                    System.out.println(valor);
                                }
                                break;
                            case 2:
                                borrarCrud.borrarElemento(inventarioVideo);
                                for(Video valor: inventarioVideo.values()){
                                    System.out.println(valor);
                                }
                                break;
                            case 3:
                                borrarCrud.borrarElemento(inventarioAudifonos);
                                for(Audifonos valor: inventarioAudifonos.values()){
                                    System.out.println(valor);
                                }
                                break;
                            } 
                    }while(opcion2<4);
                    break;
            }
        }while(opcion1<5);
    }

}



