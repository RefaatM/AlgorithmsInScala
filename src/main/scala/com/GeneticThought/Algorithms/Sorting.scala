package com.GeneticThought.Algorithms

import scala.math

class Sorting[T] {
 /*
     From Introduction to Algorithms 2nd Edition  ISBN 0-262-032937-7
     section 2.1 page 17
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
