
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
* This template is called from the `index` template. This template
* handles the rendering of the page header and body tags. It takes
* two arguments, a `String` for the title of the page and an `Html`
* object to insert into the body of the page.
*/
  def apply/*7.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.32*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">

            <!-- C'est censé être utile pour le site sur téléphone -->
        <meta name="viewport" content="width=device-width, initial-scale=1">

        """),format.raw/*17.62*/("""
        """),format.raw/*18.9*/("""<title>"""),_display_(/*18.17*/title),format.raw/*18.22*/("""</title>


            <!-- bootstrap CSS file pour bootstrap 4 -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">


            <!-- Dernière version de jquery -->
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>

            <!-- Dernière version de popper js -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>

            <!-- Dernière version de bootstrap js -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>


            <!-- Permet d'utiliser des icônes des médias sociaux sans doute useless, mais on laisse pq on sait jamais -->
            <!--- <script src="https://use.fontawesome.com/releases/v5.0.8/js/all.js"></script> --->


            <!-- Add icon library -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

            <!-- Carousel includes (En vrai ça tue le carousel, laissez ça commenté -->
            <!-- <link href="//netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css"> -->
            <!-- <script src="//netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js"></script> -->
            <!-- <script src="//code.jquery.com/jquery-1.11.1.min.js"></script> -->

        <link rel="stylesheet" media="screen" href=""""),_display_(/*47.54*/routes/*47.60*/.Assets.versioned("stylesheets/style.css")),format.raw/*47.102*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*48.59*/routes/*48.65*/.Assets.versioned("images/favicon.png")),format.raw/*48.104*/("""">
    </head>
    <body>
            <!-- Navigation -->
            <!-- Le md dit en gros que ça sera visible que sur les petits écrans (voir les comm dans style.css) -->
        <nav class="navbar navbar-expand-md navbar-light bg-light sticky-top">
                <!-- container-fluid permet de prendre 100% de la page -->
            <div class ="container-fluid">
                    <!-- le href permet de rendre le truc clickable -->
                <a class="navbar-brand" href="#">
                        <!-- Dans le truc clickable on met une image, l'image sera donc clickable -->
                    <img src=""""),_display_(/*59.32*/routes/*59.38*/.Assets.versioned("images/logo_projet.png")),format.raw/*59.81*/(""""></img>
                </a>



                    <!-- Censé être le bouton stylé sur les téléphones pour les menu -->
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarResponsive">
                    <ul class="navbar-nav ml-auto">
                        <li class="nav-item active">
                            <a class="nav-link" href="#">Home</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">About</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Services</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Team</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Connect</a>
                        </li>
                    </ul>
                </div>

            </div>

        </nav>

        <div class="text-center">
            """),_display_(/*93.14*/content),format.raw/*93.21*/("""
            """),format.raw/*94.13*/("""<button type="button" class="btn btn-basic">Add expense</button>
            <button type="button" class="btn btn-basic">Add income</button>

        </div>

        """),format.raw/*100.31*/("""



            """),format.raw/*104.13*/("""<!-- Footer -->
        <footer class="page-footer font-small blue pt-4">

                <!-- Footer Links -->
            <div class="container-fluid text-center text-md-left">



                    <!-- Grid row -->
                <div class="row">

                        <!-- Grid column -->
                    <div class="col-md-6 mt-md-0 mt-3">

                        <div class="container">
                            <div id="carouselContent" class="carousel slide" data-ride="carousel">
                                <div class="carousel-inner" role="listbox">
                                    <div class="carousel-item active text-center p-4">
                                        <p>You can have a coach's help at any moment</p>
                                    </div>
                                    <div class="carousel-item text-center p-4">

                                        <p>Add a categorie at any moment to customize the manager</p>
                                    </div>
                                </div>
                                <a class="carousel-control-prev" href="#carouselContent" role="button" data-slide="prev">
                                    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                                    <span class="sr-only">Previous</span>
                                </a>
                                <a class="carousel-control-next" href="#carouselContent" role="button" data-slide="next">
                                    <span class="carousel-control-next-icon" aria-hidden="true"></span>
                                    <span class="sr-only">Next</span>
                                </a>
                            </div>
                        </div>

                    </div>

                        <!-- Grid column -->
                    <hr class="clearfix w-100 d-md-none pb-3">


                        <!-- Grid column -->
                    <div class="col-md-3 mb-md-0 mb-3">

                            <!-- Links -->

                        <ul class="list-unstyled">
                            <li>
                                <a href="https://www.facebook.com/Compact-Budget-2397370796940679/?modal=admin_todo_tour" class="fa fa-facebook"></a> <a href="https://twitter.com/BudgetCompact" class="fa fa-twitter"></a>
                            </li>
                        </ul>

                    </div>
                        <!-- Grid column -->


                        <!-- Grid row -->

                </div>
                    <!-- Footer Links -->



        </footer>
            <!-- Footer -->

            <!-- <script src=""""),_display_(/*171.32*/routes/*171.38*/.Assets.versioned("javascripts/main.js")),format.raw/*171.78*/("""" type="text/javascript"></script>-->
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Apr 02 20:51:37 CEST 2019
                  SOURCE: D:/TIC/HEIG/S4/PRO/pro_play_java/app/views/main.scala.html
                  HASH: 8fe3495567b75fc2b90be7a64417843da7f55072
                  MATRIX: 1206->261|1331->291|1361->295|1630->589|1667->599|1702->607|1728->612|3693->2550|3708->2556|3772->2598|3861->2660|3876->2666|3937->2705|4601->3342|4616->3348|4680->3391|6055->4739|6083->4746|6125->4760|6325->5021|6374->5041|9188->7827|9204->7833|9266->7873
                  LINES: 33->7|38->7|40->9|48->17|49->18|49->18|49->18|78->47|78->47|78->47|79->48|79->48|79->48|90->59|90->59|90->59|124->93|124->93|125->94|130->100|134->104|201->171|201->171|201->171
                  -- GENERATED --
              */
          