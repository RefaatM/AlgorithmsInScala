package com.GeneticThought.Algorithms

import scala.math

class Sorting[T] {
 /* type OrderedView[T] = T=> Ordered[T]
  def compareGreater[T: OrderedView](o1: T, o2: T): Boolean = {
    o1 > o2
  }
*/
  def insertSort(array: Array[T], greaterThan: (T,T) => Boolean): Unit = {
    for (j <- 1 to array.size - 1) {
      val key = array(j)
      var i = j - 1
      while (i >= 0 && greaterThan(array(i), key)) {
        array(i + 1) = array(i)
        i -= 1
      }
      array(i + 1) = key
    }
  }
}

object Sorting {

   def insertSortLong(array:Array[Long]): Unit = (new Sorting[Long]()).insertSort(array = array,(a,b) => a >b)

}
