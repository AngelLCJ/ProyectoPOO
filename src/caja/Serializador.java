/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caja;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 *
 * @author perry
 */
public class Serializador {
    public Serializador() {
        Date d = new Date();
        System.out.println(d);
        try{
            FileOutputStream ticket = new FileOutputStream("TicketZM.txt");
            ObjectOutputStream oos = new ObjectOutputStream(ticket);
            oos.writeObject(d);
            oos.close();
        }catch(IOException ioe){}
                    
    }
}
