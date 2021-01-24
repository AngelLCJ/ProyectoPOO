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
 * @author Correa Juárez Ángel Leonardo
 * @author Cruz Martínez Raúl
 * @author Mendoza Bolaños Carlos Gabriel
 * @author Villanueva Corona Miguel Ángel
 * 
 * en este apartado lo que decea hacer es un menu en el cual su estructura esta hecha con un switch en el que 
 * al usuario va a escojer si decea como reproductor un music player o un video payer o en su defecto salir de esta parte del programa
 * despues de que el usuario escoja alguna de estas dos opciones (descartando la antes mencionada)se le va a mandar a un menu
 * diferido en el cual se le va a preguntar que decea reproducir en dicho aparato de ambiente, la cuestion del menu se va explicar mas a fondo 
 * en la clase de aparatos de ambiente en la cual vamos a aplicar una estructura con switchs para implementarlo.
 */
public class SeleccionadorDeAparatos {
    /**
     * Constructor vacío vacío para seleccionador de Aparatos de ambiente
     */
    public SeleccionadorDeAparatos() {
    }
    /**
     * Metodo para seleccionar aparatos de ambiente
     * @param inventarioTablaMusica, es el inventario de discos de musica generado hasta el momento
     * @param inventarioTablaVideo , inventario generado hasta el momento de discos de video
     */
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
