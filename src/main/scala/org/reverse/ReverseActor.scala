package org.reverse

import akka.actor.{ Actor, Props, Status }
import akka.actor.actorRef2Scala

class ReverseActor  extends Actor {
  override def receive = {
    case s: String => sender()! s.reverse
    case _ => Status.Failure(new ClassNotFoundException)
    
  }
}

object ReverseActor {
  def props = Props(new ReverseActor)
}