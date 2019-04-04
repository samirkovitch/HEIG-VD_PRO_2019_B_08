
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
  """),format.raw/*4.3*/("""<h1>Welcome """),_display_(/*4.16*/titre),format.raw/*4.21*/("""</h1>
    <p> bonjour les amis , </p>

  <a href="http://localhost:9000/test" class="button">Go to test</a>
  <br>
  <a href="http://localhost:9000/profil" class="button">Go to Profil</a>
  <br>
  <a href="http://localhost:9000/categorie" class="button">Go to Categorie</a>
  <br>
  <a href="http://localhost:9000/sousCategorie" class="button">Go to sous categorie</a>
  <br>

""")))}),format.raw/*16.2*/("""
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
                  DATE: Tue Apr 02 21:54:16 CEST 2019
                  SOURCE: D:/TIC/HEIG/S4/PRO/pro_play_java/app/views/index.scala.html
                  HASH: 7db69904107ac70b625d58df82fbe56510e9b214
                  MATRIX: 948->1|1058->16|1088->21|1115->40|1154->42|1184->46|1223->59|1248->64|1668->454
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|36->4|36->4|48->16
                  -- GENERATED --
              */
          