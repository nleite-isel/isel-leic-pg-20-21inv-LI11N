fun main() {
    /*
	val h = readInt("Horas")
	val m = readInt("Minutos")
	val s = readInt("Segundos")
	val secs = h*3600 + m*60 + s
	*/

    val tm: Time = Time(readInt("Horas"), readInt("Minutos"), readInt("Segundos"))
    println("Horas = ${tm.hour}")
    println("Minutos = ${tm.min}")
    println("Segundos = ${tm.sec}")

    // Convert from data class Time instance to total seconds
    val secs1 = timeToSecs(tm)
    println("${toText(tm)} = $secs1 segundos.")
}
