import kotlin.math.sqrt
import kotlin.math.pow
// Ou:
//import kotlin.math.*
	
fun main() {
	val x1 : Double = 15.0
	val y1 : Double = 20.0
	val x2 : Double = 35.0
	val y2 : Double = 5.0
	
	val d : Double = sqrt((y1 - y2).pow(2) + (x1 - x2).pow(2) )
	
	println("Distancia entre pontos = $d")
}


/*
Distancia entre pontos = 25.0

*/
