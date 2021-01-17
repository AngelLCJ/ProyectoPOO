/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inicio;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class pruebamanejoarchivos {
    public static void main(String args[])
   {
       Scanner teclado=new Scanner (System.in);
       int salir=1;
       manejoArchivos objeto1 = new manejoArchivos(); //puedo mandar los datos directo desde un metodo
       System.out.println("preisone: 1=crear base de datos,2=asignar datos,3=mostrar datos,4=buscar registro,5=ver un usuario y sus saldo aparte, 6=salir");
       while(salir!=6)
       {
       try
       {
       System.out.println("===================================================================================================");
       System.out.println("Elija una opcion");
       salir=teclado.nextInt();
       if (salir==1){objeto1.existearchivo();} //crear el archivo si es que no esta creado
       if (salir==2){
        System.out.println("Ingresa un id");
        String id=teclado.next();
        System.out.println("Ingresa un saldo");
        double saldo=teclado.nextDouble();
        objeto1.asignardatos(id,saldo);
        }//dentro del parentesis le puedo enviar datos para que valla guardando
       if (salir==3){objeto1.mostrararchivos();}//mostrar lo que hay dentro de un archivo
       if (salir==4){
           System.out.println("Ingresa el id del usuario a buscar");
           String id=teclado.next();
           objeto1.buscarregistro(id);
       }
       if (salir==5){
           System.out.println("Ingresa el id del usuario a buscar su saldo");
           String id=teclado.next();
           objeto1.saldoderegistro(id);
       }
       } 
       catch(Exception ex)
       {
           System.out.println(ex.getMessage());
           teclado.nextLine();
       }
       //limpiar un archivo
   }
  }
}
