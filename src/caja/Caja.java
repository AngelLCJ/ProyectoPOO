/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caja;

import aparatosDeAmbiente.SeleccionadorDeAparatos;
import java.util.ArrayList;
import java.util.Hashtable;
import productos.*;
import zorzalMusic.KeyboardInput;

/**
 *
 * @author perry
 */
public class Caja {
    float precio,cambio,precioT,pago;

    public Caja() {
    }

    public Caja(float precio, float cambio, float precioT, float pago) {
        this.precio = precio;
        this.cambio = cambio;
        this.precioT = precioT;
        this.pago = pago;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getCambio() {
        return cambio;
    }

    public void setCambio(float cambio) {
        this.cambio = cambio;
    }

    public float getPrecioT() {
        return precioT;
    }

    public void setPrecioT(float precioT) {
        this.precioT = precioT;
    }

    public float getPago() {
        return pago;
    }

    public void setPago(float pago) {
        this.pago = pago;
    }

    public void Pagar(){
        precioT=precio++;
        if(precioT==pago){
            cambio=0;
        }else{
           cambio=pago-precioT;
        }
    }
    
    public Hashtable cajaMetodo(Hashtable inventarioMusica, Hashtable inventarioVideo, Hashtable inventarioAudifonos, Hashtable listaVenta){
        int numOpcion = 0;
        int numProd, codigoBarra;
        /*System.out.println("¿Cual accion desea realizar?");
        System.out.println("1) Buscar/vender\t2) Salir al menu principal");
        KeyboardInput input = new KeyboardInput();
        numOpcion = input.readInteger();*/
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

