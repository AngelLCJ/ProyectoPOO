/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleados;

import aparatosDeAmbiente.*;
import caja.*;
import crud.*;
import inventario.Inventario;
import java.util.Hashtable;
import productos.*;
import zorzalMusic.KeyboardInput;

/**
 *
 * @author Correa Juárez Ángel Leonardo
 * @author Cruz Martínez Raúl
 * @author Mendoza Bolaños Carlos Gabriel
 * @author Villanueva Corona Miguel Ángel
 * 
 * En la clase gerente se le da acceso a todo el menu ya que este puede acceder al CRUD, a los aparatos de ambiente y 
 * a la caja, esto se realizo con ayuda de las otras clases que tenian que ver con estos apartados cada una 
 */
public class Gerente {
    /**
     * Metodo que le da las opciones de operacion al gerente
     * @param usuario 
     * recibe un usuario en donde este va a servir para generar el ticket
     */
    public void Gerente(String usuario) {
        int opcion1 ;
        int opcion2;
        Inventario inventario = new Inventario();
        Hashtable<Integer,Musica>inventarioMusica=new Hashtable<Integer,Musica>();
        Hashtable<Integer,Video>inventarioVideo=new Hashtable<Integer,Video>();
        Hashtable<Integer,Audifonos>inventarioAudifonos=new Hashtable<Integer,Audifonos>();
        Hashtable<Integer,Producto> listaVenta = new Hashtable<Integer,Producto>();
        inventario.inventarioMusicaMetodo(inventarioMusica);
        inventario.inventarioVideoMetodo(inventarioVideo);
        inventario.inventarioAudifonosMetodo(inventarioAudifonos);
        aparatosDeAmbiente aparatos = new aparatosDeAmbiente();
        SeleccionadorDeAparatos seleccionador = new SeleccionadorDeAparatos();
        int opcionPrincipal;
        Caja caja = new Caja();
        KeyboardInput inputPrincipal = new KeyboardInput();
        do{
        System.out.println("Ingrese la opcion que desea realizar");
        System.out.println("1) CRUD de productos   2) Seleccionador de aparatos de ambiente   3) Caja   4) Salir del programa");
        opcionPrincipal = inputPrincipal.readInteger();
            switch (opcionPrincipal){
                case 1:
                    do{
                        KeyboardInput input  =new KeyboardInput();
                        System.out.println("******* Crud *********\n");
                        System.out.println("1)Crear\t 2)Leer\t 3)Actualizar\t 4)Borrar\t5)Salir\n");
                        System.out.println("¿Que opción desea realizar?\n");
                        //Object menu=new Object();
                        opcion1 = input.readInteger();
                        switch(opcion1){
                                case 1:
                                    do{
                                        Crear crearCrud=new Crear();
                                        System.out.println("¿Que producto deseas crear?\n");
                                        System.out.println("1) Disco de musica\t2) Disco de video\t3) Audifonos\t 4) Salir");
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
                                                for(Audifonos valorAudifonos: inventarioAudifonos.values()){
                                                    System.out.println(valorAudifonos);
                                                }
                                                break;
                                            case 4:
                                                System.out.println("Saliendo al menu de CRUD...");
                                                break;
                                            } 

                                        }  while(opcion2<4);
                                    break;
                                    //crearCrud.CrearMusica();
                                case 2:
                                    do{
                                    //Leer leerCrud = new Leer();
                                    System.out.println("¿Que catalogo deseas observar?");
                                    System.out.println("1)Catálogo General\t2)Catálogo Disco de música\t3)Catálogo de disco de video\t4)Catálogo de audifonos\5) Salir al menu de CRUD");
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
                                            case 5:
                                                System.out.println("Saliendo al menu de CRUD...");
                                                break;
                                       }
                                    }while(opcion2<5);
                                    break;
                                case 3:
                                    do {                        
                                        Actualizar actualizarCrud = new Actualizar();
                                        System.out.println("¿Que producto deseas actualizar?\n");
                                        System.out.println("1) Disco de musica\t2) Disco de video\t3) Audifonos\4) Salir al menu de CRUD");
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
                                            case 4:
                                                System.out.println("Saliendo al menu de CRUD");
                                                break;
                                            }
                                    } while(opcion2 < 4);
                                    break;
                                case 4:
                                    do{
                                        Borrar borrarCrud=new Borrar();
                                        System.out.println("¿Que producto deseas borrar?\n");
                                        System.out.println("1) Disco de musica\t2) Disco de video\t3) Audifonos\t 4) Salir al menu de CRUD");
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
                                            case 4:
                                                System.out.println("Saliendo al menu de CRUD...");
                                                break;
                                            } 
                                    }while(opcion2<4);
                                    break;
                                case 5:
                                    System.out.println("Hasta luego");
                                    break;
                                default:
                                    System.out.println("Esa opcion no existe");

                            }
                        }while(opcion1<5);
                    break;
                case 2:
                    seleccionador.seleccionadorDeAparatosMetodo(inventarioMusica, inventarioVideo);
                    break;
                case 3:
                    caja.cajaMetodo(inventarioMusica, inventarioVideo, inventarioAudifonos, listaVenta,usuario);
                    for(Producto valorVideo: listaVenta.values()){
                        System.out.println("Nombre del Producto: "+ valorVideo.getNombre()+ " Codigo de Barra: " + valorVideo.getCodigoBarra() +" Precio: $"+ valorVideo.getPrecio());
                    }
                    break;
                case 4:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Esa opcion no existe");
            }
        }while(opcionPrincipal<4);
    }
}
