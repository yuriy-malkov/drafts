package main.scala.cache

import scala.collection.mutable
import scala.collection.mutable.Map

class SimpleCache {
  val store: mutable.Map[String, String] = mutable.Map[String, String]()

  def addHash(hash: String): Unit = {
    println(s"adding $hash to cache")
    store += (hash -> hash)
  }

  def readHash(hash: String): Unit = {
    println(s"returning $hash from cache")
  }
}

object SimpleCache extends App {
  println("Welcome to my Cache implementation")

  val cache = new SimpleCache()

  cache.addHash("some hash")
  cache.readHash("some hash")
  println(s"whats in cache? ${cache.store}")
}