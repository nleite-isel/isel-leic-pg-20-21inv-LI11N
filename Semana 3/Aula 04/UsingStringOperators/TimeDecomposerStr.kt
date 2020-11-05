
// Elabore um programa que dado um valor inteiro correspondente a um 
// tempo em segundos e o decomponha em três valores inteiros 
// representando, respectivamente, horas, minutos e segundos.

fun main() {
	println("Time Decomposer")
	//val timeSec = 150
	val timeSec: Int = 3727
	
	val hour = timeSec / 3600 // 60*60
	val remainderSec = timeSec % 3600
	val min = remainderSec / 60
	val sec = remainderSec % 60
	
	println("O tempo em segundos, $timeSec, decomposto fica:")
	println("Horas: $hour")
	println("Min: $min")
	println("Seg: $sec")
}


/*
Output:

Time Decomposer
O tempo em segundos, 3727, decomposto fica:
Horas: 1
Min: 2
Seg: 7

*/
