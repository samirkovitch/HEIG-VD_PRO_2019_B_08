
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
/*7.2*/import controllers.BDDpackage.Utilisateur

object utilisateur extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Utilisateur,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*9.2*/(user: Utilisateur):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*9.21*/("""

"""),_display_(/*11.2*/main("Profil")/*11.16*/ {_display_(Seq[Any](format.raw/*11.18*/("""
    """),format.raw/*12.5*/("""<h1>Welcome to your profil</h1>

    <h2>"""),_display_(/*14.10*/user/*14.14*/.prenom),format.raw/*14.21*/(""" """),_display_(/*14.23*/user/*14.27*/.nom),format.raw/*14.31*/("""</h2>

    <br>
    <p>Pseudo: """),_display_(/*17.17*/user/*17.21*/.pseudo),format.raw/*17.28*/(""" """),format.raw/*17.29*/("""<br>Email: """),_display_(/*17.41*/user/*17.45*/.email),format.raw/*17.51*/(""" """),format.raw/*17.52*/("""<br>Genre: """),_display_(/*17.64*/user/*17.68*/.genre),format.raw/*17.74*/(""" """),format.raw/*17.75*/("""</p>
    <p>Anniv: """),_display_(/*18.16*/user/*18.20*/.anniversaire),format.raw/*18.33*/(""" """),format.raw/*18.34*/("""<br>cree a: """),_display_(/*18.47*/user/*18.51*/.cree_a),format.raw/*18.58*/(""" """),format.raw/*18.59*/("""</p>
    <p>Statut: """),_display_(/*19.17*/user/*19.21*/.statut),format.raw/*19.28*/(""" """),format.raw/*19.29*/("""<br>Pays: """),_display_(/*19.40*/user/*19.44*/.pays),format.raw/*19.49*/(""" """),format.raw/*19.50*/("""</p>
    <br>
    <p><b>Paramètres:</b><br> rappel via email: """),_display_(/*21.50*/user/*21.54*/.options),format.raw/*21.62*/("""</p>

    <a href="http://localhost:9000" class="button">Go to home</a>
    <br>

""")))}),format.raw/*26.2*/("""
"""))
      }
    }
  }

  def render(user:Utilisateur): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((Utilisateur) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Apr 02 22:03:33 CEST 2019
                  SOURCE: D:/TIC/HEIG/S4/PRO/pro_play_java/app/views/utilisateur.scala.html
                  HASH: 0e8fcb7dc27dea89d5f3b76b819dec2f822f6d2c
                  MATRIX: 651->265|1008->311|1122->330|1153->335|1176->349|1216->351|1249->357|1320->401|1333->405|1361->412|1390->414|1403->418|1428->422|1490->457|1503->461|1531->468|1560->469|1599->481|1612->485|1639->491|1668->492|1707->504|1720->508|1747->514|1776->515|1824->536|1837->540|1871->553|1900->554|1940->567|1953->571|1981->578|2010->579|2059->601|2072->605|2100->612|2129->613|2167->624|2180->628|2206->633|2235->634|2327->699|2340->703|2369->711|2487->799
                  LINES: 24->7|29->9|34->9|36->11|36->11|36->11|37->12|39->14|39->14|39->14|39->14|39->14|39->14|42->17|42->17|42->17|42->17|42->17|42->17|42->17|42->17|42->17|42->17|42->17|42->17|43->18|43->18|43->18|43->18|43->18|43->18|43->18|43->18|44->19|44->19|44->19|44->19|44->19|44->19|44->19|44->19|46->21|46->21|46->21|51->26
                  -- GENERATED --
              */
          