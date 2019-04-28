
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
/*1.2*/import controllers.BDDpackage.Pays
/*2.2*/import controllers.BDDpackage.Statut

object register extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[Pays],List[Statut],List[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(pays : List[Pays],
        statut : List[Statut],
        error : List[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*6.30*/("""
"""),_display_(/*7.2*/main("Register")/*7.18*/ {_display_(Seq[Any](format.raw/*7.20*/("""
    """),_display_(/*8.6*/helper/*8.12*/.form(action = helper.CSRF(routes.HomeController.RegisterSubmit()))/*8.79*/ {_display_(Seq[Any](format.raw/*8.81*/("""
        """),format.raw/*9.9*/("""<div class="container">
            <div class="row justify-content-center">
                <div class="col-md-6">
                    <div class="card">
                        <header class="card-header">
                            <h4 class="card-title mt-2">Sign up</h4>
                        </header>
                        <article class="card-body">
                            <form>
                                <div class="form-group">
                                    <label>Username</label>
                                    <input type="text" name="username" class="form-control" placeholder="">
                                </div> <!-- form-group end.// -->

                                <div class="form-row">
                                    <div class="col form-group">
                                        <label>First name </label>
                                        <input type="text" name="name" class="form-control" placeholder="">
                                    </div> <!-- form-group end.// -->
                                    <div class="col form-group">
                                        <label>Last name</label>
                                        <input type="text" name="surname" class="form-control" placeholder=" ">
                                    </div> <!-- form-group end.// -->
                                </div> <!-- form-row end.// -->

                                <div class="form-group">
                                    <label>Birth date</label>
                                    <input type="date" name="anniversaire" class="form-control" placeholder="">
                                </div> <!-- form-group end.// -->

                                <div class="form-group">
                                    <label>Email address</label>
                                    <input type="email" class="form-control" name="email" placeholder="">
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
                                            <option value = "0" selected>Choose...</option>
                                            """),_display_(/*59.46*/for(s <- statut) yield /*59.62*/ {_display_(Seq[Any](format.raw/*59.64*/("""
                                                """),format.raw/*60.49*/("""<option value =""""),_display_(/*60.66*/s/*60.67*/.id),format.raw/*60.70*/("""">"""),_display_(/*60.73*/s/*60.74*/.nom),format.raw/*60.78*/("""</option>
                                            """)))}),format.raw/*61.46*/("""
                                        """),format.raw/*62.41*/("""</select>
                                    </div> <!-- form-group end.// -->
                                    <div class="form-group col-md-6">
                                        <label>Country</label>
                                        <select name="pays" class="form-control">
                                            <option value = "0" selected>Choose...</option>
                                            """),_display_(/*68.46*/for(p <- pays) yield /*68.60*/ {_display_(Seq[Any](format.raw/*68.62*/("""
                                                """),format.raw/*69.49*/("""<option value =""""),_display_(/*69.66*/p/*69.67*/.id),format.raw/*69.70*/("""">"""),_display_(/*69.73*/p/*69.74*/.nom),format.raw/*69.78*/("""</option>
                                            """)))}),format.raw/*70.46*/("""
                                        """),format.raw/*71.41*/("""</select>
                                    </div> <!-- form-group end.// -->
                                </div> <!-- form-row.// -->
                                <div class="form-group">
                                    <label>Create password</label>
                                    <input class="form-control" type="password" name="password">
                                </div> <!-- form-group end.// -->
                                <div style="margin-bottom: 20px">
                                    <input type="checkbox" name="Option" value="2"> Rappel email ?
                                </div>
                                <div class="form-group">
                                    <button type="submit" class="btn btn-primary btn-block"> Register  </button>
                                </div> <!-- form-group// -->
                                <div class="form-group">

                                </div>
                                <small class="text-muted">By clicking the 'Sign Up' button, you confirm that you accept our <br> Terms of use and Privacy Policy.</small>
                            </form>
                        </article> <!-- card-body end .// -->
                    </div> <!-- card.// -->
                </div> <!-- col.//-->
            </div> <!-- row.//-->
        </div>
    """)))}),format.raw/*94.6*/("""




""")))}),format.raw/*99.2*/("""
"""))
      }
    }
  }

  def render(pays:List[Pays],statut:List[Statut],error:List[String]): play.twirl.api.HtmlFormat.Appendable = apply(pays,statut,error)

  def f:((List[Pays],List[Statut],List[String]) => play.twirl.api.HtmlFormat.Appendable) = (pays,statut,error) => apply(pays,statut,error)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 28 13:00:27 CEST 2019
                  SOURCE: P:/Users/Simon/Documents/PRO/HEIG-VD_PRO_2019_B_08/Source_projet/app/views/register.scala.html
                  HASH: b842eeb9b8d872a398c2e221d3b7caffc1d8dfec
                  MATRIX: 651->1|693->38|1067->79|1244->161|1272->164|1296->180|1335->182|1367->189|1381->195|1456->262|1495->264|1531->274|4940->3656|4972->3672|5012->3674|5090->3724|5134->3741|5144->3742|5168->3745|5198->3748|5208->3749|5233->3753|5320->3809|5390->3851|5855->4289|5885->4303|5925->4305|6003->4355|6047->4372|6057->4373|6081->4376|6111->4379|6121->4380|6146->4384|6233->4440|6303->4482|7719->5868|7760->5879
                  LINES: 24->1|25->2|30->4|37->6|38->7|38->7|38->7|39->8|39->8|39->8|39->8|40->9|90->59|90->59|90->59|91->60|91->60|91->60|91->60|91->60|91->60|91->60|92->61|93->62|99->68|99->68|99->68|100->69|100->69|100->69|100->69|100->69|100->69|100->69|101->70|102->71|125->94|130->99
                  -- GENERATED --
              */
          