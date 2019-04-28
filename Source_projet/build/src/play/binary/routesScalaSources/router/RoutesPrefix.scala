// @GENERATOR:play-routes-compiler
// @SOURCE:D:/TIC/HEIG/S4/PRO/pro_play_java/conf/routes
// @DATE:Sat Mar 30 20:30:04 CET 2019


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
