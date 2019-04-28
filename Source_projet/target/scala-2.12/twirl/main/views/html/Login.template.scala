
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

object Login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(error : String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.18*/("""

"""),_display_(/*3.2*/main("Login")/*3.15*/ {_display_(Seq[Any](format.raw/*3.17*/("""
    """),format.raw/*4.5*/("""<div class="div-with-bg">
    """),_display_(/*5.6*/helper/*5.12*/.form(action = helper.CSRF(routes.HomeController.LoginSubmit()))/*5.76*/ {_display_(Seq[Any](format.raw/*5.78*/("""
        """),format.raw/*6.9*/("""<div class="container">
        <div class="d-flex justify-content-center h-100">
            <div class="card-login">
                <div class="card-header">
                    <h3>Sign In</h3>
                </div>
                <div class="card-body">
                    <form>
                        <div class="input-group form-group">
                            <div class="input-group-prepend">
                                <span class="input-group-text"></span>
                            </div>
                            <input type="text" name="username" class="form-control" placeholder="username">
                        </div>
                        <div class="input-group form-group">
                            <div class="input-group-prepend">
                                <span class="input-group-text"></span>
                            </div>
                            <input type="password" name="password" class="form-control" placeholder="password">
                        </div>
                        <div class="form-group">
                            <input type="submit" value="Login" class="btn float-right login_btn" >
                            <p class="text-danger">"""),_display_(/*28.53*/error),format.raw/*28.58*/("""</p>
                        </div>
                    </form>
                </div>
                <div class="card-footer" style="margin-top: 50px;">
                    <div class="d-flex justify-content-center links">
                        Don't have an account?<a href="http://localhost:9000/register">Sign Up</a>
                    </div>
                    <div class="d-flex justify-content-center">
                        <a href="http://localhost:9000/passwordForgot">Forgot your password?</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
    """)))}),format.raw/*43.6*/("""
    """),format.raw/*44.5*/("""</div>
""")))}),format.raw/*45.2*/("""
"""))
      }
    }
  }

  def render(error:String): play.twirl.api.HtmlFormat.Appendable = apply(error)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (error) => apply(error)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 28 13:00:27 CEST 2019
                  SOURCE: P:/Users/Simon/Documents/PRO/HEIG-VD_PRO_2019_B_08/Source_projet/app/views/Login.scala.html
                  HASH: 86c1e0e98b5d318ed203ab0b05a7fe220e50d424
                  MATRIX: 948->1|1059->17|1089->22|1110->35|1149->37|1181->43|1238->75|1252->81|1324->145|1363->147|1399->157|2676->1407|2702->1412|3359->2039|3392->2045|3431->2054
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|37->5|37->5|37->5|37->5|38->6|60->28|60->28|75->43|76->44|77->45
                  -- GENERATED --
              */
          