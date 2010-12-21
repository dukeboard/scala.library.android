/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.scala.library.android.tester.scala

import scala.actors.Actor

class TestFeature {

  def runTest : java.lang.String = {

    var actor = new Actor {def act={println("HelloFrom Actor")} }

    actor.start

    var list = List(3,4)

    list.foreach{e=>
      println("Hello list, value ="+e)
    }

    "Scala -> Android"

  }

}
