/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import java.util.Hashtable;
import productos.*;

/**
 *
 * @author espar
 */
public class Actualizar {

    public Actualizar() {
    }
    
    public Hashtable actualizarMusica(Hashtable inventarioTabla){
        int numDiscos,opcion2,codigoBarra;
        Musica discoX;
        
        System.out.println("¿Cuantos discos deseas actualizar?");
        KeyboardInput input=new KeyboardInput();
        numDiscos = input.readInteger();
        for (int i = 0; i < numDiscos; i++) {
            System.out.println("Ingrese el codigo de barras del disco a actualizar");
            KeyboardInput input1=new KeyboardInput();
            codigoBarra=input.readInteger();
            if(inventarioTabla.containsKey(codigoBarra)==true){
                System.out.println("¿Cual caracteristica deseas actualizar de disco "+(i+1)+"?\n");
                System.out.println("1) Nombre del album\n2) Nombre del artista\n3) Disquera\n4) Precio\n5) Codigo de barras\n6) Numero de canciones\n7) Nombre de las canciones");
                KeyboardInput input2=new KeyboardInput();
                opcion2=input.readInteger();
                switch (opcion2){
                    case 1:
                        
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    case 7:
                        break;
                    default:
                        System.out.println("Esa opcion no existe");
                }
            }else{
                System.out.println("El codigo de barras ingreasdo no existe");
            }
            
        }
        return inventarioTabla;
    }
    
    public Hashtable actualizarVideo(Hashtable inventarioTabla){
        
        return inventarioTabla;
    }
    
    public Hashtable actualizarAudifonos(Hashtable inventarioTabla){
        
        return inventarioTabla;
    }
    
}
