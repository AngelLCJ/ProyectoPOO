/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventario;

import java.util.Hashtable;
import productos.Audifonos;

/**
 *
 * @author carlos
 */
public class InventarioAudifonos {
    public static void main(String[] args){/*Quitar el main es solo de prueba*///public void inventarioAudifonos(){
        Audifonos audifonos1 = new Audifonos("Negro","In Ear",3200,30001,"SE215","Shure");
        Audifonos audifonos2 = new Audifonos("Blanco","Wireless",2200,30002,"Smokin Buds","Skullcandy");
        Audifonos audifonos3 = new Audifonos("Negro/Azul","Over Ear",1600,30003,"porta Pro","Koss");
        Audifonos audifonos4 = new Audifonos("Negro","Wireless",2500,30004,"HD 4 40","Sennheiser");
        Audifonos audifonos5 = new Audifonos("Blanco","Wireless",5080,30005,"Solo Pro","Beats");
        
        Hashtable<Integer,Audifonos>inventarioAudifonos=new Hashtable<Integer,Audifonos>();
        inventarioAudifonos.put(audifonos1.codigoBarra,audifonos1);
        inventarioAudifonos.put(audifonos2.codigoBarra,audifonos2);
        inventarioAudifonos.put(audifonos3.codigoBarra,audifonos3);
        inventarioAudifonos.put(audifonos4.codigoBarra,audifonos4);
        inventarioAudifonos.put(audifonos5.codigoBarra,audifonos5);
        
        //int claveAudifonos;
        //Audifonos valorAudifonos;
        
        for(int claveAudifonos: inventarioAudifonos.keySet()){
            System.out.println(claveAudifonos);
        }
        
        for(Audifonos valorAudifonos: inventarioAudifonos.values()){
            System.out.println(valorAudifonos);
        }
    }
}