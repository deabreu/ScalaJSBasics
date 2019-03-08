package tutorial.webapp

import org.scalajs.dom
import dom.document

import scala.scalajs.js.annotation.JSExportTopLevel

object TutorialApp {


  def getChildCount(targetNode:dom.Node) : Int = targetNode.childNodes.length

  def appendPar(targetNode: dom.Node, text:String) : Unit = {
    val parNode = document.createElement("p")
    val parameterCount = getChildCount(targetNode)
    val textNode = document.createTextNode(s"$text - contagem $parameterCount")
    parNode.appendChild( textNode)
    if (parameterCount % 4 == 0 )
      parNode.setAttribute("class", "paragraph")

    targetNode.appendChild(parNode)
  }

  @JSExportTopLevel("addClickedMessage")
  def addClickedMessage(): Unit = {
    appendPar(document.body, "You clicked the button!")
  }

  def main (args: Array[String]): Unit = {
    //println("Hello World!")
    appendPar(document.body, "Hello World")
  }
}