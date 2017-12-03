abstract class Printer {
  def print: Unit
}

class APrinter() extends Printer {
  override def print(): Unit = {
    println("A")
  }
}

class BPrinter() extends APrinter {
  override def print(): Unit = {
    println("B")
  }
}
