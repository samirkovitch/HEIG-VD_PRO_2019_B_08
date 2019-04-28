
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
/*7.2*/import controllers.BDDpackage.Categorie
/*9.2*/import controllers.BDDpackage.BDD

object Categorie extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[Categorie],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*10.2*/(categories: List[Categorie]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*10.31*/("""

"""),_display_(/*12.2*/main("Categories")/*12.20*/ {_display_(Seq[Any](format.raw/*12.22*/("""
    """),format.raw/*13.5*/("""<br>
    <ul>
        <div class="panel-group">

        """),_display_(/*17.10*/for(cat <- categories) yield /*17.32*/ {_display_(Seq[Any](format.raw/*17.34*/("""

            """),format.raw/*19.13*/("""<div class="panel panel-default">
                <div class="panel-heading">
                    <div class="div-centered-panel">
                        <h4 class="panel-title">
                            <a data-toggle="collapse" href="#"""),_display_(/*23.63*/cat/*23.66*/.id),format.raw/*23.69*/(""""> """),_display_(/*23.73*/cat/*23.76*/.nom),format.raw/*23.80*/(""" """),format.raw/*23.81*/("""</a>
                        </h4>
                    </div>
                </div>

                <div id="""),_display_(/*28.26*/cat/*28.29*/.id),format.raw/*28.32*/(""" """),format.raw/*28.33*/("""class="panel-collapse collapse">
                    """),_display_(/*29.22*/for(sousCat <- (HomeController.DB).get_Sous_categorie(cat.id)) yield /*29.84*/{_display_(Seq[Any](format.raw/*29.85*/("""
                        """),format.raw/*30.25*/("""<div class="panel-body">
                            <div class="div-centered-panel">
                                <h4 class="panel-title">
                                    <a data-toggle="collapse" href="#"""),_display_(/*33.71*/("sousCat"+sousCat.id)),format.raw/*33.93*/(""""> """),_display_(/*33.97*/sousCat/*33.104*/.nom),format.raw/*33.108*/(""" """),format.raw/*33.109*/("""</a>
                                </h4>
                            </div>
                        </div>
                        <div id="""),_display_(/*37.34*/("sousCat"+sousCat.id)),format.raw/*37.56*/(""" """),format.raw/*37.57*/("""class="panel-collapse collapse">
                            <div style="margin-left: 20px;">
                                <div class="div-centered-panel"><a>- Janvier 2019</a></div>
                                <div class="div-centered-panel"><a>- Fevrier 2019</a></div>
                                <div class="div-centered-panel"><a>- Mars 2019</a></div>
                                <div class="div-centered-panel"><a>- Avril 2019</a></div>
                            </div>
                        </div>
                    """)))}),format.raw/*45.22*/("""

                    """),format.raw/*47.21*/("""<div class="panel panel-default">
                        <div class="panel-footer">
                            <div class="div-centered-panel">
                                <h4 class="panel-title">
                                    <a data-toggle="collapse" href="#"""),_display_(/*51.71*/("addcat"+cat.id)),format.raw/*51.88*/("""">Add categorie</a>
                                </h4>
                            </div>
                        </div>
                        <div id="""),_display_(/*55.34*/("addcat"+cat.id)),format.raw/*55.51*/(""" """),format.raw/*55.52*/("""class="panel-collapse collapse">
                            <div class="panel-body">
                                <div class="div-centered-panel">
                                    <form action="/AddSousCategorie">
                                        <input type="text" name="nom">
                                        <input type="submit" value="Add">
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
    """)))}),format.raw/*68.6*/("""
        """),format.raw/*69.9*/("""</div>
    </ul>
    <br>
    <br>
""")))}))
      }
    }
  }

  def render(categories:List[Categorie]): play.twirl.api.HtmlFormat.Appendable = apply(categories)

  def f:((List[Categorie]) => play.twirl.api.HtmlFormat.Appendable) = (categories) => apply(categories)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 28 13:00:27 CEST 2019
                  SOURCE: P:/Users/Simon/Documents/PRO/HEIG-VD_PRO_2019_B_08/Source_projet/app/views/Categorie.scala.html
                  HASH: b342295208e0624a7b762990ee8648e44af73660
                  MATRIX: 651->87|698->131|1050->167|1175->196|1206->201|1233->219|1273->221|1306->227|1395->289|1433->311|1473->313|1517->329|1790->575|1802->578|1826->581|1857->585|1869->588|1894->592|1923->593|2066->709|2078->712|2102->715|2131->716|2213->771|2291->833|2330->834|2384->860|2627->1076|2670->1098|2701->1102|2718->1109|2744->1113|2774->1114|2947->1260|2990->1282|3019->1283|3602->1835|3654->1859|3958->2136|3996->2153|4184->2314|4222->2331|4251->2332|4883->2934|4920->2944
                  LINES: 24->7|25->9|30->10|35->10|37->12|37->12|37->12|38->13|42->17|42->17|42->17|44->19|48->23|48->23|48->23|48->23|48->23|48->23|48->23|53->28|53->28|53->28|53->28|54->29|54->29|54->29|55->30|58->33|58->33|58->33|58->33|58->33|58->33|62->37|62->37|62->37|70->45|72->47|76->51|76->51|80->55|80->55|80->55|93->68|94->69
                  -- GENERATED --
              */
          