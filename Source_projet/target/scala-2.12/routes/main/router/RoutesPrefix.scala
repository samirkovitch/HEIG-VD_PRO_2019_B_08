// @GENERATOR:play-routes-compiler
// @SOURCE:P:/Users/Simon/Documents/PRO/HEIG-VD_PRO_2019_B_08/Source_projet/conf/routes
// @DATE:Sun Apr 28 13:00:26 CEST 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
