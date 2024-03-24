package main.scala.cache

class SimpleCache {
  def addHash(): Unit = {
    println("adding hash to cache")
  }

  def readHash(): Unit = {
    println("returning data from hash")
  }
}

object SimpleCache extends App {
  println("Welcome to my Cache implementation")

  val cache = new SimpleCache()

  cache.addHash()
  cache.readHash()
}