/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controllers.BDDpackage;


/*
 *
 * @author spine
 */
public class Transaction {

    public int id;
    public double valeur;
    public String date;
    public Modele_transaction modele_transaction;

    Transaction() {

    }
    // tout
    public Transaction(double valeur, String date, Modele_transaction modele_transaction){
        this.valeur = valeur;
        this.date = date;
        this.modele_transaction = modele_transaction;
    }

}
