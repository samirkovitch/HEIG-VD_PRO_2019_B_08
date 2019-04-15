/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controllers.BDDpackage;


import java.awt.*;

/*
 *
 * @author spine
 */
public class Limite {

    // public String nom;
    public int id;
    public String date;
    public double valeur;
    public Utilisateur user;
    public Recurrence recurrence ;
    public SousCategorie sousCategorie;

    Limite() {

    }

    public Limite(String date, double valeur,Utilisateur user,Recurrence recurrence,SousCategorie sousCategorie ){
        this.date = date;
        this.valeur = valeur;
        this.user = user;
        this.recurrence = recurrence;
        this.sousCategorie = sousCategorie;
    }

}
