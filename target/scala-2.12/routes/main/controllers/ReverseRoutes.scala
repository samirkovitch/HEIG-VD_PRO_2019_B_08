// @GENERATOR:play-routes-compiler
// @SOURCE:D:/TIC/HEIG/S4/PRO/pro_play_java/conf/routes
// @DATE:Tue Apr 02 21:52:54 CEST 2019

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

  
    // @LINE:8
    def Profil(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "profil")
    }
  
    // @LINE:7
    def test(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "test")
    }
  
    // @LINE:10
    def sousCategorie(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "sousCategorie")
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:9
    def Categorie(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "categorie")
    }
  
  }

  // @LINE:13
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
