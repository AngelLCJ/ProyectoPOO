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
    public static void inventario() {
        
    
     Hashtable<Integer,String>inventarioMusica=new Hashtable<Integer,String>();
        inventarioMusica.put(1234567890," ");
        inventarioMusica.put(1234567891," ");
        inventarioMusica.put(1234567892," ");
        inventarioMusica.put(1234567893," ");
        inventarioMusica.put(123567894," ");
        inventarioMusica.put(123567895," ");
        inventarioMusica.put(123567896," ");
        inventarioMusica.put(123567897," ");
        inventarioMusica.put(123567898," ");
        inventarioMusica.put(123567899," ");
        inventarioMusica.put(123567900," "); 
        
        
        for(String clave: miTabla.keySet()){
            System.out.println(clave);
        }
        for(Integer valor: miTabla.values()){
            System.out.println(valor);
        }
        /* Enumeraciones */ //Como no se puede obtener ambos campos a la vez con for-each
        int c;
        Integer valor;
        Enumeration<String>enumeracionHash=miTabla.keys();
        while(enumeracionHash.hasMoreElements()){
            clave=enumeracionHash.nextElement();
            valor=miTabla.get(clave);
            System.out.println("Clave "+clave+ " Valor "+ valor);
         }
    }
}
