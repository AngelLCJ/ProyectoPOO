/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caja;

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
}
