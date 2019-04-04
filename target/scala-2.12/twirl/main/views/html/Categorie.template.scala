
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
/*10.2*/import controllers.BDDpackage.Categorie

object Categorie extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[Categorie],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*12.2*/(categories: List[Categorie]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*12.31*/("""

"""),_display_(/*14.2*/main("Categories")/*14.20*/ {_display_(Seq[Any](format.raw/*14.22*/("""
    """),format.raw/*15.5*/("""<h1>Welcome Categories</h1>
    <p> bonjour les amis , </p>

    <br>
    <ul>
    """),_display_(/*20.6*/for(cat <- categories) yield /*20.28*/ {_display_(Seq[Any](format.raw/*20.30*/("""
        """),format.raw/*21.9*/("""<li>id : """),_display_(/*21.19*/cat/*21.22*/.id),format.raw/*21.25*/(""" """),format.raw/*21.26*/("""nom : """),_display_(/*21.33*/cat/*21.36*/.nom),format.raw/*21.40*/("""</li>
    """)))}),format.raw/*22.6*/("""
    """),format.raw/*23.5*/("""</ul>
    <br>
    <a href="http://localhost:9000" class="button">Go to home</a>
    <br>

""")))}),format.raw/*28.2*/("""
"""))
      }
    }
  }

  def render(categories:List[Categorie]): play.twirl.api.HtmlFormat.Appendable = apply(categories)

  def f:((List[Categorie]) => play.twirl.api.HtmlFormat.Appendable) = (categories) => apply(categories)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Apr 02 21:09:53 CEST 2019
                  SOURCE: D:/TIC/HEIG/S4/PRO/pro_play_java/app/views/Categorie.scala.html
                  HASH: bc35fa852e16bb78cecb0f118e93286738ee40ac
                  MATRIX: 652->271|1010->315|1135->344|1166->349|1193->367|1233->369|1266->375|1381->464|1419->486|1459->488|1496->498|1533->508|1545->511|1569->514|1598->515|1632->522|1644->525|1669->529|1711->541|1744->547|1871->644
                  LINES: 24->10|29->12|34->12|36->14|36->14|36->14|37->15|42->20|42->20|42->20|43->21|43->21|43->21|43->21|43->21|43->21|43->21|43->21|44->22|45->23|50->28
                  -- GENERATED --
              */
          