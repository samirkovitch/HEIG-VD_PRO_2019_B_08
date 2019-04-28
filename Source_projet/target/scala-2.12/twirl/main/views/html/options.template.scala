
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
/*1.2*/import controllers.BDDpackage.Utilisateur

object options extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[Boolean],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(options : List[Boolean]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.27*/("""
"""),_display_(/*4.2*/main("Options")/*4.17*/{_display_(Seq[Any](format.raw/*4.18*/("""

    """),format.raw/*6.5*/("""<h1>Options</h1>
    <form action="/modifoptions" method="get">
        <input type="checkbox" name="Option" value="2"> Rappel email ?
        <input type="hidden" name="Option" value="1" />
        <input type="submit" value="Submit">
    </form>



""")))}))
      }
    }
  }

  def render(options:List[Boolean]): play.twirl.api.HtmlFormat.Appendable = apply(options)

  def f:((List[Boolean]) => play.twirl.api.HtmlFormat.Appendable) = (options) => apply(options)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 28 13:00:27 CEST 2019
                  SOURCE: P:/Users/Simon/Documents/PRO/HEIG-VD_PRO_2019_B_08/Source_projet/app/views/options.scala.html
                  HASH: 9286956dc929bd6483298a06b070a78b9a586c55
                  MATRIX: 651->1|1006->47|1126->72|1154->75|1177->90|1215->91|1249->99
                  LINES: 24->1|29->3|34->3|35->4|35->4|35->4|37->6
                  -- GENERATED --
              */
          