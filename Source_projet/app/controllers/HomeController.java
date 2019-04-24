package controllers;

import controllers.BDDpackage.BDD;

import controllers.BDDpackage.Categorie;
import controllers.BDDpackage.SousCategorie;
import controllers.BDDpackage.Utilisateur;
import play.mvc.*;
import play.data.DynamicForm;
import play.data.Form;
import play.data.Form.*;
import play.data.FormFactory;
import com.google.inject.Inject;
import org.mindrot.jbcrypt.BCrypt;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 * This controller contains an action to handleHTTP requests
 *  to the application's home page.
 */
public class HomeController extends Controller {

    static public BDD DB = new BDD();
    Utilisateur user = new Utilisateur();

    private final FormFactory formFactory;

    @Inject
    public HomeController(FormFactory formFactory) {
        this.formFactory = formFactory;
    }

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index()  throws SQLException {

        //DB.display_Categories();

        //DB.display_Sous_categorie(2);

        //DB.UtilisateurByID(1);
        return ok(views.html.index.render("Compact Budget"));
    }

    public Result test() {

        return ok(views.html.test.render());
    }

    // Exemple pour passer un paramètre de HTML -> Java (via URL)
    // Fichier à toucher : HomeController + routes + views
    public Result testParam(String name) {

        return ok(views.html.testParam.render(name));
    }

    // Gestion du login
    public Result LoginSubmit() {

        DynamicForm form = formFactory.form().bindFromRequest();
        user = DB.UtilisateurByID( 1 );
        // dynamicForm.get("username")
        // dynamicForm.get("password")
        //boolean test = BCrypt.checkpw(form.get("password"), "$2a$10$ZCd.6iesPjZmQyzHmTub4uHbhLAPdXQzam5aebHE2b2hIHJBeI4TS");
        int valCo = DB.checkConnectionGetId(BCrypt.hashpw(form.get("password"), BCrypt.gensalt()),form.get("username"));
        if(valCo != 0)
        {
            user = DB.UtilisateurByID( valCo );
            return ok( views.html.utilisateur.render( user,0,"") );
        }
        else
        {
            return ok( views.html.Login.render());
        }
        //return ok(views.html.index.render(form.get("password")));
    }

    //Gestion nouvel utilisateur
    public Result RegisterSubmit(){
        return ok(views.html.index.render("test"));
    }

    public Result Register(){
        return ok(views.html.register.render());
    }

    // Exemple pour passer un paramètre de java -> HTML
    public Result Profil() {

        // Get user_id
        if(user.getId() == 0)
        {
            return ok( views.html.Login.render());
        }
        else
        {
            user = DB.UtilisateurByID( 1 );
            return ok( views.html.utilisateur.render( user,0,"") );
        }

    }
    // Exemple pour passer un paramètre de java -> HTML
    public Result Categorie() {

        ArrayList<Categorie> listCategorie = new ArrayList<Categorie>();
        listCategorie = DB.display_Categories();

        return ok( views.html.Categorie.render( listCategorie) );
    }
    // Permet d'ajouter une sous catégorie à la base de donnée
   public Result sousCategorie(String defaultSelect ) {
        // Envoie la liste de toute les catégories au HTML
       ArrayList<Categorie> listCategorie = new ArrayList<Categorie>();
       listCategorie = DB.display_Categories();

        return ok( views.html.sousCategorie.render( listCategorie, defaultSelect) );
    }

    // Permet d'ajouter une sous catégorie
    public Result addSousCategorie(String nom, int categorie_id) {

        int alerte = 2;
        String message = "Success insertion ";

        // Recherche la categorie selectionné
        Categorie categorieChoisi = DB.CategorieByID(categorie_id);
        // Cree la sous catégore souhaitée
        SousCategorie sousCategorie = new SousCategorie(nom, categorieChoisi );

        // Test la valeur de retour !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        // Ajout d'une notif 
        if (!DB.insert_Sous_categorie( sousCategorie)){
            alerte = 1;
            message = "Error: insertion failed !";
        }

        // Retour a la page souhaitée (profil)
        return ok( views.html.utilisateur.render( DB.UtilisateurByID( 1 ),alerte,message) );
    }

}
