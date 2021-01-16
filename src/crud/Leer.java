/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import java.util.Hashtable;
import productos.Musica;

/**
 *
 * @author carlos
 */
public class Leer {

    public Leer() {
    }
    
    public Hashtable LeerMusica(Hashtable inventarioTabla){
        for(Musica valor: inventarioTabla.values()){
            System.out.println(valor);
        }
    
    
    
    }
}