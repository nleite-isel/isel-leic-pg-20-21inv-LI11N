import kotlin.math.PI

fun main() {
	print("Raio do círculo? ")
	val radius = readLine()!!.toDouble()
	val area = radius * radius * PI
	println("Área = $area")
}
