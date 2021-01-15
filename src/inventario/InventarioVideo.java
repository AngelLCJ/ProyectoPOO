/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventario;

import java.util.ArrayList;
import java.util.Hashtable;
import productos.Video;

/**
 *
 * @author carlos
 */
public class InventarioVideo {
    public static void main(String[] args) {
    
        Video cd1 = new Video(60," BrunoMars ",1 , 227, 20001, "Funk Engineering", "DVD");
        Video cd2 = new Video(60," Phil Collins ",1 , 399, 20002, "Live at Montreux 2004", "Blu-ray disc");
        Video cd3 = new Video(160," Varios ",23 , 467, 20003, "Hamilton", "Warner Music México");
        Video cd4 = new Video(60," BrunoMars ",2 , 951, 20004, "Help", "Capitol");
        Video cd5 = new Video(21," BrunoMars ",1 , 462, 20005, "Queen Rock Montreal & Live Aid", "Eagle Rock Ent");
        
        Hashtable<Integer,Video>inventarioVideo=new Hashtable<Integer,Video>();
        inventarioVideo.put(cd1.codigoBarra,cd1);
        inventarioVideo.put(cd2.codigoBarra,cd2);
        inventarioVideo.put(cd3.codigoBarra,cd3);
        inventarioVideo.put(cd4.codigoBarra,cd4);
        inventarioVideo.put(cd5.codigoBarra,cd5);
     for(int claveVideo: inventarioVideo.keySet()){
            System.out.println(claveVideo);
        }
        
        for(Video valorAudifonos: inventarioVideo.values()){
            System.out.println(valorAudifonos);
        }
    }
      
      
        
    }

