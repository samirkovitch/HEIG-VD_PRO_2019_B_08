
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

object testParam extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /*
    Permet de voir comment passer des paramètres au HTML
*/
  def apply/*4.2*/(name: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.16*/("""

"""),_display_(/*6.2*/main("Test param main")/*6.25*/ {_display_(Seq[Any](format.raw/*6.27*/("""
    """),format.raw/*7.5*/("""<h1>"""),_display_(/*7.10*/name),format.raw/*7.14*/("""</h1>
    <p> Test paramètre </p>

    <a href="http://localhost:9000" class="button">Go to home</a>
    <br>

""")))}),format.raw/*13.2*/("""
"""))
      }
    }
  }

  def render(name:String): play.twirl.api.HtmlFormat.Appendable = apply(name)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (name) => apply(name)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 28 13:00:27 CEST 2019
                  SOURCE: P:/Users/Simon/Documents/PRO/HEIG-VD_PRO_2019_B_08/Source_projet/app/views/testParam.scala.html
                  HASH: 665a0ad23e926791d7b18cd8cc8d27b38eb1eb32
                  MATRIX: 1012->67|1121->81|1151->86|1182->109|1221->111|1253->117|1284->122|1308->126|1456->244
                  LINES: 30->4|35->4|37->6|37->6|37->6|38->7|38->7|38->7|44->13
                  -- GENERATED --
              */
          