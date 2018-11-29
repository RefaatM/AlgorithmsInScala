package com.GeneticThought.Algorithms

import javafx.scene.chart.LineChart.SortingPolicy


object MainApp extends App {
  println ("Testing insert Sorting for Long array ")
  val sampleSize = 60000
  val ir : Array[Long] = General.generateRandomLongArray(sampleSize)
  val br : Array[Long] = ir.clone()
  val sr : Array[Long] = ir.clone()
  val qr : Array[Long] = ir.clone()
  val lr : Array[Long] = ir.clone()
  val formatter = java.text.NumberFormat.getIntegerInstance

  private def TestAlgorithm(name:String,array:Array[Long],method:(Array[Long])=> Unit):Long = {
    println(s"Testing $name with sample size : ${formatter.format(array.size)}")
    val ts = System.currentTimeMillis()
    method(array)
    val time = System.currentTimeMillis() - ts
    println(s"$name took: ${formatter.format(time)} ms")
    time
  }
  val scalaLibTime = TestAlgorithm("Liberary Sorting",lr,Sorting.liberarySortLong)
  val insertTime =  TestAlgorithm("Insert Sorting",ir,Sorting.insertSortLong)
  val bubleTime = TestAlgorithm("Buble Sorting",br,Sorting.bubbleSortLong)
  val selectionTime =  TestAlgorithm("Selection Sorting",sr,Sorting.selectionSortLong)
  val quickTime = TestAlgorithm("Quick Sorting",qr,Sorting.quickSortLong)
   println(s"To sort same array of ${formatter.format(sampleSize)} Insert Sort took ${formatter.format(insertTime)} ms Buble Sort took ${formatter.format(bubleTime)} ms Selection Sort Took ${formatter.format(selectionTime)} ms Quick Sort Took ${formatter.format(quickTime)} ms LiberarySort Took ${formatter.format(scalaLibTime)} ms ")
  val a = 200L
  val b = 300L
  println(s"Testing gcd ($a/$b) = " + General.gcd(a,b))
}