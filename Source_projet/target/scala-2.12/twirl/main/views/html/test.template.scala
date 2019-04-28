
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

object test extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /*
 Ficher de tests et de commentaires divers
// IF----------------
@if(items.isEmpty) {
<h1>Nothing to display</h1>
} else {
<h1>@items.size items!</h1>
}

// Fenêtre notif ------------
<div class="alert">
<span class="closebtn" onclick="this.parentElement.style.display='none';">&times;</span>
This is an alert box.
</div>



*/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*19.2*/main("Test vide")/*19.19*/ {_display_(Seq[Any](format.raw/*19.21*/("""
    """),format.raw/*20.5*/("""<h1>Welcome test </h1>
    <p> bonjour les amis , </p>

    <a href="http://localhost:9000" class="button">Go to home</a>
    <br>

""")))}),format.raw/*26.2*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 28 13:00:27 CEST 2019
                  SOURCE: P:/Users/Simon/Documents/PRO/HEIG-VD_PRO_2019_B_08/Source_projet/app/views/test.scala.html
                  HASH: 6e40b89d25a2a9c101cfc4f035f04fd331f8170a
                  MATRIX: 1373->350|1399->367|1439->369|1472->375|1641->514
                  LINES: 50->19|50->19|50->19|51->20|57->26
                  -- GENERATED --
              */
          