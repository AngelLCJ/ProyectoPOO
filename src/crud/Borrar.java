/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import java.util.Hashtable;

/**
 *
 * @author carlos
 */
public class Borrar {

    public Borrar() {
    }
    public Hashtable borrarElemento(Hashtable inventario){
        System.out.println("Cuantos elmentos deseas eliminar");
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

