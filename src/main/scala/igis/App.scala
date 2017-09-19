package igis

import igis.mvc.{Request, Router}
import igis.tree.TreeController

import scala.scalajs.js.JSApp
import org.scalajs.dom.document

object App extends JSApp {
  var router = new Router()

  def main(): Unit = {
    println(html.index())

    router.register(new TreeController(), "/tree")

    //TODO: overengineer me
    document.getElementById("body").innerHTML = router(new Request("/tree"))
  }
}
