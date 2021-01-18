/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caja;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Hashtable;
import productos.*;

/**
 *
 * @author perry
 */
public class Ticket {
   // public static void main(String[] args) {
    
    public Ticket(){
    }

    public void ticketMetodo(Hashtable listaVenta, float importe, float total) {
        String nombreProducto;
        int codigoBarra;
        float precio;
        Producto producto= new Producto();
        Hashtable <Integer,Producto>lista=listaVenta;
        try{
            File archivo = new File("TicketZM.txt");
            boolean seCreo = archivo.createNewFile();
        }catch(IOException e){}
        
        //String texto = "";
        BufferedReader br;
        try{
            br = new BufferedReader(new InputStreamReader(System.in));
            //texto = br.readLine();
            Date d = new Date();
            System.out.println(d);
            //System.out.println(texto);
            try{
                FileOutputStream ticket = new FileOutputStream("TicketZM.txt");
                ObjectOutputStream oos = new ObjectOutputStream(ticket);
                oos.writeObject(d);
                oos.close();
            }catch(IOException ioe){}
            FileWriter fw = new FileWriter("TicketZM.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter salida =new PrintWriter(fw);
            salida.println("\t\t\t\t\t"+d);
            salida.println("\t\t\t\t\t *****Zorzal Music***** \t\t\t\t\t");
            salida.println("\n Nº 1007, Perif. Blvd. Manuel Ávila Camacho, Hab Jardines de Santa Monica, 54055 Tlalnepantla de Baz, Méx.");
            salida.println("Quejas y sugerencias al numero: 800 000 0097");
            salida.println("========================================================================================================================");
            salida.println("lo atendio: ");
            salida.println("\t\tProductos\t\t\n");
            for(Producto producto1: lista.values()){
                salida.println(producto1.getNombre()+ " " + producto1.getCodigoBarra() +" \t $" + producto1.getPrecio());
            }
            //float total = 0;
            /*for(Producto producto1: lista.values()){
                total += producto1.getPrecio();
            }*/
            salida.println("Total: $"+total);
            float cambio;
            cambio=importe-total;
            salida.println("Cambio: $"+cambio);
            salida.println("Muchas gracias por su compra");
            salida.println("Codigo de Barras");
            salida.println("\t\t||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||| ");
            salida.println("\t\t\t\t\t \"la musica la llevas dentro ;)\" \n");
            salida.println("\t\t\t\t\t\t  Pagina web  \t\t\t");
            salida.println("\t\t\t\t\t\t www.ZorzlaMusic.com \t\t\t");
            salida.println("*No se aceptan devoluciones* ");
            salida.close();
        }catch(IOException ioe){}
        
        try{
            
            FileReader fw = new FileReader("TicketZM.txt");
            br = new BufferedReader(fw);
            System.out.println("Generando ticket");
            System.out.println("el contenido del Ticket es: ");
            String linea = br.readLine();
            while(linea != null){
                System.out.println(linea);
                linea = br.readLine();
            }
            br.close();
        }catch(IOException ioe){}
    }
}
