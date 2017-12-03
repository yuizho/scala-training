class Point(private val x: Int, private val y: Int) {
  def +(p: Point): Point = {
    new Point(x + p.x, y + p.y)
  }
  override def toString(): String = "(" + x + ", " + y + ")"
}

// コンパニオンオブジェクト (name is same as the Class)
// class and companion object have to cohabit on same file.
object Point {
  // コンパニオンオブジェクト can access to the Class's private member
  def apply(x: Int, y: Int): Point = new Point(x, y)
  def accessFileds(p: Point): Unit = println(p.x + ", " + p.y)
}
