/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleados;

import aparatosDeAmbiente.*;
import caja.*;
import crud.*;
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
 * En la clase vendedor se le da acceso a solo una parte del menu ya que este no puede acceder al CRUD,pero 
 * si a los demas apartados del programa cestos menus son los siguientes, los aparatos de ambiente y 
 * a la caja, esto se realizo con ayuda de las otras clases contenidas en diferentes paquetes
 */
public class Vendedor {
    /**
     * 
     * @param usuario 
     * resive un usuario en donde este va a servir para generar el ticket
     */
    public void Vendedor(String usuario) {
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
        System.out.println("1) Seleccionador de aparatos de ambiente   2) Caja   3) Salir del programa");
        opcionPrincipal = inputPrincipal.readInteger();
        //do{
            switch (opcionPrincipal){
                case 1:
                    seleccionador.seleccionadorDeAparatosMetodo(inventarioMusica, inventarioVideo);
                    break;
                case 2:
                    caja.cajaMetodo(inventarioMusica, inventarioVideo, inventarioAudifonos, listaVenta, usuario);
                    for(Producto valorVideo: listaVenta.values()){
                        System.out.println("Nombre del Producto: "+ valorVideo.getNombre()+ " Codigo de Barra: " + valorVideo.getCodigoBarra() +" Precio: $"+ valorVideo.getPrecio());
                    }
                    
                    break;
                case 3:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Esa opcion no existe");
            }
        }while(opcionPrincipal<3);
    }
}
