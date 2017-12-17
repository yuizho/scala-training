sealed abstract class Tree
case class Branch(value: Int, left: Tree, right: Tree) extends Tree
case object Empty extends Tree

object TreeUtil {
  def max(tree: Tree): Int = tree match {
    case Branch(v, l, r) => {
      val lMax = max(l)
      val rMax = max(r)
      val m = if(lMax < rMax) {rMax} else {lMax}
      if (v < m) {m} else {v}
    }
    case Empty => 0
  }

  def min(tree: Tree): Int = tree match {
    case Branch(v, l, r) => {
      val lMin = min(l)
      val rMin = min(r)
      val m = if(lMin < rMin) {lMin} else {rMin}
      if (v < m) {v} else {m}
    }
    case Empty => 0
  }

  def depth(tree: Tree): Int = tree match {
    case Branch(v, l, r) => {
      val lDepth = depth(l)
      val rDepth = depth(r)
      if (lDepth < rDepth) {rDepth + 1} else {lDepth + 1}
    }
    case Empty => 0
  }

  def toList(tree: Tree): List[Int] = tree match {
    case Empty => Nil
    case Branch(v, l, r) => toList(l) ++ List(v) ++ toList(r)
  }
}
