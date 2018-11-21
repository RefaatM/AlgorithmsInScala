package com.GeneticThought.Algorithms

import  com.GeneticThought.Algorithms.Sorting.insertSort

object MainApp extends App {
  println ("Testing insert Sorting ")
  val ar : Array[Long] = Array(10L, 20L,40L, 60L , 7L )
  insertSort(ar)
  ar.foreach(println)

}