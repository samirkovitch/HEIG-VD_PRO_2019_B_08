// @GENERATOR:play-routes-compiler
// @SOURCE:P:/Users/Simon/Documents/PRO/HEIG-VD_PRO_2019_B_08/Source_projet/conf/routes
// @DATE:Sun Apr 28 13:00:26 CEST 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_0: controllers.HomeController,
  // @LINE:21
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:21
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_0, Assets_1, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """test""", """controllers.HomeController.test"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """testParam""", """controllers.HomeController.testParam(name:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profil""", """controllers.HomeController.Profil"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deco""", """controllers.HomeController.Disconnect"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """categorie""", """controllers.HomeController.Categorie"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sousCategorie""", """controllers.HomeController.sousCategorie(default:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """AddSousCategorie""", """controllers.HomeController.addSousCategorie(nom:String, categorie_id:Int)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.HomeController.LoginSubmit"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """register""", """controllers.HomeController.RegisterSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """register""", """controllers.HomeController.Register"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """options""", """controllers.HomeController.ModifOptions"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """modifoptions""", """controllers.HomeController.ModifOptionsSub(Option:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_HomeController_test1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("test")))
  )
  private[this] lazy val controllers_HomeController_test1_invoker = createInvoker(
    HomeController_0.test,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "test",
      Nil,
      "GET",
      this.prefix + """test""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HomeController_testParam2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("testParam")))
  )
  private[this] lazy val controllers_HomeController_testParam2_invoker = createInvoker(
    HomeController_0.testParam(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "testParam",
      Seq(classOf[String]),
      "GET",
      this.prefix + """testParam""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_HomeController_Profil3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profil")))
  )
  private[this] lazy val controllers_HomeController_Profil3_invoker = createInvoker(
    HomeController_0.Profil,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "Profil",
      Nil,
      "GET",
      this.prefix + """profil""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HomeController_Disconnect4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deco")))
  )
  private[this] lazy val controllers_HomeController_Disconnect4_invoker = createInvoker(
    HomeController_0.Disconnect,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "Disconnect",
      Nil,
      "GET",
      this.prefix + """deco""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_HomeController_Categorie5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("categorie")))
  )
  private[this] lazy val controllers_HomeController_Categorie5_invoker = createInvoker(
    HomeController_0.Categorie,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "Categorie",
      Nil,
      "GET",
      this.prefix + """categorie""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_HomeController_sousCategorie6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sousCategorie")))
  )
  private[this] lazy val controllers_HomeController_sousCategorie6_invoker = createInvoker(
    HomeController_0.sousCategorie(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "sousCategorie",
      Seq(classOf[String]),
      "GET",
      this.prefix + """sousCategorie""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_HomeController_addSousCategorie7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("AddSousCategorie")))
  )
  private[this] lazy val controllers_HomeController_addSousCategorie7_invoker = createInvoker(
    HomeController_0.addSousCategorie(fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addSousCategorie",
      Seq(classOf[String], classOf[Int]),
      "GET",
      this.prefix + """AddSousCategorie""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_HomeController_LoginSubmit8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_HomeController_LoginSubmit8_invoker = createInvoker(
    HomeController_0.LoginSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "LoginSubmit",
      Nil,
      "POST",
      this.prefix + """login""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_HomeController_RegisterSubmit9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register")))
  )
  private[this] lazy val controllers_HomeController_RegisterSubmit9_invoker = createInvoker(
    HomeController_0.RegisterSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "RegisterSubmit",
      Nil,
      "POST",
      this.prefix + """register""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_HomeController_Register10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register")))
  )
  private[this] lazy val controllers_HomeController_Register10_invoker = createInvoker(
    HomeController_0.Register,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "Register",
      Nil,
      "GET",
      this.prefix + """register""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_HomeController_ModifOptions11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("options")))
  )
  private[this] lazy val controllers_HomeController_ModifOptions11_invoker = createInvoker(
    HomeController_0.ModifOptions,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "ModifOptions",
      Nil,
      "GET",
      this.prefix + """options""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_HomeController_ModifOptionsSub12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("modifoptions")))
  )
  private[this] lazy val controllers_HomeController_ModifOptionsSub12_invoker = createInvoker(
    HomeController_0.ModifOptionsSub(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "ModifOptionsSub",
      Seq(classOf[String]),
      "GET",
      this.prefix + """modifoptions""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_Assets_versioned13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned13_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index)
      }
  
    // @LINE:7
    case controllers_HomeController_test1_route(params@_) =>
      call { 
        controllers_HomeController_test1_invoker.call(HomeController_0.test)
      }
  
    // @LINE:8
    case controllers_HomeController_testParam2_route(params@_) =>
      call(params.fromQuery[String]("name", None)) { (name) =>
        controllers_HomeController_testParam2_invoker.call(HomeController_0.testParam(name))
      }
  
    // @LINE:9
    case controllers_HomeController_Profil3_route(params@_) =>
      call { 
        controllers_HomeController_Profil3_invoker.call(HomeController_0.Profil)
      }
  
    // @LINE:10
    case controllers_HomeController_Disconnect4_route(params@_) =>
      call { 
        controllers_HomeController_Disconnect4_invoker.call(HomeController_0.Disconnect)
      }
  
    // @LINE:11
    case controllers_HomeController_Categorie5_route(params@_) =>
      call { 
        controllers_HomeController_Categorie5_invoker.call(HomeController_0.Categorie)
      }
  
    // @LINE:12
    case controllers_HomeController_sousCategorie6_route(params@_) =>
      call(params.fromQuery[String]("default", Some(""))) { (default) =>
        controllers_HomeController_sousCategorie6_invoker.call(HomeController_0.sousCategorie(default))
      }
  
    // @LINE:13
    case controllers_HomeController_addSousCategorie7_route(params@_) =>
      call(params.fromQuery[String]("nom", None), params.fromQuery[Int]("categorie_id", None)) { (nom, categorie_id) =>
        controllers_HomeController_addSousCategorie7_invoker.call(HomeController_0.addSousCategorie(nom, categorie_id))
      }
  
    // @LINE:14
    case controllers_HomeController_LoginSubmit8_route(params@_) =>
      call { 
        controllers_HomeController_LoginSubmit8_invoker.call(HomeController_0.LoginSubmit)
      }
  
    // @LINE:15
    case controllers_HomeController_RegisterSubmit9_route(params@_) =>
      call { 
        controllers_HomeController_RegisterSubmit9_invoker.call(HomeController_0.RegisterSubmit)
      }
  
    // @LINE:16
    case controllers_HomeController_Register10_route(params@_) =>
      call { 
        controllers_HomeController_Register10_invoker.call(HomeController_0.Register)
      }
  
    // @LINE:17
    case controllers_HomeController_ModifOptions11_route(params@_) =>
      call { 
        controllers_HomeController_ModifOptions11_invoker.call(HomeController_0.ModifOptions)
      }
  
    // @LINE:18
    case controllers_HomeController_ModifOptionsSub12_route(params@_) =>
      call(params.fromQuery[String]("Option", None)) { (Option) =>
        controllers_HomeController_ModifOptionsSub12_invoker.call(HomeController_0.ModifOptionsSub(Option))
      }
  
    // @LINE:21
    case controllers_Assets_versioned13_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned13_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
