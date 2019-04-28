
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
/*6.2*/import controllers.BDDpackage.SousCategorie

object ListsousCategorie extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[SousCategorie],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*9.2*/(listSousCategories: List[SousCategorie] ):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*9.44*/("""

"""),format.raw/*11.1*/("""<ul>
"""),_display_(/*12.2*/for(Souscat <- listSousCategories) yield /*12.36*/ {_display_(Seq[Any](format.raw/*12.38*/("""
        """),format.raw/*13.9*/("""<li>"""),_display_(/*13.14*/Souscat/*13.21*/.nom),format.raw/*13.25*/("""</li>
""")))}),format.raw/*14.2*/("""
"""),format.raw/*15.1*/("""</ul>

"""))
      }
    }
  }

  def render(listSousCategories:List[SousCategorie]): play.twirl.api.HtmlFormat.Appendable = apply(listSousCategories)

  def f:((List[SousCategorie]) => play.twirl.api.HtmlFormat.Appendable) = (listSousCategories) => apply(listSousCategories)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 28 13:00:27 CEST 2019
                  SOURCE: P:/Users/Simon/Documents/PRO/HEIG-VD_PRO_2019_B_08/Source_projet/app/views/ListsousCategorie.scala.html
                  HASH: aeb1ae9907032a758ca6d1c65afb54a99abb92d1
                  MATRIX: 651->61|1024->111|1161->153|1192->157|1225->164|1275->198|1315->200|1352->210|1384->215|1400->222|1425->226|1463->234|1492->236
                  LINES: 24->6|29->9|34->9|36->11|37->12|37->12|37->12|38->13|38->13|38->13|38->13|39->14|40->15
                  -- GENERATED --
              */
          