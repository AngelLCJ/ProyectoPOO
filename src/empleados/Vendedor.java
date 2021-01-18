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
 * @author perry
 */
public class Vendedor {
    
    public void Vendedor() {
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
                    caja.cajaMetodo(inventarioMusica, inventarioVideo, inventarioAudifonos, listaVenta);
                    for(Producto valorVideo: listaVenta.values()){
                        System.out.println("Nombre del Producto: "+ valorVideo.getNombre()+ " Codigo de Barra: " + valorVideo.getCodigoBarra() +" Precio: $"+ valorVideo.getPrecio());
                    }
                    Ticket ticket = new Ticket();
                    ticket.ticketMetodo(listaVenta);
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
