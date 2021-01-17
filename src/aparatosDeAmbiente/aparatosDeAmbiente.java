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
    public static void main(String[] args) throws InterruptedException {
        int opcion1 ;
        String nombre;
        KeyboardInput input  =new KeyboardInput();
        Inventario inventario = new Inventario();
        Hashtable<Integer,Musica>inventarioMusica=new Hashtable<Integer,Musica>();
        Hashtable<Integer,Video>inventarioVideo=new Hashtable<Integer,Video>();
        Inventario playlist = new Inventario();
        inventario.inventarioMusicaMetodo(inventarioMusica);
        inventario.inventarioVideoMetodo(inventarioVideo);
        //Crear discomp = new Crear();
        //nombre=discomp.setNombre;
        //Leer leerCrud = new Leer();
        System.out.println("¿Que decea hacer?");
        System.out.println("1)MusicPlayer\t2)VideoPlayer\t3)Salir");
        KeyboardInput input2=new KeyboardInput();
        opcion1=input.readInteger();
        switch(opcion1){
            case 1:
                System.out.println("MusicPlayer");
                System.out.println("Ingrese el nombre del disco a reproducir");
                for(Musica valor: inventarioMusica.values()){
                    System.out.println(valor);
                }
                nombre=input.readString();
                switch(nombre){
                    case "Thriller":
                        System.out.println("Reproduciendo.....");
                        System.out.println("Wanna Be Startin' Somethin'");
                        Thread.sleep(5*1000);
                        System.out.println("Baby be mine");
                        Thread.sleep(5*1000);
                        System.out.println("The Girl Is Mine (With Paul McCartney)");
                        Thread.sleep(5*1000);
                        System.out.println("Thriller");
                        Thread.sleep(5*1000);
                        System.out.println("Baet It");
                        Thread.sleep(5*1000);
                        System.out.println("Billie Jean");
                        Thread.sleep(5*1000);
                        System.out.println("Human Nature");
                        Thread.sleep(5*1000);
                        System.out.println("P.Y.T. (Pretty Young Thing)");
                        Thread.sleep(5*1000);
                        System.out.println("The Lady In My Life");
                       break;
                    case "Graceland":
                        System.out.println("Reproduciendo.....");
                        System.out.println("The Boy In The Bubble");
                        Thread.sleep(5*1000);
                        System.out.println("Grace Boy Ieland");
                        Thread.sleep(5*1000);
                        System.out.println("I Know What I Know");
                        Thread.sleep(5*1000);
                        System.out.println("Gumboots");
                        Thread.sleep(5*1000);
                        System.out.println("Diamonds on the Soles of Her Shoes");
                        Thread.sleep(5*1000);
                        System.out.println("You Can Call Me All");
                        Thread.sleep(5*1000);
                        System.out.println("Under African Skies");
                        Thread.sleep(5*1000);
                        System.out.println("Homeless");
                        break;
                    case "The New Abnormal":
                        System.out.println("Reproduciendo.....");
                        System.out.println("The Adults Are Talking");
                        Thread.sleep(5*1000);
                        System.out.println("Selfless");
                        Thread.sleep(5*1000);
                        System.out.println("Brooklyn Bridge To Chorus");
                        Thread.sleep(5*1000);
                        System.out.println("Bad Decisions");
                        Thread.sleep(5*1000);
                        System.out.println("Eternal Summer");
                        Thread.sleep(5*1000);
                        System.out.println("At The Door");
                        Thread.sleep(5*1000);
                        System.out.println("Why Are Sundays So Depressing");
                        Thread.sleep(5*1000);
                        System.out.println("Not The Same Anymore");
                        Thread.sleep(5*1000);
                        System.out.println("Ode To The Mets");
                        break;
                    case "Los Tres":
                        System.out.println("Reproduciendo.....");
                        System.out.println("Somos Tontos No Pesados");
                        Thread.sleep(5*1000);
                        System.out.println("El Haz Sensor");
                        Thread.sleep(5*1000);
                        System.out.println("Sudapara");
                        Thread.sleep(5*1000);
                        System.out.println("Flores Secas");
                        Thread.sleep(5*1000);
                        System.out.println("Pajaros de Fuego");
                        Thread.sleep(5*1000);
                        System.out.println("La Primera Vez");
                        Thread.sleep(5*1000);
                        System.out.println("En Jamaica");
                        Thread.sleep(5*1000);
                        System.out.println("Un Amor Violento");
                        Thread.sleep(5*1000);
                        System.out.println("Amores Incompletos");
                        Thread.sleep(5*1000);
                        System.out.println("He Barrido el Sol");
                        break;
                    case "ome":
                        System.out.println("Reproduciendo.....");
                        System.out.println("Frenetico Ritmo");
                        Thread.sleep(5*1000);
                        System.out.println("Me And My Man");
                        Thread.sleep(5*1000);
                        System.out.println("Duele El Caminar");
                        Thread.sleep(5*1000);
                        System.out.println("Boulevard");
                        Thread.sleep(5*1000);
                        System.out.println("En Este Momento");
                        Thread.sleep(5*1000);
                        System.out.println("Head In My Heart");
                        Thread.sleep(5*1000);
                        System.out.println("Sasha y Esteban");
                        Thread.sleep(5*1000);
                        System.out.println("On The Bill");
                        Thread.sleep(5*1000);
                        System.out.println("I Will Go");
                        Thread.sleep(5*1000);
                        System.out.println("No Dejes de Quererme");
                        Thread.sleep(5*1000);
                        System.out.println("Labios");
                        Thread.sleep(5*1000);
                        System.out.println("Even It Out");
                        Thread.sleep(5*1000);
                        System.out.println("Back To Basics");
                        break;  
                    case "nombre":
                            
                            break; 
               }
               break;
            case 2:
                System.out.println("VideoPlayer");
                System.out.println("Ingrese el nombre del disco a visualizar");
                for(Video valor: inventarioVideo.values()){
                    System.out.println(valor);
                }
                nombre=input.readString();
                switch(nombre){
                    case "Funk Engineering":
                        System.out.println("Reproduciendo...Funk Engineering");
                        break;
                    case "Live at Montreux 2004":
                        System.out.println("Reproduciendo...Live at Montreux 2004");
                        break;
                    case "Hamilton":
                        System.out.println("Reproduciendo...Hamilton");
                        break;
                    case "Help":
                        System.out.println("Reproduciendo...Help");
                        break;
                    case "Queen Rock Montreal & Live Aid":
                        System.out.println("Reproduciendo...Queen Rock Montreal & Live Aid");
                        break;
                    case "nombre":
                        
                        break;
                        
                }
                break;
            default:
                System.out.println("Saliendo");
                break;
        }
        
    }
    
}

 
