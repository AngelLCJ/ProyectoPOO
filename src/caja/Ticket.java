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
 * @author Correa Juárez Ángel Leonardo
 * @author Cruz Martínez Raúl
 * @author Mendoza Bolaños Carlos Gabriel
 * @author Villanueva Corona Miguel Ángel
 * 
 * 
 * En esta clase lo que se trata de ralizar es una representacion de un ticket el cual al momento de ejecutarlo con ayuda de 
 * un main lo que se va a generar es un archivo con extencion .txt en la cual va imprimir lo que se genero en las lineas de codigo
 * lo cual contiene: nombre de la tienda, hora de expedicion, los productos con sus respectivos precios, el total acumulado,
 * el cambio con respecto al monto con el que se hayan pagado los productos, el nombre del empleado que atendio al cliente,
 * entre otras cosas, para poder realizar este codigo para generar los tiquets nos tuvimos que apoyar de la utilidad de los archivos 
 * ya que con este codigo podemos crear el archivo que lleva por nombre "TicketZM.txt" en el cual tambien se le agregara lo anterior
 * mencionado algunas implementaciones son simples impreciones en el ticket mientras que otros apartados tuvimos que realizar otras
 * clases con las cuales hacer lo restante,por ejemplo la imprecion del nombre del trabajador dentro del ticket.
 */
public class Ticket {
   // public static void main(String[] args) {
    
    public Ticket(){
    }

    public void ticketMetodo(Hashtable listaVenta, float importe, float total, String usuario) {
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
            salida.println("lo atendio: " + usuario);
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
