package com.GeneticThought.Algorithms
import scala.collection.mutable.ArrayBuffer

class Sorting[T] {
 /*
     From Introduction to Algorithms 2nd Edition  ISBN 0-262-032937-7
     section 2.1 page 17
  */
  def insertSort(array: Array[T], greaterThan: (T,T) => Boolean): Unit = {
    for (j <- 2 to array.size - 1) {
      val key = array(j)
      var i = j - 1
      while (i >= 0 && greaterThan(array(i), key)) {
        array(i + 1) = array(i)
        i -= 1
      }
      array(i + 1) = key
    }
  }

  def swap(array: Array[T], i: Int, j: Int):Unit = { val t = array(i); array(i) = array(j); array(j) = t}


  def selectionSort(array: Array[T], lesserThan: (T,T) => Boolean): Unit = {
    for (i <- 1 to array.size - 1) {
      var min = i
      for( j<- i + 1 to array.size - 1){
         if( lesserThan(array(j),array(min))) min = j
       }
      swap(array,min,i)
      }
  }

  def bubbleSort(array: Array[T], greaterThan: (T,T) => Boolean): Unit = {
     for( i <- array.size-1 to 1 by -1 ){
       for( j <- 2 to i){
         if(greaterThan(array(j-1), array(j))) swap(array,j-1,j)
       }
     }
  }

  //Todo: need to imporve the algorithm coding
  def quickSort(array: Array[T],greaterThan: (T,T) => Boolean,lesserThan: (T,T) => Boolean, equalTo: (T,T) => Boolean):Array[T] = {
    if (array.length > 2) {
      val p = array(array.length / 2)
      val partR = array filter (greaterThan(p, _))
      val partL = array filter (lesserThan(p, _))
      val partM = array filter (equalTo(p, _))
      val sorted = quickSort(partR, greaterThan, lesserThan, equalTo).union(partM.union(quickSort(partL, greaterThan, lesserThan, equalTo)))
      sorted.copyToArray(array)

    }
    array
  }


}

object Sorting {
     val longSortingAlgorithms: Sorting[Long] = new Sorting[Long]()
     val intSortingAlgorithms: Sorting[Int] = new Sorting[Int]()
     val stringSortingAlgorithms: Sorting[String] = new Sorting[String]()

   def insertSortLong(array:Array[Long]): Unit = longSortingAlgorithms.insertSort(array = array,(a,b) => a >b)
   def insertSortInt(array:Array[Int]): Unit = intSortingAlgorithms.insertSort(array = array,(a,b) => a >b)
   def insertSortString(array:Array[String]): Unit = stringSortingAlgorithms.insertSort(array = array,(a,b) => a > b)

   def selectionSortLong(array:Array[Long]): Unit =longSortingAlgorithms.selectionSort(array = array,(a,b) => a < b)

   def  bubbleSortLong(array:Array[Long]): Unit = longSortingAlgorithms.bubbleSort(array = array,(a,b) => a > b)

   def  quickSortLong(array:Array[Long]): Array[Long] = longSortingAlgorithms.quickSort(array = array,(a,b) => a > b,(a,b) => a < b,(a,b) => a == b)

  def  liberarySortLong(array:Array[Long]):Unit =  array.sortWith((a,b)=> a<b)


}
