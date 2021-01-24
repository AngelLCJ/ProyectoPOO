/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import java.util.ArrayList;
import java.util.Hashtable;
import productos.*;

/**
 *
 * @author Correa Juárez Ángel Leonardo
 * @author Cruz Martínez Raúl
 * @author Mendoza Bolaños Carlos Gabriel
 * @author Villanueva Corona Miguel Ángel
 * 
 * 
 * actualizar es una clase en la cual lo que se decea que el usuario en este caso el gerente ya que es el unico que tiene los permisos para acceder a estos
 * apartados del CRUD en este especificamente lo que se realiza es la actualizacion de algunos productos que se encuentran 
 * en el inventario ya sea si es por que se escribio mal algun apartado de algun documento o en el caso de que cambie algunos de los datos del
 * producto, en esta parte de todo el proyecto se le da a escojer al gerente que decea actualizar ya sea el un disco de video o de musica o en lo contrario
 * unos audifonos despues de preguntarle que decea actualizar le va a preguntar por cada uno de los atributos del producto acerca de que apartado decea modificar,
 * despues los cambios van a aparecer en una tabla (Realizado con tablas hash) la modificacion que se le hizo al producto
 */
public class Actualizar {

    public Actualizar() {
    }
    /**
     * 
     * @param inventarioTabla Se le pasa un Hashtable el cual contiene el 
     * inventario en el cual se le actualizará el o los  discos de música 
     * deseados.
     * @return retorna el invetario actualizado.
     */
    public Hashtable actualizarMusica(Hashtable inventarioTabla){
        int numDiscos,opcion2,codigoBarra;
        Musica discoX;
        Object objetoN;
        
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
                        String nuevoNombre;
                        System.out.println("Ingrese el nuevo nombre del album");
                        nuevoNombre=input.readString();
                        discoX = (Musica) inventarioTabla.get(codigoBarra);
                        discoX.setNombre(nuevoNombre);
                        break;
                    case 2:
                        String nuevoArtista;
                        System.out.println("Ingrese el nuevo nombre del artista");
                        nuevoArtista=input.readString();
                        discoX = (Musica) inventarioTabla.get(codigoBarra);
                        discoX.setArtista(nuevoArtista);
                        break;
                    case 3:
                        String nuevaDisquera;
                        System.out.println("Ingrese el nuevo nombre de la disquera");
                        nuevaDisquera=input.readString();
                        discoX = (Musica) inventarioTabla.get(codigoBarra);
                        discoX.setMarca(nuevaDisquera);
                        break;
                    case 4:
                        int nuevoPrecio;
                        System.out.println("Ingrese el nuevo precio");
                        nuevoPrecio=input.readInteger();
                        discoX = (Musica) inventarioTabla.get(codigoBarra);
                        discoX.setPrecio(nuevoPrecio);
                        break;
                    case 5:
                        int nuevoCodigoBarra;
                        System.out.println("Ingrese el nuevo codigo de barras");
                        nuevoCodigoBarra=input.readInteger();
                        discoX = (Musica) inventarioTabla.get(codigoBarra);
                        discoX.setCodigoBarra(nuevoCodigoBarra);
                        break;
                    case 6:
                        int nuevoNumCanciones;
                        System.out.println("Ingrese el nuevo numero de canciones");
                        nuevoNumCanciones=input.readInteger();
                        discoX = (Musica) inventarioTabla.get(codigoBarra);
                        discoX.setNumCanciones(nuevoNumCanciones);
                        break;
                    case 7:
                        ArrayList<String>cancionesNuevas=new ArrayList<String>();
                        int indiceCancion;
                        String nuevaCancion;
                        System.out.println("¿Cual cancion deseas modifcar?: ");
                        indiceCancion=input.readInteger()-1;
                        System.out.println("Ingrese el nuevo nombre ");
                        nuevaCancion=input.readString();
                        discoX=(Musica)inventarioTabla.get(codigoBarra);
                        cancionesNuevas=discoX.getNombreCanciones();
                        cancionesNuevas.set(indiceCancion, nuevaCancion);
                        discoX.setNombreCanciones(cancionesNuevas);
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
    /**
     * 
     * @param inventarioTabla Se le pasa un Hashtable el cual contiene el 
     * inventario en el cual se le actualizará el o los  discos de videos
     * deseados. 
     * @return retorna el inventario actualizado.
     */
    public Hashtable actualizarVideo(Hashtable inventarioTabla){
        int numDiscos,opcion2,codigoBarra;
        Video discoX;
        
        System.out.println("¿Cuantos discos deseas actualizar?");
        KeyboardInput input=new KeyboardInput();
        numDiscos = input.readInteger();
        for (int i = 0; i < numDiscos; i++) {
            System.out.println("Ingrese el codigo de barras del disco a actualizar");
            KeyboardInput input1=new KeyboardInput();
            codigoBarra=input.readInteger();
            if(inventarioTabla.containsKey(codigoBarra)==true){
                System.out.println("¿Cual caracteristica deseas actualizar de disco "+(i+1)+"?\n");
                System.out.println("1) Nombre del disco de video\n2) Nombre del artista\n3) Disquera\n4) Precio\n5) Codigo de barras\n6) Numero de canciones\n7) Duracion");
                KeyboardInput input2=new KeyboardInput();
                opcion2=input.readInteger();
                switch (opcion2) {
                    case 1:
                        String nuevoNombre;
                        System.out.println("Ingrese el nuevo nombre del disco de musica");
                        nuevoNombre=input.readString();
                        discoX = (Video) inventarioTabla.get(codigoBarra);
                        discoX.setNombre(nuevoNombre);
                        break;
                    case 2:
                        String nuevoArtista;
                        System.out.println("Ingrese el nuevo nombre del artista");
                        nuevoArtista=input.readString();
                        discoX = (Video) inventarioTabla.get(codigoBarra);
                        discoX.setArtista(nuevoArtista);
                        break;
                    case 3:
                        String nuevaDisquera;
                        System.out.println("Ingrese el nuevo nombre de la disquera");
                        nuevaDisquera=input.readString();
                        discoX = (Video) inventarioTabla.get(codigoBarra);
                        discoX.setMarca(nuevaDisquera);
                        break;
                    case 4:
                        float nuevoPrecio;
                        System.out.println("Ingrese el nuevo precio");
                        nuevoPrecio=input.readFloat();
                        discoX = (Video) inventarioTabla.get(codigoBarra);
                        discoX.setPrecio(nuevoPrecio);
                        break;
                    case 5:
                        int nuevoCodigoBarra;
                        System.out.println("Ingrese el nuevo codigo de barras");
                        nuevoCodigoBarra=input.readInteger();
                        discoX = (Video) inventarioTabla.get(codigoBarra);
                        discoX.setCodigoBarra(nuevoCodigoBarra);
                        break;
                    case 6:
                        int nuevoNumCanciones;
                        System.out.println("Ingrese el nuevo numero de canciones");
                        nuevoNumCanciones=input.readInteger();
                        discoX = (Video) inventarioTabla.get(codigoBarra);
                        discoX.setNumCanciones(nuevoNumCanciones);
                        break;
                    case 7:
                        int nuevaDuracion;
                        System.out.println("Ingrese la nueva duracion");
                        nuevaDuracion=input.readInteger();
                        discoX = (Video) inventarioTabla.get(codigoBarra);
                        discoX.setDuracion(nuevaDuracion);
                        break;
                    default:
                        System.out.println("Esa opcion no existe");
                }
            }else{
                System.out.println("El codigo de barras ingresado no existe");
            }
        }
        return inventarioTabla;
    }
    /**
     * 
     * @param inventarioTabla Se le pasa un Hashtable el cual contiene el 
     * inventario en el cual se le actualizará el o los  audifonos 
     * deseados.
     * @return retorna el inventario actualizado.
     */
    public Hashtable actualizarAudifonos(Hashtable inventarioTabla){
        int numDiscos,opcion2,codigoBarra;
        Audifonos discoX;
        Object objetoN;
        
        System.out.println("¿Cuantos audifonos deseas actualizar?");
        KeyboardInput input=new KeyboardInput();
        numDiscos = input.readInteger();
        for (int i = 0; i < numDiscos; i++) {
            System.out.println("Ingrese el codigo de barras de los audifonos a actualizar");
            KeyboardInput input1=new KeyboardInput();
            codigoBarra=input.readInteger();
            if(inventarioTabla.containsKey(codigoBarra)==true){
                System.out.println("¿Cual caracteristica deseas actualizar de los audifonos "+(i+1)+"?\n");
                System.out.println("1) Nombre \n2) Marca\n3) Precio\n4) Color\n5) Codigo de barras\n6) Tipo\n");
                KeyboardInput input2=new KeyboardInput();
                opcion2=input.readInteger();
                switch (opcion2){
                    case 1:
                        String nuevoNombre;
                        System.out.println("Ingrese el nuevo nombre de los audifonos");
                        nuevoNombre=input.readString();
                        discoX = (Audifonos) inventarioTabla.get(codigoBarra);
                        discoX.setNombre(nuevoNombre);
                        break;
                    case 2:
                        String nuevoMarca;
                        System.out.println("Ingrese el nuevo nombre de la marca");
                        nuevoMarca=input.readString();
                        discoX = (Audifonos) inventarioTabla.get(codigoBarra);
                        discoX.setMarca(nuevoMarca);
                        break;
                    case 3:
                        float nuevoPrecio;
                        System.out.println("Ingrese el nuevo precio");
                        nuevoPrecio=input.readFloat();
                        discoX = (Audifonos) inventarioTabla.get(codigoBarra);
                        discoX.setPrecio(nuevoPrecio);
                        break;
                    case 4:
                        String nuevoColor;
                        System.out.println("Ingrese el nuevo precio");
                        nuevoColor= input.readString();
                        discoX = (Audifonos) inventarioTabla.get(codigoBarra);
                        discoX.setColor(nuevoColor);
                        break;
                    case 5:
                        int nuevoCodigoBarra;
                        System.out.println("Ingrese el nuevo codigo de barras");
                        nuevoCodigoBarra=input.readInteger();
                        discoX = (Audifonos) inventarioTabla.get(codigoBarra);
                        discoX.setCodigoBarra(nuevoCodigoBarra);
                        break;
                    case 6:
                        String nuevoTipo;
                        System.out.println("Ingrese el nuevo numero de canciones");
                        nuevoTipo = input.readString();
                        discoX = (Audifonos) inventarioTabla.get(codigoBarra);
                        discoX.setTipo(nuevoTipo);
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
    
}
