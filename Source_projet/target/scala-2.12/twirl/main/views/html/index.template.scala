
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(titre: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.17*/("""

"""),_display_(/*3.2*/main(titre: String)/*3.21*/ {_display_(Seq[Any](format.raw/*3.23*/("""
  """),format.raw/*4.3*/("""<h1>Welcome to """),_display_(/*4.19*/titre),format.raw/*4.24*/("""</h1>
    <p> bonjour les amis , </p>

  <a href="http://localhost:9000/test" class="button">Go to test</a>
  <br>
  <a href="http://localhost:9000/profil" class="button">Go to Profil</a>
  <br>
  <a href="http://localhost:9000/categorie" class="button">Go to Categorie</a>
  <br>
  <a href="http://localhost:9000/sousCategorie" class="button">Add sous categorie</a>
  <br>
  <br>

  <!-- Envoie le paramètre name a la page testParam -->
  <form action="/testParam">
    Entrez un mot :
    <input type="text" name="name">

    <input type="submit" value="Submit">
  </form>

  <br>

""")))}),format.raw/*27.2*/("""
"""))
      }
    }
  }

  def render(titre:String): play.twirl.api.HtmlFormat.Appendable = apply(titre)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (titre) => apply(titre)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 28 13:00:27 CEST 2019
                  SOURCE: P:/Users/Simon/Documents/PRO/HEIG-VD_PRO_2019_B_08/Source_projet/app/views/index.scala.html
                  HASH: 0420ad2706e8ad99f57b21d0646804f0106f2352
                  MATRIX: 948->1|1058->16|1088->21|1115->40|1154->42|1184->46|1226->62|1251->67|1889->675
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|36->4|36->4|59->27
                  -- GENERATED --
              */
          