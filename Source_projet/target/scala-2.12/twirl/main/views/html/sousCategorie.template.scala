
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
/*6.2*/import controllers.BDDpackage.Categorie

object sousCategorie extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[Categorie],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*9.2*/(listCategories: List[Categorie], default: String ):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*9.53*/("""

"""),_display_(/*11.2*/main("Sous Categorie")/*11.24*/ {_display_(Seq[Any](format.raw/*11.26*/("""
    """),format.raw/*12.5*/("""<h1>Add a SousCategories peut-etre</h1>

    <form action="/AddSousCategorie">
        Entrez un nom de sous Catégorie :
        <input type="text" name="nom">
            <br>
            Choisir la catégorie principale :
        <input list="categorie" type="text" name="categorie_id" value=""""),_display_(/*19.73*/default),format.raw/*19.80*/("""">

            <datalist id="categorie">
                """),_display_(/*22.18*/for(categorie <- listCategories) yield /*22.50*/ {_display_(Seq[Any](format.raw/*22.52*/("""
                    """),format.raw/*23.21*/("""<option value="""),_display_(/*23.36*/categorie/*23.45*/.id),format.raw/*23.48*/(""">"""),_display_(/*23.50*/categorie/*23.59*/.nom),format.raw/*23.63*/("""</option>
                """)))}),format.raw/*24.18*/("""
            """),format.raw/*25.13*/("""</datalist>
            <br>

        <input type="submit" value="Ajouter">
    </form>

    <br>
    <a href="http://localhost:9000" class="button">Go to home</a>
    <br>

""")))}),format.raw/*35.2*/("""
"""))
      }
    }
  }

  def render(listCategories:List[Categorie],default:String): play.twirl.api.HtmlFormat.Appendable = apply(listCategories,default)

  def f:((List[Categorie],String) => play.twirl.api.HtmlFormat.Appendable) = (listCategories,default) => apply(listCategories,default)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 28 13:00:27 CEST 2019
                  SOURCE: P:/Users/Simon/Documents/PRO/HEIG-VD_PRO_2019_B_08/Source_projet/app/views/sousCategorie.scala.html
                  HASH: dd7351e3dcaa4150883ff11ced3bc7a960cbbfb5
                  MATRIX: 651->65|1019->111|1165->162|1196->167|1227->189|1267->191|1300->197|1629->499|1657->506|1746->568|1794->600|1834->602|1884->624|1926->639|1944->648|1968->651|1997->653|2015->662|2040->666|2099->694|2141->708|2356->893
                  LINES: 24->6|29->9|34->9|36->11|36->11|36->11|37->12|44->19|44->19|47->22|47->22|47->22|48->23|48->23|48->23|48->23|48->23|48->23|48->23|49->24|50->25|60->35
                  -- GENERATED --
              */
          