object Main {
    def main(args: Array[String]): Unit = {
        println("if ----------------------")
        // ★課題
        val age: Int = 6
        val isSchoolStarted: Boolean = false
        if (1 <= age && age <= 6 && !isSchoolStarted) {
          println("幼児です")
        } else {
          println("幼児ではありません")
        }

        println("while ----------------------")
        // ★課題
        loopFrom0To9()

        println("for------------------------")
        for (x <- 1 to 5; y <- 1 until 5 if x != y) {
          println("x = " + x + " y = " + y)
        }
        for (e <- List("A", "B", "C", "D", "E")) println(e)
        // yield can manipulate each value
        val preList = for (e <- List("A", "B", "C", "D", "E")) yield {
          "Pre" + e
        }
        println(preList)
        // ★課題
        for (a <- 1 to 1000; b <- 1 to 1000; c <- 1 to 1000; if a*a == b*b + c*c) {
          println("a = " + a + " b = " + b + " c = " + c)
        }

        println("match------------------------")
        val taro = "Taro"
        val taroResult = taro match {
          case "Taro" => "Male"
          case "Jiro" => "Male"
          case "Hanako" => "Female"
          case _ => "Dont know"
        }
        println(taroResult)

        val matchList = List("A", "B", "C", "D", "E")
        matchList match {
          case List("A", b, c, d, e) if b != "B" =>
          //case List("A", b, c, d, e) =>
            println("b = " + b)
            println("c = " + c)
            println("d = " + d)
            println("e = " + e)
          case _ =>
            println("nothing")
       }
       val nestedList = List(List("A"), List("B", "C", "D", "E"))
       nestedList match {
         // @で@の前の変数に、あとの値を束縛する
         case List(a@List("A"), x) =>
          println(a)
          println(x)
        case _ => println("nothing")
       }
       // type pattern match
       // scala uses type pattern match often instead of cast
       // but note that generics type can't  match properly due to restriction of JVM
       import java.util.Locale
       val anyObj: AnyRef = "String Literal"
       anyObj match {
         case v:java.lang.Integer =>
          println("Integer!")
         case v:String =>
          println(v.toUpperCase(Locale.ENGLISH))
       }
       // ★課題
       for (i <- 1 to 1000) {
         val r = new scala.util.Random(new java.security.SecureRandom()).alphanumeric.take(5).toList
         r match {
           case List(a, b, c, d, e) =>
            println(List(a, b, c, d, a))
           case _ =>
            println("error")
         }
       }
    }

    def loopFrom0To9(): Unit = {
      var i = 0
      do {
        println(i)
        i += 1
      } while (i < 10)
    }
}
