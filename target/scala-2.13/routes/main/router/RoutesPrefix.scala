// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/james/Documents/PSU/IST411/Repos/ist411t1play/conf/routes
// @DATE:Mon Apr 20 16:45:40 PDT 2020


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
