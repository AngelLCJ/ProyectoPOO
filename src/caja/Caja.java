/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caja;

import aparatosDeAmbiente.SeleccionadorDeAparatos;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import productos.*;
import zorzalMusic.KeyboardInput;

/**
 *
 * @author Correa Juárez Ángel Leonardo
 * @author Cruz Martínez Raúl
 * @author Mendoza Bolaños Carlos Gabriel
 * @author Villanueva Corona Miguel Ángel
 * 
 * en esta clase lo que se decea realizar es la representacion de una caja registradora en la cual se van a registrar 
 * los prductos que se decen comprar, estos productos contienen un precio el cual se va a acomular con los demas productos 
 * que se vayan adquiriendo hasta generar un precio total de todos los productos a comprar, despues de determinar la cantidad 
 * de productos a comprar se le pedira al usuario que ingrese el monto con el cual se van a pagar los productos que decea,
 * despues de todo esto se genera un ticket con ayuda de archivos que en una parte de este contiene todos los apartados antes mencionados
 * de manera desglosada, empezando por los productos que se decean adquirir, seguido de el monto a pagar y el cambio total que se le regresa
 * al usuario.
 */
public class Caja {
    public Hashtable cajaMetodo(Hashtable inventarioMusica, Hashtable inventarioVideo, Hashtable inventarioAudifonos, Hashtable listaVenta, String usuario){
        int numOpcion = 0;
        int numProd, codigoBarra;
        while(numOpcion<3){
            System.out.println("¿Cual accion desea realizar?");
            System.out.println("1) Buscar/vender\t2) Salir al menu principal");
            KeyboardInput input = new KeyboardInput();
            numOpcion = input.readInteger();
            if(numOpcion == 2){
                break;
            }
            switch (numOpcion) {
                
                case 1:
                    
                    System.out.println("¿Cuantos elementos desea buscar/vender");
                    numProd = input.readInteger();
                    for (int i = 0; i < numProd; i++) {
                        System.out.println("Ingrese le codigo de barras del producto "+(i+1));
                        codigoBarra = input.readInteger();
                        if (inventarioMusica.containsKey(codigoBarra)==true) {
                            Producto productoX;
                            String nombreProductoX;
                            float precioX;
                            int venta;
                            productoX = (Producto)inventarioMusica.get(codigoBarra);
                            nombreProductoX = productoX.getNombre();
                            precioX = productoX.getPrecio();
                            System.out.println("El producto es: "+nombreProductoX+". El precio es: "+precioX);
                            System.out.println("¿Desea vender el producto");
                            System.out.println("1) Sí\n2) No");
                            venta = input.readInteger();
                            if(venta == 1){
                                listaVenta.put(productoX.codigoBarra,productoX);
                                System.out.println("El producto se añadio a la lista de venta");
                            }else{
                                
                            }
                        } else if(inventarioVideo.containsKey(codigoBarra)==true){
                            Producto productoX;
                            String nombreProductoX;
                            float precioX;
                            int venta;
                            productoX = (Producto)inventarioVideo.get(codigoBarra);
                            nombreProductoX = productoX.getNombre();
                            precioX = productoX.getPrecio();
                            System.out.println("El producto es: "+nombreProductoX+". El precio es: "+precioX);
                            System.out.println("¿Desea vender el producto");
                            System.out.println("1) Sí\n2) No");
                            venta = input.readInteger();
                            if(venta == 1){
                                listaVenta.put(productoX.codigoBarra,productoX);
                                System.out.println("El producto se añadio a la lista de venta");
                            }else{
                                
                            }
                        }else if(inventarioAudifonos.containsKey(codigoBarra)==true){
                            Producto productoX;
                            String nombreProductoX;
                            float precioX;
                            int venta;
                            productoX = (Producto)inventarioAudifonos.get(codigoBarra);
                            nombreProductoX = productoX.getNombre();
                            precioX = productoX.getPrecio();
                            System.out.println("El producto es: "+nombreProductoX+". El precio es: "+precioX);
                            System.out.println("¿Desea vender el producto");
                            System.out.println("1) Sí\n2) No");
                            venta = input.readInteger();
                            if(venta == 1){
                                listaVenta.put(productoX.codigoBarra,productoX);
                                System.out.println("El producto se añadio a la lista de venta");
                            }else{
                                
                            }
                        }else{
                            System.out.println("El producto no existe");
                            }
                        }
                        float importe;
                        //KeyboardInput input = new KeyboardInput();
                        float total = 0;
                        for (Iterator it = listaVenta.values().iterator(); it.hasNext();) {
                            Producto producto1 = (Producto) it.next();
                            total += producto1.getPrecio();
                        }
                        if(total>0){
                            System.out.println("El monto a pagar es: "+total);
                            System.out.println("Ingrese el importe recibido");
                            importe=input.readFloat();
                            if(importe>=total){
                                Ticket ticket = new Ticket();
                                ticket.ticketMetodo(listaVenta,importe,total,usuario);
                                listaVenta.clear();
                            }else{
                            System.out.println("La compra no se puedo realizar, porque el importe es insuficiente");
                            }
                        }else{
                            System.out.println("No hay nada en lista venta, no hay transaccion por realizar, gracias.");
                        }
                        break;

                    case 2:
                        break;
                    default:
                        throw new AssertionError();
                    }
                    
            }
            return listaVenta;
        }
    }

