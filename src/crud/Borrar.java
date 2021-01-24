/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import java.util.Hashtable;

/**
 *
 * @author Correa Juárez Ángel Leonardo
 * @author Cruz Martínez Raúl
 * @author Mendoza Bolaños Carlos Gabriel
 * @author Villanueva Corona Miguel Ángel
 * 
 * Borrar es una clase del apartado de crud en la cual solo tiene acceso el gerente de la tienda de musica, entes apartado del 
 * CRUD lo que se decea realizar como dice su nombre borrar algun producto del inventario de la tienda esto es por si algun producto no se encuentra
 * en existencia no siga estando en las tablas del inventario. Para empezar el programa le solicita al gerente que ingrese que producto es el que
 * decea borrar, ya sea que quiera alguno de los dos tipos de discos que cuenta el inventario o borrar unos audifonos, despues de seleccionar alguno
 * de estos productos a borrar se le pide la cantidad de productos a borrar, con esta informacion se le soliita al gerente que ingrese
 * el codigo de barras del producto a eliminar de la tabla para que ya por ultimo muestre un listado con los productos que quedan sin eliminar
 */
public class Borrar {

    public Borrar() {
    }
    public Hashtable borrarElemento(Hashtable inventario){
        System.out.println("¿Cuantos elmentos deseas eliminar?");
        KeyboardInput input= new KeyboardInput();
        int elementos=input.readInteger();
        for (int i = 0; i <elementos; i++) {
            System.out.println("Ingrese el codigo de barra del producto " + (i+1));
           // KeyboardInput input= new KeyboardInput();
            int codigoBarra= input.readInteger();
            //inventario.containsKey(codigoBarra);
            if(inventario.containsKey(codigoBarra)== true){
                System.out.println("El codigo a eliminar es: "+ codigoBarra);
                inventario.remove(codigoBarra);
                System.out.println("El elmento sea eliminado correctamente");
                }
            else{
                System.out.println("El codigo ingresado no existe");
            }
        }
        return inventario;
        }
    } 

