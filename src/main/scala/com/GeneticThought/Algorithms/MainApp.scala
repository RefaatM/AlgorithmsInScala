package com.GeneticThought.Algorithms

import javafx.scene.chart.LineChart.SortingPolicy


object MainApp extends App {
  println ("Testing insert Sorting for Long array ")
  val sampleSize = 30000
  val ir : Array[Long] = General.generateRandomLongArray(sampleSize)
  val br : Array[Long] = ir.clone()
  val sr : Array[Long] = ir.clone()


  private def TestAlgorithm(name:String,array:Array[Long],method:(Array[Long])=> Unit):Long = {
    println(s"Testing $name with sample size : "+array.size)
    val ts = System.currentTimeMillis()
    method(array)
    val time = System.currentTimeMillis() - ts
    println(s"$name took: $time ms")
    time
  }
  val insertTime = TestAlgorithm("Insert Sorting",ir,Sorting.insertSortLong)
  val bubleTime = TestAlgorithm("Buble Sorting",br,Sorting.bubbleSortLong)
  val selectionTime = TestAlgorithm("Selection Sorting",br,Sorting.selectionSortLong)
  println(s"To sort same array of $sampleSize Insert Sort took $insertTime ms Buble Sort took $bubleTime Selection Sort Took $selectionTime")
  val a = 200L
  val b = 300L
  println(s"Testing gcd ($a/$b) = " + General.gcd(a,b))
}