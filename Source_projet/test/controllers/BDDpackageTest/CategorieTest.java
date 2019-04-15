/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.Assert.*;
import java.awt.*;
import controllers.BDDpackage.Categorie;


/*
 *
 * @author spine
 */
public class CategorieTest {

    @Test
    public void creeCategorieSansCouleur(){
        int id = 2;
        String nom = "nomCategorie";
        Categorie categorie = new Categorie(id,nom);
        nom = categorie.nom;
        id = categorie.id;
        Color couleur = categorie.couleur;

        org.junit.Assert.assertEquals("nomCategorie", nom);
        org.junit.Assert.assertEquals(2, id);
        org.junit.Assert.assertEquals(null, couleur);
    }

    @Test
    public void creeCategorieAvecCouleur(){
        int id = 2;
        String nom = "nomCategorie";
        Color couleur = new Color(25,76,90);
        Categorie categorie = new Categorie(id,nom,couleur);
        nom = categorie.nom;
        id = categorie.id;
        couleur = categorie.couleur;

        org.junit.Assert.assertEquals("nomCategorie", nom);
        org.junit.Assert.assertEquals(2, id);
        org.junit.Assert.assertEquals("java.awt.Color[r=25,g=76,b=90]", couleur.toString());
    }

}
