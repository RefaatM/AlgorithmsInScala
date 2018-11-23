package com.GeneticThought.Algorithms



object MainApp extends App {
  println ("Testing insert Sorting for Long array ")
  val ar : Array[Long] = Array(10L, 20L,40L, 60L , 7L, 1L, 556L, 234L,25L,2L,8L )
  Sorting.insertSortLong(ar)
  ar.foreach(println)
  val a = 200L
  val b = 300L
  println(s"Testing gcd ($a/$b) = " + General.gcd(a,b))
}