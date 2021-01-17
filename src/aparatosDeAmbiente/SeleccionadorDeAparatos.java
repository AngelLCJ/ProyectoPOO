/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aparatosDeAmbiente;

import java.util.Hashtable;
import zorzalMusic.KeyboardInput;

/**
 *
 * @author espar
 */
public class SeleccionadorDeAparatos {

    public SeleccionadorDeAparatos() {
    }
    
    public void seleccionadorDeAparatosMetodo(Hashtable inventarioTablaMusica, Hashtable inventarioTablaVideo){
        int tipoReproductor;
        System.out.println("Seleccione el tipo de reproductor");
        System.out.println("1) Music Player\t 2) Video Player\t 3)Salir al menu principal");
        KeyboardInput input=new KeyboardInput();
        tipoReproductor=input.readInteger();
        aparatosDeAmbiente aparatoAmbienteX = new aparatosDeAmbiente();
        switch (tipoReproductor) {
            case 1:
                aparatoAmbienteX.musicPlayerMetodo(inventarioTablaMusica, inventarioTablaVideo);
                break;
            case 2:
                aparatoAmbienteX.videoPlayerMetodo(inventarioTablaMusica,inventarioTablaVideo);
                break;
            case 3:
                break;
            default:
                throw new AssertionError();
        }
    }
    
}
