trait TraitA {
  val name: String
  def printName(): Unit = println(name)
}

class ClassA(val name: String) extends TraitA

object ObjectA {
  val a = new ClassA("dwango")

  val a2 = new TraitA { val name = "kadokawa"}
}
