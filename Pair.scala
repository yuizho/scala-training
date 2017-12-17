class Pair[A, B](val a: A, val b: B) {
  override def toString(): String = "(" + a + "," + b + ")"
}

//def divide(m: Int, n: Int): Pair[Int, Int] = new Pair[Int, Int](m / n, m % n)
