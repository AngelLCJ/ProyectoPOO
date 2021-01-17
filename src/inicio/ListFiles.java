/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inicio;

import java.io.File;

/**
 *
 * @author angel
 */
public class ListFiles {

    public static void main(String[] args)     {

        // Aquí la carpeta donde queremos buscar
        String path = "C:\\Users\\angel\\Documents\\NetBeansProjects\\ProyectoPOO\\DatosTXT";

        String files;
        File folder = new File(path);
        File[] listOfFiles = folder.listFiles();

        for (int i = 0; i < listOfFiles.length; i++){

            if (listOfFiles[i].isFile()){
                files = listOfFiles[i].getName();
                if(){
                    
                }
            }
        }
    }
}
    