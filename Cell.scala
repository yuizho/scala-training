class Cell[A](var value: A) {
  def put(newValue: A): Unit = {
    value = newValue
  }

  def get(): A = value
}
