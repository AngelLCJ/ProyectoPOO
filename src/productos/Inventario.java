/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 *
 * @author carlos
 */
public class Inventario {
    public static void main(String[] args) {
        
    
    
        String[] canciones1 = {"hola","adios"};
        Musica disco1 = new Musica(canciones1, "Michael Jackson", 9, 1500, 123456789, "Thriller", "MJJ Productions Inc");
        
        Hashtable<Integer,Musica>inventarioMusica=new Hashtable<Integer,Musica>();
        inventarioMusica.put(disco1.codigoBarra,disco1);
        /*inventarioMusica.put(1234567891," ");
        inventarioMusica.put(1234567892," ");
        inventarioMusica.put(1234567893," ");
        inventarioMusica.put(123567894," ");
        inventarioMusica.put(123567895," ");
        inventarioMusica.put(123567896," ");
        inventarioMusica.put(123567897," ");
        inventarioMusica.put(123567898," ");
        inventarioMusica.put(123567899," ");
        inventarioMusica.put(123567900," ");*/ 
        
        
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
