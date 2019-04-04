
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
/*26.2*/import controllers.BDDpackage.SousCategorie
/*27.2*/import controllers.BDDpackage.Categorie

object sousCategorie extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[SousCategorie],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*29.2*/(SousCategories: List[SousCategorie]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*29.39*/("""

"""),_display_(/*31.2*/main("Sous Categorie")/*31.24*/ {_display_(Seq[Any](format.raw/*31.26*/("""
    """),format.raw/*32.5*/("""<h1>Welcome SousCategories</h1>
    <p> nom cat => 2eme paramètre</p>

    <br>
    <ul>
        """),_display_(/*37.10*/for(sousCat <- SousCategories) yield /*37.40*/ {_display_(Seq[Any](format.raw/*37.42*/("""
            """),format.raw/*38.13*/("""<li>"""),_display_(/*38.18*/sousCat/*38.25*/.nom),format.raw/*38.29*/(""" """),format.raw/*38.30*/("""</li>
        """)))}),format.raw/*39.10*/("""
    """),format.raw/*40.5*/("""</ul>
    <br>
    <a href="http://localhost:9000" class="button">Go to home</a>
    <br>

""")))}),format.raw/*45.2*/("""
"""))
      }
    }
  }

  def render(SousCategories:List[SousCategorie]): play.twirl.api.HtmlFormat.Appendable = apply(SousCategories)

  def f:((List[SousCategorie]) => play.twirl.api.HtmlFormat.Appendable) = (SousCategories) => apply(SousCategories)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Apr 02 22:14:23 CEST 2019
                  SOURCE: D:/TIC/HEIG/S4/PRO/pro_play_java/app/views/sousCategorie.scala.html
                  HASH: b4dc75da3750868de2a87db03eb230d681537465
                  MATRIX: 652->574|704->620|1070->664|1203->701|1234->706|1265->728|1305->730|1338->736|1468->839|1514->869|1554->871|1596->885|1628->890|1644->897|1669->901|1698->902|1745->918|1778->924|1905->1021
                  LINES: 24->26|25->27|30->29|35->29|37->31|37->31|37->31|38->32|43->37|43->37|43->37|44->38|44->38|44->38|44->38|44->38|45->39|46->40|51->45
                  -- GENERATED --
              */
          