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
 * @author angel
 */
public class aparatosDeAmbiente {

    public aparatosDeAmbiente() {
    }
    
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
    public void videoPlayerMetodo(Hashtable inventarioTablaMusica, Hashtable inventarioTablaVideo){
        int opcionDisco,opcionRep,codigoBarra;
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
                                int numeroCancion;
                                String cancion;
                                //ArrayList<String>canciones=new ArrayList<String>();
                                //Musica discoX;
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

 
