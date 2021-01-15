/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zorzalMusic;

/**
 *
 * @author angel
 */
import empleados.*;
import aparatosDeAmbiente.*;
import crud.*;
import login.*;
import productos.*;
import crud.*;
public class ZorzalMusic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola proyecto");
        System.out.println("Hola ver2");
        System.out.println("Hola mundo");
        System.out.println("Hola xd");
        int n = 0;
        do {
            System.out.println("Contando hacia arriba "+n);
            System.out.println("Raul es puto");
            n++;
            } while(n<10);
        System.out.println("Hola xd 2");
        System.out.println("Hola carlitos ya se pudo");
        System.out.println("Hola mundo 2");
        
        System.out.println("si se pudo");
        System.out.println("afuefooooooooooooooooooooooooooooooooooooooooooooooooo");
        System.out.println("Hola quien eres");
        System.out.println("Yo soy groot");
        System.out.println("Pasamos todas las materias?");
        int opcion1 ;
        do{
        KeyboardInput input  =new KeyboardInput();
        System.out.println("******* Crud *********\n");
        System.out.println("1)Crear\t 2)Leer\t 3)Actualizar\t 4)Borrar\t\n");
        System.out.println("Que opción desea realizar\n");
        //Object menu=new Object();
        opcion1 = input.readInteger();
        switch(opcion1){
                case 1: 
                    Crear crearCrud=new Crear();
                    System.out.println("Que producto desea crear:\t\n");
                    System.out.println("1)Disco de musica\t 2)Disco de video\t 3)Audifonos\t\n");
                    crearCrud.CrearMusica();
                    
        }
        }while(opcion1>4);
    }
    
}
