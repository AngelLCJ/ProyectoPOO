/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aparatosDeAmbiente;

import crud.*;
import inventario.Inventario;
import java.util.ArrayList;
import java.util.Hashtable;
import productos.Musica;
import productos.Video;
import zorzalMusic.KeyboardInput;
/**
 *
 * @author Correa Juárez Ángel Leonardo
 * @author Cruz Martínez Raúl
 * @author Mendoza Bolaños Carlos Gabriel
 * @author Villanueva Corona Miguel Ángel
 * 
 * En esta clase lo que se decea lograr es hacer un menu para los aparatos de ambiente en los cuales se le va a preguntar a los 
 * usuarios que es lo que decean realizar en cuanto reproducir ya sea una cancion o un video, dicha cancion o video deve de 
 * estar contenida dentro del inventario de discos ya que si esta no se encuentra en existencia el programa va a mandar un mensaje
 * explicando que el disco que ingreso no esta en existencia, ambos reproductores tienen sus opciones el primero es el music player
 * en el cual se le van a dar tres opciones en la primera encontraremos que la opcion es reproducir el disco completo la segunda
 * a su vez es la reproduccion individual en la cual se le pide al usuario que ingrese el codigo de barras del disco y el numero de
 * la cancion a reproducir, ya por ultimo nos encontramos con la opcion de salir de este menu que te saca al saleccionador de
 * aparatos de ambientes, en seguida tenemos al videoplayer el cual tiene un menu similar al de music player ya que este puede
 * reproducir va a pedir lo mismo antes mencionado, ademas, este menu da la opcion de reproducir los discos de video que se encuentren
 * en el inventario de la tienda.
 */
