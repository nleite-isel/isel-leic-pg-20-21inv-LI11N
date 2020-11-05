
fun main() {
  /*
  val tm = Time(1, 11, 40) // Representação no diagrama
  println(tm.h)
  println(tm.m)
  println(tm.s)
  */
  
  val secs = readInt("Segundos")
  val tm = secsToTime(secs)
  // Convert to text using toText
  println("$secs segundos = ${toText(tm)}")

  // Convert to text using Time member function toTxt
  println("$secs segundos = ${tm.toTxt()}")
}