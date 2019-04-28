// @GENERATOR:play-routes-compiler
// @SOURCE:P:/Users/Simon/Documents/PRO/HEIG-VD_PRO_2019_B_08/Source_projet/conf/routes
// @DATE:Sun Apr 28 13:56:11 CEST 2019

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def LoginSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.LoginSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
    // @LINE:15
    def RegisterSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.RegisterSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "register"})
        }
      """
    )
  
    // @LINE:18
    def ModifOptionsSub: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.ModifOptionsSub",
      """
        function(Option0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "modifoptions" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("Option", Option0)])})
        }
      """
    )
  
    // @LINE:13
    def addSousCategorie: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addSousCategorie",
      """
        function(nom0,categorie_id1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "AddSousCategorie" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("nom", nom0), (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("categorie_id", categorie_id1)])})
        }
      """
    )
  
    // @LINE:17
    def ModifOptions: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.ModifOptions",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "options"})
        }
      """
    )
  
    // @LINE:12
    def sousCategorie: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.sousCategorie",
      """
        function(default0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "sousCategorie" + _qS([(default0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("default", default0))])})
        }
      """
    )
  
    // @LINE:10
    def Disconnect: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.Disconnect",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deco"})
        }
      """
    )
  
    // @LINE:9
    def Profil: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.Profil",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profil"})
        }
      """
    )
  
    // @LINE:7
    def test: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.test",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "test"})
        }
      """
    )
  
    // @LINE:8
    def testParam: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.testParam",
      """
        function(name0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "testParam" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("name", name0)])})
        }
      """
    )
  
    // @LINE:16
    def Register: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.Register",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "register"})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:11
    def Categorie: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.Categorie",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "categorie"})
        }
      """
    )
  
  }

  // @LINE:21
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
