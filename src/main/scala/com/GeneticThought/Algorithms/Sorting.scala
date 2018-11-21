package com.GeneticThought.Algorithms

object Sorting {

  def insertSort(array: Array[Long]): Unit = {
    for (j <- 1 to array.size-1) {
      val key = array(j)
      var i = j - 1
      while (i >= 0 && array(i) > key) {
        array(i + 1) = array(i)
        i -= 1
      }
      array(i + 1) = key
    }
  }
}
