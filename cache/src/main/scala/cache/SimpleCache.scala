package main.scala.cache

import scala.collection.mutable

class SimpleCache(size: Long) {
  private val hashSize: Long = size
  val store: mutable.Map[String, (String, Int)] = mutable.Map[String, (String, Int)]()


  private def removeLeastUsedHash(): Unit = {
    println("Removing least used hash")
  }

  def addHash(hash: String): Unit = {
    if (store.size + 1 >= hashSize) {
      println(s"Cache is full = ${store.size}. Removing least used hash")
      removeLeastUsedHash()
    }
    store += (hash -> (hash, 0))
  }

  def readHash(hash: String): Option[String] = {
    store.get(hash) match {
      case None => None
      case Some(value) =>
        store.update(hash, (value._1, value._2 +1))
        Some(value._1)
    }
  }

}

object SimpleCache extends App {
  println("Welcome to my Cache implementation")

  val cache = new SimpleCache(2)

  cache.addHash("hash1")
  cache.addHash("hash2")
  cache.addHash("hash3")
  val testHash: Option[String] = cache.readHash("some hash")
  val nonExistingHash = cache.readHash("non existent hash")
  println(s"my testHash = $testHash")
  println(s"nonExistingHash = $nonExistingHash")
  println(s"whats in cache? ${cache.store}")
}