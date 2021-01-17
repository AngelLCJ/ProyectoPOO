/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inicio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/**
 *
 * @author angel
 */
public class manejoArchivos {
     private Scanner entrada;
    private String id;
    private double cantidad;
    File ficherodeposito= new File ("deposito.txt");
    public manejoArchivos ()//objeto para enviar los datos a esta clase
    { 
    }

    public void existearchivo()//metodo para hacer la base de datos
    {
        try
        {
            if (ficherodeposito.exists())//saber si existe el archivo de texto
            {
                System.out.println("la base de datos ya existe");
            }
            else
            {
                ficherodeposito.createNewFile();
                System.out.println("base de datos creada");
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    public void asignardatos(String id2,double saldo2)
    {
        id = id2;               
        cantidad=saldo2;           
        try
        {
            BufferedWriter Fescribe=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(ficherodeposito,true)));//no se para que sirve
            Fescribe.write(id+"    "+cantidad+"    "); //guarda en la base de datos los archivos                            //utf8 es un tipo de formato
            Fescribe.write("\n");//para el salto de linea    
            System.out.println("El producto ha sido insertado en la base de datos");
            Fescribe.close();//cerrar el fichero y que los datos se queden escritos
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    public void mostrararchivos()
    {
        try
        {
            FileReader fr=new FileReader("deposito.txt");
            BufferedReader br=new BufferedReader(fr);
            String cadena;
            while((cadena=br.readLine())!=null) //cuando el la siguiente linea leida no halla nada significa que termino de ller los datos del archivo
            {
                System.out.println(""+cadena); 
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    public void buscarregistro(String id2)
    {
        String usuario=id2;
        try
        {
            BufferedReader leer=new BufferedReader(new FileReader ("deposito.txt"));
            String linea="";
            while((linea=leer.readLine())!=null)
            {
                if (linea.indexOf(usuario)!=-1)
                {
                    System.out.println("se encontro el registro: "+linea);
                }
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
    public void saldoderegistro(String id2)//para buscar un saldo 
    {
        String usuario=id2;
        try
        {
            //declare hasta arriba private scanner entrada
            entrada = new Scanner( new File( "deposito.txt") );//va a ller datos dentro de deposito
            BufferedReader leer=new BufferedReader(new FileReader ("deposito.txt"));
            String linea="";
            while((linea=leer.readLine())!=null)
            {
                if (linea.indexOf(usuario)!=-1)//al encontrar el dato buscado 
                {   //arturo  100 
                    System.out.print("se encontro el registro: "+usuario);
                    String id=entrada.next();//primero hay que obtener los datos antes para poder llegar al saldo
                    double saldo=entrada.nextDouble();
                    if (saldo<0)
                    {
                        System.out.println(" su saldo es deudor, "+saldo);
                    }
                    else
                    {
                        System.out.println(" su saldo es acreedor, "+saldo);
                    }
                }
            }

        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
   
}