public class aparatosDeAmbiente {
    /**
     * Constructor vacío de aparatosDeAmbiente
     */
    public aparatosDeAmbiente() {
    }
    /**
     * Metodo para reproducir musica
     * @param inventarioTablaMusica, inventario de discos de musica generado hasta el momento
     * @param inventarioTablaVideo , invnetario de discos de video generado hasta el omento
     */
    public void musicPlayerMetodo(Hashtable inventarioTablaMusica, Hashtable inventarioTablaVideo){
        int opcionRep=0, codigoBarra=0;
        while(opcionRep<3){
            System.out.println("Seleccione la forma de reproduccion del disco");
            System.out.println("1) Disco completo\t2)Por cancion\t3)Salir al seleccionador de aparato de ambiente");
            KeyboardInput input=new KeyboardInput();
            opcionRep=input.readInteger();
            if(opcionRep>3){
                System.out.println("Esa opcion no existe");
                break;
            }else if(opcionRep==3){
                SeleccionadorDeAparatos  seleccionador = new SeleccionadorDeAparatos();
                seleccionador.seleccionadorDeAparatosMetodo(inventarioTablaMusica, inventarioTablaVideo);
                break;
            }
            System.out.println("Ingrese el codigo de barras del disco");
            codigoBarra=input.readInteger();
            if (inventarioTablaMusica.containsKey(codigoBarra)==true) {
            switch (opcionRep){
                case 1:
                    Musica discoX;
                    ArrayList<String>canciones=new ArrayList<String>();
                    discoX=(Musica)inventarioTablaMusica.get(codigoBarra);
                    canciones=discoX.getNombreCanciones();
                    System.out.println("Reproduciendo...");
                    for(String elemento: canciones){
                        try{
                            System.out.println(elemento);
                            Thread.sleep(2*1000);
                        }catch(InterruptedException IE){}
                    }
                    System.out.println(canciones);
                    break;
                case 2:
                    int numeroCancion,i=1;
                    String cancion;
                    discoX=(Musica)inventarioTablaMusica.get(codigoBarra);
                    canciones=discoX.getNombreCanciones();
                     for(String elemento: canciones){
                            System.out.println(i +". "+ elemento); 
                            i += 1;
                    }
                    System.out.println("Ingrese el numero de la cancion a reproducir");
                    numeroCancion = input.readInteger()-1;
                    discoX=(Musica)inventarioTablaMusica.get(codigoBarra);
                    canciones=discoX.getNombreCanciones();
                    cancion= canciones.get(numeroCancion);
                    System.out.println("Reproduciendo...");
                    System.out.println(cancion);
                    break;
                case 3:
                    System.out.println("Adios");
                    break;
                default:
                    break;
                    //throw new AssertionError();
                }
        } 
        else {
            System.out.println("No existe ese disco");
            }
        } 
           
     //1}while(opcionRep<3);
    }
    /**
     * Metodo para reproducir musica desde el videoplayer
     * @param inventarioTablaMusica,inventario de discos de musica generado hasta el momento
     * @param inventarioTablaVideo, invnetario de discos de video generado hasta el omento
     */
    public void videoPlayerMetodo(Hashtable inventarioTablaMusica, Hashtable inventarioTablaVideo){
        int opcionDisco=0,opcionRep,codigoBarra;
        
        System.out.println("Ingrese el tipo de disco que quiere reproducir");
        System.out.println("1) Disco de video\t2) Disco de musica 3) Salir al selector de aparatos de ambiente");
        KeyboardInput input=new KeyboardInput();
        opcionDisco=input.readInteger();
        while(opcionDisco<4){
            if(opcionDisco>3){
                System.out.println("Esa opcion no existe");
                break;
            }else if(opcionDisco==3){
                SeleccionadorDeAparatos  seleccionador = new SeleccionadorDeAparatos();
                seleccionador.seleccionadorDeAparatosMetodo(inventarioTablaMusica, inventarioTablaVideo);
                break;
            }
            
            switch (opcionDisco) {
                case 1:
                    Video discoX;
                    String nombreDisco;
                    System.out.println("Ingrese el codigo de barras del disco de video");
                    codigoBarra=input.readInteger();
                    if (inventarioTablaVideo.containsKey(codigoBarra)==true) {
                        try{
                            System.out.println("Reproduciendo...");
                            discoX = (Video) inventarioTablaVideo.get(codigoBarra);
                            nombreDisco = discoX.getNombre();
                            System.out.println(nombreDisco);
                            Thread.sleep(2*1000);
                            System.out.println("Se ha terminado de reproducir "+nombreDisco);
                        }catch(InterruptedException IE){}
                        //break;
                    }else{
                        System.out.println("Ese disco no existe");
                        SeleccionadorDeAparatos  seleccionador = new SeleccionadorDeAparatos();
                        seleccionador.seleccionadorDeAparatosMetodo(inventarioTablaMusica, inventarioTablaVideo);
                        //break;
                    }
                    opcionDisco=3;
                    break;
                case 2:
                    Musica discoXM;
                    opcionRep=0;
                    codigoBarra=0;
                    while(opcionRep<3){
                        System.out.println("Seleccione la forma de reproduccion del disco");
                        System.out.println("1) Disco completo\t2)Por cancion\t3)Salir al seleccionador de aparato de ambiente");
                        opcionRep=input.readInteger();
                        if(opcionRep>3){
                            System.out.println("Esa opcion no existe");
                            break;
                        }else if(opcionRep==3){
                            SeleccionadorDeAparatos  seleccionador = new SeleccionadorDeAparatos();
                            seleccionador.seleccionadorDeAparatosMetodo(inventarioTablaMusica, inventarioTablaVideo);
                            break;
                        }
                        System.out.println("Ingrese el codigo de barras del disco");
                        codigoBarra=input.readInteger();
                        if (inventarioTablaMusica.containsKey(codigoBarra)==true) {
                        switch (opcionRep){
                            case 1:
                                
                                ArrayList<String>canciones=new ArrayList<String>();
                                discoXM=(Musica)inventarioTablaMusica.get(codigoBarra);
                                canciones=discoXM.getNombreCanciones();
                                System.out.println("Reproduciendo...");
                                for(String elemento: canciones){
                                    try{
                                        System.out.println(elemento);
                                        Thread.sleep(2*1000);
                                    }catch(InterruptedException IE){}
                                }
                                System.out.println(canciones);
                                break;
                            case 2:
                                int numeroCancion,i=1;
                                String cancion;
                                //ArrayList<String>canciones=new ArrayList<String>();
                                discoXM=(Musica)inventarioTablaMusica.get(codigoBarra);
                                canciones=discoXM.getNombreCanciones();
                                for(String elemento: canciones){
                                    System.out.println(i +". "+ elemento); 
                                    i += 1;
                                }
                                System.out.println("Ingrese el numero de la cancion a reproducir");
                                numeroCancion = input.readInteger()-1;
                                discoXM=(Musica)inventarioTablaMusica.get(codigoBarra);
                                canciones=discoXM.getNombreCanciones();
                                cancion= canciones.get(numeroCancion);
                                System.out.println("Reproduciendo...");
                                System.out.println(cancion);
                                break;
                            case 3:
                                System.out.println("Adios");
                                break;
                            default:
                                break;
                                //throw new AssertionError();
                            }
                    } 
                    else {
                        System.out.println("No existe ese disco");
                        SeleccionadorDeAparatos  seleccionador = new SeleccionadorDeAparatos();
                        seleccionador.seleccionadorDeAparatosMetodo(inventarioTablaMusica, inventarioTablaVideo);
                        }
                    }
                    opcionDisco=3;
                    break;
                case 3:
                    System.out.println("Adios");
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }   
}

 
