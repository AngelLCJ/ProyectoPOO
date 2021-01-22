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
 * @author Correa Juárez Ángel Leonardo
 * @author Cruz Martínez Raúl
 * @author Mendoza Bolaños Carlos Gabriel
 * @author Villanueva Corona Miguel Ángel
 * 
 * 
 * Leer es una clase en donde el gerente puede visualizar el contenido del inventario dentro de las tablas hash, para esto
 * primero se le pregunta que tipo de inventario quiere leer y hay 4 opciones excluyendo la salida, estas opciones de lectura
 * son el inventario general, el inventario de musica, el de videos y por ultimo el de audifonos, estos inventarios se realizaron 
 * con ayuda de las tablas hash
 */
public class Leer {

    public Leer() {
    }
    
    public Hashtable LeerMusica(Hashtable inventarioTabla){
        /*for(Musica valor: inventarioTabla.values()){
            System.out.println(valor);
        }*/
    return inventarioTabla;
    }
}