object Rich {
  implicit class RichString(val src: String) {
    def smile: String = src + ":-)"
  }
}
