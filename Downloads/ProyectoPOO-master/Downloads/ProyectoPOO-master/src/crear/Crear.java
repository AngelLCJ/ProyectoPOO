/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crear;

/**
 *
 * @author angel
 */
public class Crear {
    
    String nom, codi;

    public Crear(String nom, String codi) {
        
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCodi() {
        return codi;
    }

    public void setCodi(String codi) {
        this.codi = codi;
    }

    @Override
    public String toString() {
        return "Crear{" + "nom=" + nom + ", codi=" + codi + '}';
    }
    
       
}
