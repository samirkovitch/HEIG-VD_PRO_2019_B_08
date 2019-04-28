
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

        <link rel="stylesheet" media="screen" href=""""),_display_(/*49.54*/routes/*49.60*/.Assets.versioned("stylesheets/style.css")),format.raw/*49.102*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*50.59*/routes/*50.65*/.Assets.versioned("images/favicon.png")),format.raw/*50.104*/("""">
    </head>

    <body>
        <script type = "text/javascript">
                /* Set the width of the side navigation to 250px and the left margin of the page content to 250px and add a black background color to body */
                function openNav() """),format.raw/*56.36*/("""{"""),format.raw/*56.37*/("""
                    """),format.raw/*57.21*/("""document.getElementById("mySidenav").style.width = "50%";
                    document.getElementById("mySidenav").style.boxShadow = "0 0 0 10000px rgba(0,0,0,.50)";
                """),format.raw/*59.17*/("""}"""),format.raw/*59.18*/("""

                """),format.raw/*61.17*/("""/* Set the width of the side navigation to 0 and the left margin of the page content to 0, and the background color of body to white */
                function closeNav() """),format.raw/*62.37*/("""{"""),format.raw/*62.38*/("""
                    """),format.raw/*63.21*/("""document.getElementById("mySidenav").style.width = "0";
                    document.getElementById("mySidenav").style.boxShadow = "0 0 0 10000px rgba(0,0,0,0)";
                """),format.raw/*65.17*/("""}"""),format.raw/*65.18*/("""
        """),format.raw/*66.9*/("""</script>


        <div class="position-fixed border" style="top:220px; right:5px; z-index:99999">
            <img src="http://www.rtm.fr/sites/all/libraries/ckfinder/userfiles/images/plus%20png(1).png" onclick="openNav()"
                style="cursor: pointer" class="rounded-circle" alt="Cinque Terre" width="40" height="40">

            <div id="mySidenav" class="sidenav">
                <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
                <div id="accordion">
                    <div class="card-main">
                        <div class="card-header" id="headingOne">
                            <h5 class="mb-0">
                                <button class="btn btn-link" data-toggle="collapse" data-target="#collapseOne" aria-expanded="true" aria-controls="collapseOne">
                                    Add income
                                </button>
                            </h5>
                        </div>

                        <div id="collapseOne" class="collapse show" aria-labelledby="headingOne" data-parent="#accordion">
                            <div class="card-body">
                                euh lol ?
                            </div>
                        </div>
                    </div>
                    <div class="card-main">
                        <div class="card-header" id="headingTwo">
                            <h5 class="mb-0">
                                <button class="btn btn-link collapsed" data-toggle="collapse" data-target="#collapseTwo" aria-expanded="false" aria-controls="collapseTwo">
                                    Add expense
                                </button>
                            </h5>
                        </div>
                        <div id="collapseTwo" class="collapse" aria-labelledby="headingTwo" data-parent="#accordion">
                            <div class="card-body">
                                bah lol 2 quoi
                            </div>
                        </div>
                    </div>

                </div>
            </div>
        </div>

        <div id="main" style="z-index:0">
        <!-- Navigation -->
        <nav class="navbar navbar-expand-md navbar-light bg-light sticky-top">
                <!-- container-fluid permet de prendre 100% de la page -->
            <div class ="container-fluid">
                    <!-- le href permet de rendre le truc clickable -->
                <a class="navbar-brand" href="http://localhost:9000">
                        <!-- Dans le truc clickable on met une image, l'image sera donc clickable -->
                    <img src=""""),_display_(/*118.32*/routes/*118.38*/.Assets.versioned("images/logo_projet.png")),format.raw/*118.81*/(""""></img>
                </a>

                    <!-- Censé être le bouton stylé sur les téléphones pour les menu -->
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarResponsive">
                    <ul class="navbar-nav ml-auto">
                        <li class="nav-item active">
                            <a class="nav-link" href="http://localhost:9000">Home</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="profil">Profil</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="categorie">Catégories</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="test">Statistiques</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="test">Historique</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>

        <div class="text-center">
            """),_display_(/*148.14*/content),format.raw/*148.21*/("""
        """),format.raw/*149.9*/("""</div>

            <!-- Footer -->
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
                            <ul class="list-unstyled">
                                <li>
                                    <a href="https://www.facebook.com/Compact-Budget-2397370796940679/?modal=admin_todo_tour" target="_blank" class="fa fa-facebook"></a>
                                    <a href="https://twitter.com/BudgetCompact" target="_blank" class="fa fa-twitter"></a>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
            </footer>
        </div>
            <!-- <script src=""""),_display_(/*195.32*/routes/*195.38*/.Assets.versioned("javascripts/main.js")),format.raw/*195.78*/("""" type="text/javascript"></script>-->
    </body>
</html>"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 28 13:00:27 CEST 2019
                  SOURCE: P:/Users/Simon/Documents/PRO/HEIG-VD_PRO_2019_B_08/Source_projet/app/views/main.scala.html
                  HASH: 678163d52acef5fa5a2dfcc7c8d0541935b98363
                  MATRIX: 1206->261|1331->291|1361->295|1630->589|1667->599|1702->607|1728->612|3697->2554|3712->2560|3776->2602|3865->2664|3880->2670|3941->2709|4237->2977|4266->2978|4316->3000|4528->3184|4557->3185|4605->3205|4806->3378|4835->3379|4885->3401|5093->3581|5122->3582|5159->3592|7928->6333|7944->6339|8009->6382|9430->7775|9459->7782|9497->7792|12355->10622|12371->10628|12433->10668
                  LINES: 33->7|38->7|40->9|48->17|49->18|49->18|49->18|80->49|80->49|80->49|81->50|81->50|81->50|87->56|87->56|88->57|90->59|90->59|92->61|93->62|93->62|94->63|96->65|96->65|97->66|149->118|149->118|149->118|179->148|179->148|180->149|226->195|226->195|226->195
                  -- GENERATED --
              */
          