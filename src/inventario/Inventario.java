/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventario;

import java.util.ArrayList;
import java.util.Hashtable;
import productos.Musica;

/**
 *
 * @author espar
 */
public class Inventario {

    public Inventario() {
    }
    
    public void inventarioMusicaMetodo(){//public static void main(String[] args) {

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
        
        Hashtable<Integer,Musica>inventarioMusica=new Hashtable<Integer,Musica>();
        inventarioMusica.put(disco1.codigoBarra,disco1);
        inventarioMusica.put(disco2.codigoBarra,disco2);
        inventarioMusica.put(disco3.codigoBarra,disco3);
        inventarioMusica.put(disco4.codigoBarra,disco4);
        inventarioMusica.put(disco5.codigoBarra,disco5);
        
        for(int c: inventarioMusica.keySet()){
            System.out.println(c);
        }
        for(Musica valor: inventarioMusica.values()){
            System.out.println(valor);
        }
        /* Enumeraciones */ //Como no se puede obtener ambos campos a la vez con for-each
        int c;
        Musica valor;
        /*Enumeration<String>enumeracionHash=miTabla.keys();
        while(enumeracionHash.hasMoreElements()){
            clave=enumeracionHash.nextElement();
            valor=miTabla.get(clave);
            System.out.println("Clave "+clave+ " Valor "+ valor);
         }*/
    }
}
