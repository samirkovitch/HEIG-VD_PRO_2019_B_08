
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
/*4.2*/import controllers.BDDpackage.Utilisateur

object utilisateur extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Utilisateur,Int,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(user: Utilisateur, Alerte: Int = 0, messageAlerte: String = ""):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*6.66*/("""

"""),_display_(/*8.2*/main("Profil")/*8.16*/ {_display_(Seq[Any](format.raw/*8.18*/("""
    """),format.raw/*9.47*/("""
    """),_display_(/*10.6*/if(Alerte == 1)/*10.21*/ {_display_(Seq[Any](format.raw/*10.23*/("""
        """),format.raw/*11.9*/("""<div class="badAlert">
            <span class="closebtn" onclick="this.parentElement.style.display='none';">&times;</span>
            """),_display_(/*13.14*/messageAlerte),format.raw/*13.27*/("""
        """),format.raw/*14.9*/("""</div>
    """)))}/*15.7*/else if(Alerte == 2)/*15.28*/{_display_(Seq[Any](format.raw/*15.29*/("""
        """),format.raw/*16.9*/("""<div class="goodAlert">
            <span class="closebtn" onclick="this.parentElement.style.display='none';">&times;</span>
            """),_display_(/*18.14*/messageAlerte),format.raw/*18.27*/("""
        """),format.raw/*19.9*/("""</div>
    """)))}),format.raw/*20.6*/("""

    """),format.raw/*22.5*/("""<div class="userPad">
        <div class="row justify-content-center">
            <div class="col-lg-5 col-sm-12">
                <div class="card hovercard">
                    <div class="cardheader">
                    </div>
                    <div class="avatar">
                        <img alt="" src="http://lorempixel.com/100/100/people/9/">
                    </div>
                    <div class="info">
                        <div class="title">
                            """),_display_(/*33.30*/user/*33.34*/.prenom),format.raw/*33.41*/(""" """),_display_(/*33.43*/user/*33.47*/.nom),format.raw/*33.51*/("""
                        """),format.raw/*34.25*/("""</div>
                        <div class="desc">"""),_display_(/*35.44*/user/*35.48*/.pays),format.raw/*35.53*/("""</div>
                        <div class="desc">"""),_display_(/*36.44*/user/*36.48*/.genre),format.raw/*36.54*/("""</div>
                        <hr class="style1">
                        <div class="div-centered-panel">
                            <h6>Informations </h6>
                            <div class="desc">Pseudo : """),_display_(/*40.57*/user/*40.61*/.pseudo),format.raw/*40.68*/("""</div>
                            <div class="desc">E-mail : """),_display_(/*41.57*/user/*41.61*/.email),format.raw/*41.67*/("""</div>
                            <div class="desc">Birthday : """),_display_(/*42.59*/user/*42.63*/.anniversaire),format.raw/*42.76*/("""</div>
                            <div class="desc">Status : """),_display_(/*43.57*/user/*43.61*/.statut),format.raw/*43.68*/("""</div>
                            <div class="desc">Inscription date : """),_display_(/*44.67*/user/*44.71*/.cree_a),format.raw/*44.78*/("""</div>
                            <div class="desc">
                                <button type="button" class="btn btn-info btn-sm" data-toggle="modal" data-target="#modificationProfile">
                                    Modify
                                </button>
                                    <!-- Modal -->
                                <div class="modal fade" id="modificationProfile" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
                                aria-hidden="true">
                                    <div class="modal-dialog" role="document">
                                        <div class="modal-content">
                                            <div class="modal-header">
                                                <h5 class="modal-title" id="exampleModalLabel">Informations</h5>
                                                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                                    <span aria-hidden="true">&times;</span>
                                                </button>
                                            </div>
                                            <form action="/modifprofile" method="get">
                                                <div class="modal-body">

                                                    <div class="row justify-content-center">
                                                        <div class="col-md-6">
                                                            <div class="card">
                                                                <article class="card-body">
                                                                    <form>
                                                                        <div class="form-group">
                                                                            <label>Username</label>
                                                                            <input type="text" name="username" class="form-control" placeholder=""""),_display_(/*70.147*/user/*70.151*/.pseudo),format.raw/*70.158*/("""">
                                                                        </div> <!-- form-group end.// -->

                                                                        <div class="form-row">
                                                                            <div class="col form-group">
                                                                                <label>First name </label>
                                                                                <input type="text" name="name" class="form-control" placeholder=""""),_display_(/*76.147*/user/*76.151*/.prenom),format.raw/*76.158*/("""">
                                                                            </div> <!-- form-group end.// -->
                                                                            <div class="col form-group">
                                                                                <label>Last name</label>
                                                                                <input type="text" name="surname" class="form-control" placeholder=""""),_display_(/*80.150*/user/*80.154*/.nom),format.raw/*80.158*/("""">
                                                                            </div> <!-- form-group end.// -->
                                                                        </div> <!-- form-row end.// -->

                                                                        <div class="form-group">
                                                                            <label>Birth date</label>
                                                                            <input type="date" name="anniversaire" class="form-control" placeholder=""""),_display_(/*86.151*/user/*86.155*/.anniversaire),format.raw/*86.168*/("""">
                                                                        </div> <!-- form-group end.// -->

                                                                        <div class="form-group">
                                                                            <label>Email address</label>
                                                                            <input type="email" class="form-control" name="email" placeholder=""""),_display_(/*91.145*/user/*91.149*/.email),format.raw/*91.155*/("""">
                                                                            <small class="form-text text-muted">We'll never share your email with anyone else.</small>
                                                                        </div> <!-- form-group end.// -->
                                                                        <div class="form-group">
                                                                            <label class="form-check form-check-inline">
                                                                                <input class="form-check-input" checked type="radio" name="genre" value="1">
                                                                                <span class="form-check-label"> Male </span>
                                                                            </label>
                                                                            <label class="form-check form-check-inline">
                                                                                <input class="form-check-input" type="radio" name="genre" value="2">
                                                                                <span class="form-check-label"> Female</span>
                                                                            </label>
                                                                        </div> <!-- form-group end.// -->
                                                                        <div class="form-row">
                                                                            <div class="form-group col-md-6">
                                                                                <label>Status</label>
                                                                                <select  name="statut" class="form-control">
                                                                                    <option value = "0" selected>"""),_display_(/*108.115*/user/*108.119*/.statut),format.raw/*108.126*/("""</option>

                                                                                </select>
                                                                            </div> <!-- form-group end.// -->
                                                                            <div class="form-group col-md-6">
                                                                                <label>Country</label>
                                                                                <select name="pays" class="form-control">
                                                                                    <option value = "0" selected>"""),_display_(/*115.115*/user/*115.119*/.pays),format.raw/*115.124*/("""</option>

                                                                                </select>
                                                                            </div> <!-- form-group end.// -->
                                                                        </div> <!-- form-row.// -->
                                                                        <div class="form-group">
                                                                            <label>Change password</label>
                                                                            <input class="form-control" type="password" name="password">
                                                                        </div> <!-- form-group end.// -->
                                                                    </form>
                                                                </article> <!-- card-body end .// -->
                                                            </div> <!-- card.// -->
                                                        </div> <!-- col.//-->
                                                    </div> <!-- row.//-->
                                                </div>
                                                <div class="modal-footer">
                                                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                                    <button type="submit" value="submit" class="btn btn-primary">Save changes</button>
                                                </div>
                                            </form>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <hr class="style1">
                        <div class="div-centered-panel">
                            <h6>Settings</h6>
                            <div class="desc">Email notifications : """),_display_(/*143.70*/user/*143.74*/.options),format.raw/*143.82*/("""</div>
                            <div class="desc">
                                <button type="button" class="btn btn-info btn-sm" data-toggle="modal" data-target="#modificationOptions">
                                    Modify
                                </button>

                                    <!-- Modal -->
                                <div class="modal fade" id="modificationOptions" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
                                aria-hidden="true">
                                    <div class="modal-dialog" role="document">
                                        <div class="modal-content">
                                            <div class="modal-header">
                                                <h5 class="modal-title" id="exampleModalLabel">Options</h5>
                                                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                                    <span aria-hidden="true">&times;</span>
                                                </button>
                                            </div>
                                            <form action="/modifoptions" method="get">
                                                <div class="modal-body">
                                                    <input type="checkbox" name="Option" value="2"> Rappel email ?
                                                    <input type="hidden" name="Option" value="1" />
                                                </div>
                                                <div class="modal-footer">
                                                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                                    <button type="submit" value="submit" class="btn btn-primary">Save changes</button>
                                                </div>
                                            </form>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="desc"><a href="http://localhost:9000/deco" class="button">Disconnect</a></div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
""")))}),format.raw/*181.2*/("""
"""))
      }
    }
  }

  def render(user:Utilisateur,Alerte:Int,messageAlerte:String): play.twirl.api.HtmlFormat.Appendable = apply(user,Alerte,messageAlerte)

  def f:((Utilisateur,Int,String) => play.twirl.api.HtmlFormat.Appendable) = (user,Alerte,messageAlerte) => apply(user,Alerte,messageAlerte)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 28 13:00:27 CEST 2019
                  SOURCE: P:/Users/Simon/Documents/PRO/HEIG-VD_PRO_2019_B_08/Source_projet/app/views/utilisateur.scala.html
                  HASH: 1cdaf1db099d8d25c0fd6a2d473418571689feb1
                  MATRIX: 651->82|1019->128|1178->192|1208->197|1230->211|1269->213|1302->261|1335->268|1359->283|1399->285|1436->295|1602->434|1636->447|1673->457|1704->471|1733->492|1772->493|1809->503|1976->643|2010->656|2047->666|2090->679|2125->687|2659->1194|2672->1198|2700->1205|2729->1207|2742->1211|2767->1215|2821->1241|2899->1292|2912->1296|2938->1301|3016->1352|3029->1356|3056->1362|3302->1581|3315->1585|3343->1592|3434->1656|3447->1660|3474->1666|3567->1732|3580->1736|3614->1749|3705->1813|3718->1817|3746->1824|3847->1898|3860->1902|3888->1909|6046->4039|6060->4043|6089->4050|6686->4619|6700->4623|6729->4630|7233->5106|7247->5110|7273->5114|7874->5687|7888->5691|7923->5704|8412->6165|8426->6169|8454->6175|10494->8186|10509->8190|10539->8197|11235->8864|11250->8868|11278->8873|13425->10992|13439->10996|13469->11004|16009->13513
                  LINES: 24->4|29->6|34->6|36->8|36->8|36->8|37->9|38->10|38->10|38->10|39->11|41->13|41->13|42->14|43->15|43->15|43->15|44->16|46->18|46->18|47->19|48->20|50->22|61->33|61->33|61->33|61->33|61->33|61->33|62->34|63->35|63->35|63->35|64->36|64->36|64->36|68->40|68->40|68->40|69->41|69->41|69->41|70->42|70->42|70->42|71->43|71->43|71->43|72->44|72->44|72->44|98->70|98->70|98->70|104->76|104->76|104->76|108->80|108->80|108->80|114->86|114->86|114->86|119->91|119->91|119->91|136->108|136->108|136->108|143->115|143->115|143->115|171->143|171->143|171->143|209->181
                  -- GENERATED --
              */
          