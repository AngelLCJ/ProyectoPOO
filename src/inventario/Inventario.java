/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventario;

import java.util.ArrayList;
import java.util.Hashtable;
import productos.Audifonos;
import productos.Musica;
import productos.Video;
import zorzalMusic.*;

/**
 *
 * @author espar
 */
public class Inventario {

    public Inventario() {
    }
    
    public Hashtable inventarioMusicaMetodo(Hashtable inventarioTabla){//public static void main(String[] args) {
        ArrayList<String>nombreCanciones1=new ArrayList<String>();
        nombreCanciones1.add("Wanna Be Startin' Somethin'");
        nombreCanciones1.add("Baby be mine");
        nombreCanciones1.add("The Girl Is Mine (With Paul McCartney)");
        nombreCanciones1.add("Thriller");
        nombreCanciones1.add("Baet It");
        nombreCanciones1.add("Billie Jean");
        nombreCanciones1.add("Human Nature");
        nombreCanciones1.add("P.Y.T. (Pretty Young Thing)");
        nombreCanciones1.add("The Lady In My Life");
        Musica disco1 = new Musica(nombreCanciones1, "Michael Jackson", 9, 600, 10001, "Thriller", "MJJ Productions Inc");
        
        ArrayList<String>nombreCanciones2=new ArrayList<String>();
        nombreCanciones2.add("The Boy In The Bubble");
        nombreCanciones2.add("Grace Boy Ieland");
        nombreCanciones2.add("I Know What I Know");
        nombreCanciones2.add("Gumboots");
        nombreCanciones2.add("Diamonds on the Soles of Her Shoes");
        nombreCanciones2.add("You Can Call Me All");
        nombreCanciones2.add("Under African Skies");
        nombreCanciones2.add("Homeless");
        Musica disco2 = new Musica(nombreCanciones2, "Paul Simon", 8, 300, 10002, "Graceland", "Warner Bros");
        
        ArrayList<String>nombreCanciones3=new ArrayList<String>();
        nombreCanciones3.add("The Adults Are Talking");
        nombreCanciones3.add("Selfless");
        nombreCanciones3.add("Brooklyn Bridge To Chorus");
        nombreCanciones3.add("Bad Decisions");
        nombreCanciones3.add("Eternal Summer");
        nombreCanciones3.add("At The Door");
        nombreCanciones3.add("Why Are Sundays So Depressing");
        nombreCanciones3.add("Not The Same Anymore");
        nombreCanciones3.add("Ode To The Mets");
        Musica disco3 = new Musica(nombreCanciones3, "The Strokes", 9, 350, 10003, "The New Abnormal", "RCA Records");
        
        ArrayList<String>nombreCanciones4=new ArrayList<String>();
        nombreCanciones4.add("Somos Tontos No Pesados");
        nombreCanciones4.add("El Haz Sensor");
        nombreCanciones4.add("Sudapara");
        nombreCanciones4.add("Flores Secas");
        nombreCanciones4.add("Pajaros de Fuego");
        nombreCanciones4.add("La Primera Vez");
        nombreCanciones4.add("En Jamaica");
        nombreCanciones4.add("Un Amor Violento");
        nombreCanciones4.add("Amores Incompletos");
        nombreCanciones4.add("He Barrido el Sol");
        Musica disco4 = new Musica(nombreCanciones4, "Los Tres", 10, 600, 10004, "Los Tres", "Sony Music Entretainment");
        
        ArrayList<String>nombreCanciones5=new ArrayList<String>();
        nombreCanciones5.add("Frenetico Ritmo");
        nombreCanciones5.add("Me And My Man");
        nombreCanciones5.add("Duele El Caminar");
        nombreCanciones5.add("Boulevard");
        nombreCanciones5.add("En Este Momento");
        nombreCanciones5.add("Head In My Heart");
        nombreCanciones5.add("Sasha y Esteban");
        nombreCanciones5.add("On The Bill");
        nombreCanciones5.add("I Will Go");
        nombreCanciones5.add("No Dejes de Quererme");
        nombreCanciones5.add("Labios");
        nombreCanciones5.add("Even It Out");
        nombreCanciones5.add("Back To Basics");
        Musica disco5 = new Musica(nombreCanciones5, "Jenny And The Mexicats", 14, 489, 10005, "ome", "Mexicats Records");
        
        
        inventarioTabla.put(disco1.codigoBarra,disco1);
        inventarioTabla.put(disco2.codigoBarra,disco2);
        inventarioTabla.put(disco3.codigoBarra,disco3);
        inventarioTabla.put(disco4.codigoBarra,disco4);
        inventarioTabla.put(disco5.codigoBarra,disco5);
        
        /*for(int c: inventarioTabla.keySet()){
            System.out.println(c);
        }
        for(Musica valor: inventarioTabla.values()){
            System.out.println(valor);
        }*/
        /* Enumeraciones */ //Como no se puede obtener ambos campos a la vez con for-each
        int c;
        Musica valor;
        /*Enumeration<String>enumeracionHash=miTabla.keys();
        while(enumeracionHash.hasMoreElements()){
            clave=enumeracionHash.nextElement();
            valor=miTabla.get(clave);
            System.out.println("Clave "+clave+ " Valor "+ valor);
         }*/
        
        return inventarioTabla;
    }
    
    public Hashtable inventarioVideoMetodo(Hashtable inventarioTabla){
        Video cd1 = new Video(60," BrunoMars ",1 , 227, 20001, "Funk Engineering", "DVD");
        Video cd2 = new Video(60," Phil Collins ",1 , 399, 20002, "Live at Montreux 2004", "Blu-ray disc");
        Video cd3 = new Video(160," Varios ",23 , 467, 20003, "Hamilton", "Warner Music México");
        Video cd4 = new Video(60," BrunoMars ",2 , 951, 20004, "Help", "Capitol");
        Video cd5 = new Video(21," BrunoMars ",1 , 462, 20005, "Queen Rock Montreal & Live Aid", "Eagle Rock Ent");
        
        inventarioTabla.put(cd1.codigoBarra,cd1);
        inventarioTabla.put(cd2.codigoBarra,cd2);
        inventarioTabla.put(cd3.codigoBarra,cd3);
        inventarioTabla.put(cd4.codigoBarra,cd4);
        inventarioTabla.put(cd5.codigoBarra,cd5);
        
        return inventarioTabla;
    }
    
    public Hashtable inventarioAudifonosMetodo(Hashtable inventarioTabla){
        
        Audifonos audifonos1 = new Audifonos("Negro","In Ear",3200,30001,"SE215","Shure");
        Audifonos audifonos2 = new Audifonos("Blanco","Wireless",2200,30002,"Smokin Buds","Skullcandy");
        Audifonos audifonos3 = new Audifonos("Negro/Azul","Over Ear",1600,30003,"porta Pro","Koss");
        Audifonos audifonos4 = new Audifonos("Negro","Wireless",2500,30004,"HD 4 40","Sennheiser");
        Audifonos audifonos5 = new Audifonos("Blanco","Wireless",5080,30005,"Solo Pro","Beats");
        
        inventarioTabla.put(audifonos1.codigoBarra,audifonos1);
        inventarioTabla.put(audifonos2.codigoBarra,audifonos2);
        inventarioTabla.put(audifonos3.codigoBarra,audifonos3);
        inventarioTabla.put(audifonos4.codigoBarra,audifonos4);
        inventarioTabla.put(audifonos5.codigoBarra,audifonos5);
        
        return inventarioTabla;
    }
}
