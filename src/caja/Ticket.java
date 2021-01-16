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

/**
 *
 * @author perry
 */
public class Ticket {
    public static void main(String[] args) {
        try{
            File archivo = new File("TicketZM.txt");
            boolean seCreo = archivo.createNewFile();
        }catch(IOException e){}
        
        //String texto = "";
        BufferedReader br;
        try{
            br = new BufferedReader(new InputStreamReader(System.in));
            //texto = br.readLine();
            //System.out.println(texto);
            Serializador fecha = new Serializador();
            FileWriter fw = new FileWriter("TicketZM.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter salida =new PrintWriter(fw);
            salida.println(fecha);
            salida.println("\t\t\t\t\t *****Zorzal Music***** \t\t\t\t\t");
            salida.println("\n Nº 1007, Perif. Blvd. Manuel Ávila Camacho, Hab Jardines de Santa Monica, 54055 Tlalnepantla de Baz, Méx.");
            salida.println("Quejas y sugerencias al numero: 800 000 0097");
            salida.println("========================================================================================================================");
            salida.println("lo atendio: ");
            salida.println("");
            salida.println("\t\tProductos\t\t\n");
            salida.println(" ");
            salida.println("Total: $");
            salida.println("Cambio: $");
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
