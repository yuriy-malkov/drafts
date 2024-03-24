package main.scala.cache

import scala.collection.mutable

class SimpleCache {
  val store: mutable.Map[String, String] = mutable.Map[String, String]()

  def addHash(hash: String): Unit = {
    println(s"adding $hash to cache")
    store += (hash -> hash)
  }

  def readHash(hash: String): Option[String] = {
    println(s"returning $hash from cache")
    store.get(hash)
  }
}

object SimpleCache extends App {
  println("Welcome to my Cache implementation")

  val cache = new SimpleCache()

  cache.addHash("some hash")
  val testHash: Option[String] = cache.readHash("some hash")
  println(s"my testHash = $testHash")
  println(s"whats in cache? ${cache.store}")
}