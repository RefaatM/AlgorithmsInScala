package com.GeneticThought.Algorithms



object MainApp extends App {
  println ("Testing insert Sorting ")
  val ar : Array[Long] = Array(10L, 20L,40L, 60L , 7L )
  Sorting.insertSortLong(ar)
  ar.foreach(println)
}