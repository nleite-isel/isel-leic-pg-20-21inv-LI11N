
fun main() {
	print("Horas? ")
	val h = readLine()!!.trim().toInt()
	
	print("Minutos? ")
	val m = readLine()!!.trim().toInt()
	
	print("Segundos? ")
	val s = readLine()!!.trim().toInt()
	
	val secs = h*3600 + m*60 + s
	
	println("$h:$m:$s = $secs segundos.")
}
