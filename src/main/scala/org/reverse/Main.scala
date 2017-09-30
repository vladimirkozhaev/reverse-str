package org.reverse

import akka.actor.ActorSystem

object Main extends App {
  val s = ActorSystem("reverse")
  s.actorOf(ReverseActor.props, "reverse-str")
}
