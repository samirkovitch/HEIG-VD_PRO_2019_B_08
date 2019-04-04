
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

  /**/
  def apply/*2.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.4*/("""

"""),_display_(/*4.2*/main("Test vide")/*4.19*/ {_display_(Seq[Any](format.raw/*4.21*/("""
    """),format.raw/*5.5*/("""<h1>Welcome test</h1>
    <p> bonjour les amis , </p>

    <a href="http://localhost:9000" class="button">Go to home</a>
    <br>

""")))}),format.raw/*11.2*/("""
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
                  DATE: Tue Apr 02 20:51:37 CEST 2019
                  SOURCE: D:/TIC/HEIG/S4/PRO/pro_play_java/app/views/test.scala.html
                  HASH: c234c29274cbbaee03500a92c3d3433c0e8c1025
                  MATRIX: 940->3|1036->5|1066->10|1091->27|1130->29|1162->35|1330->173
                  LINES: 28->2|33->2|35->4|35->4|35->4|36->5|42->11
                  -- GENERATED --
              */
          