package com.GeneticThought.Algorithms

object General {



  /*
    Greatest Common Divisor "gcd" Euclid's method
     " if u is greater than v then the gcd (u,v) is that the same as  the gcd of v and u-v
    */
  def gcd( a:Long,  b:Long): Long = {
    var u = a
    var v = b

    while (u >0)
      {
        if (u < v) { var t = u; u = v; v = t}
        u = u - v
      }
    return v;
  }
}
