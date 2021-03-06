/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleados;
import aparatosDeAmbiente.*;
import caja.*;
import inventario.Inventario;
import java.util.Hashtable;
import productos.*;
import zorzalMusic.KeyboardInput;

/**
 *
 * @author Correa Juárez Ángel Leonardo
 * @author Cruz Martínez Raúl
 * @author Mendoza Bolaños Carlos Gabriel
 * @author Villanueva Corona Miguel Ángel
 * 
 */
public class Acomodador {
    /**
     * En esta clase lo que se raliza es el acomo de los permisos con los cuales el acomodador tendra acceso al sistema, como
     * fue estipulado el acomodador solo podra tener permiso para poner canciones en los aparatos de ambiente es por esto que 
     * en esta clase es donde le damos el acceso a este menu.
     */
    public void Acomodador(){
       int opcion1 ;
        int opcion2;
        Inventario inventario = new Inventario();
        Hashtable<Integer,Musica>inventarioMusica=new Hashtable<Integer,Musica>();
        Hashtable<Integer,Video>inventarioVideo=new Hashtable<Integer,Video>();
        Hashtable<Integer,Audifonos>inventarioAudifonos=new Hashtable<Integer,Audifonos>();
        Hashtable<Integer,Producto> listaVenta = new Hashtable<Integer,Producto>();
        inventario.inventarioMusicaMetodo(inventarioMusica);
        inventario.inventarioVideoMetodo(inventarioVideo);
        inventario.inventarioAudifonosMetodo(inventarioAudifonos);
        aparatosDeAmbiente aparatos = new aparatosDeAmbiente();
        SeleccionadorDeAparatos seleccionador = new SeleccionadorDeAparatos();
        int opcionPrincipal;
        Caja caja = new Caja();
        KeyboardInput inputPrincipal = new KeyboardInput();
        do{
        System.out.println("Ingrese la opcion que desea realizar");
        System.out.println("1) Seleccionador de aparatos de ambiente   2)Salir del programa");
        opcionPrincipal = inputPrincipal.readInteger();
            switch (opcionPrincipal){
                case 1:
                    seleccionador.seleccionadorDeAparatosMetodo(inventarioMusica, inventarioVideo);
                    break;
                case 2:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Esa opcion no existe");
            }
        }while(opcionPrincipal<2);
    }
}
