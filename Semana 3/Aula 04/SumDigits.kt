
// Realize um programa que dado um número n composto por três dígitos calcule a soma entre os seus dígitos. 
// 
// Exemplo: se  n = 156, então a soma dos seus dígitos será 12.

fun main() {
	println("Sum Digits")
	
	//val n = 123
	val n = 124
	
	val dig1 = n % 10 // Digit 1
	val quoc1 = n / 10 // Quotient 1
	
	val dig2 = quoc1 % 10 // Digit 2
	val quoc2 = quoc1 / 10 // Quotient 2
	
	val dig3 = quoc2 % 10 // Digit 3
	val quoc3 = quoc2 / 10 // Quotient 3

/*	
	dig1
	quoc1
	
	dig2
	quoc2
	
	dig3
	quoc3
*/	
	val sum = dig1 + dig2 + dig3
	
	print("n = ")
	print(n)
	print(", então a soma dos seus dígitos será ")
	print(sum)
	println()
}
	
/*
Output:

Sum Digits
n = 123, então a soma dos seus dígitos será 6

*/
