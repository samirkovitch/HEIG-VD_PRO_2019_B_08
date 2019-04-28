// @GENERATOR:play-routes-compiler
// @SOURCE:P:/Users/Simon/Documents/PRO/HEIG-VD_PRO_2019_B_08/Source_projet/conf/routes
// @DATE:Sun Apr 28 13:56:11 CEST 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def LoginSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "login")
    }
  
    // @LINE:15
    def RegisterSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "register")
    }
  
    // @LINE:18
    def ModifOptionsSub(Option:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "modifoptions" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("Option", Option)))))
    }
  
    // @LINE:13
    def addSousCategorie(nom:String, categorie_id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "AddSousCategorie" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("nom", nom)), Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("categorie_id", categorie_id)))))
    }
  
    // @LINE:17
    def ModifOptions(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "options")
    }
  
    // @LINE:12
    def sousCategorie(default:String = ""): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "sousCategorie" + play.core.routing.queryString(List(if(default == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("default", default)))))
    }
  
    // @LINE:10
    def Disconnect(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deco")
    }
  
    // @LINE:9
    def Profil(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "profil")
    }
  
    // @LINE:7
    def test(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "test")
    }
  
    // @LINE:8
    def testParam(name:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "testParam" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("name", name)))))
    }
  
    // @LINE:16
    def Register(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "register")
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:11
    def Categorie(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "categorie")
    }
  
  }

  // @LINE:21
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
