/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aparatosDeAmbiente;

import crud.*;
import inventario.Inventario;
import java.util.ArrayList;
import java.util.Hashtable;
import productos.Musica;
import productos.Video;
import zorzalMusic.KeyboardInput;
/**
 *
 * @author angel
 */
public class aparatosDeAmbiente {

    public aparatosDeAmbiente() {
    }
    
    public void musicPlayerMetodo(Hashtable inventarioTabla){
        int opcionRep, codigoBarra;
        
        System.out.println("Ingrese el codigo de barras del disco");
        KeyboardInput input=new KeyboardInput();
        codigoBarra=input.readInteger();
        if (inventarioTabla.containsKey(codigoBarra)==true) {
            System.out.println("Seleccione la forma de reproduccion del disco");
            System.out.println("1) Disco completo\t2)Por cancion\t3)Salir al seleccionador de aparato de ambiente");
            opcionRep=input.readInteger();
            
            switch (opcionRep){
                case 1:
                    Musica discoX;
                    ArrayList<String>canciones=new ArrayList<String>();
                    discoX=(Musica)inventarioTabla.get(codigoBarra);
                    canciones=discoX.getNombreCanciones();
                    System.out.println("Reproduciendo...");
                    for(String elemento: canciones){
                        try{
                            System.out.println(elemento);
                            Thread.sleep(2*1000);
                        }catch(InterruptedException IE){}
                    }
                    System.out.println(canciones);
                    break;
                case 2:
                    System.out.println("Ingrese el numero de la cancion a reproducir");
                    
                    break;
                default:
                    throw new AssertionError();
            }
        } else {
            System.out.println("No existe ese disco");
        }
    }
    
    public void videoPlayer(Hashtable inventarioTablaMusica, Hashtable inventarioTablaVideo){
        
    }
    
}


 
