// T.P.C. 1: Implement the following functions
//
// fun toUpper(...) ...
// fun toLower(...) ...
// fun getLetterOrDigitUnicode(...) ...  Receives any char and if it is a letter or number, return its Unicode.
// Otherwise returns -1
//
// Study intro of "if" instruction in book "ProgKotlin.pdf"
// Function getUnicode uses the "if" instruction
// T.P.C. 2: implement toUpper and to toLower with "if" to convert if the char is valid (e.g., toUpper expects the char
// to be a lowercase letter)

fun readChar(quest: String): Char {
    print("$quest? ")
    // readLine()!!.trim() reads a String
    // readLine()!!.trim()[0] gets the first char
    return readLine()!!.trim()[0]
}

fun main() {
    val ch: Char = readChar("Character")

    val chUpper = toUpper(ch)
    println("Upper case char: $chUpper")

//    val chLower = toLower(ch)
    val chLower = toLower2(ch)

    println("Lower case char: $chLower")

    val chCode : Int = getLetterOrDigitUnicode(ch)
    println("Char $ch has Unicode $chCode")
}

// Pre-condition: ch must be lower case.
fun toUpper(ch: Char): Char {
    return ch - ('a'-'A') // 'a'-'A' converts 'a' and 'A' to its Unicode, 97 and 65, respectively
                          // ('a'-'A') == (97 - 65) == 32
}

// Pre-condition: ch must be upper case.
fun toLower(ch: Char): Char {
    return ch + ('a'-'A')
}

// Receives any char and if it is a letter or number, return its Unicode.
// Otherwise returns -1
fun getLetterOrDigitUnicode(ch: Char): Int {
    if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z' ||
        ch >= '0' && ch <= '9')  // AND (&&) has more priority than OR (||)
        return ch.toInt()
    else // (optional here)
        return -1
}

/*
1.
if (boolean expression)
    1 instruction
2.
if (boolean expression) {
    instruction 1
    instruction 2
    ...
    instruction N
}   // Brackets needed

3.
if (boolean expression)
    1 instruction
else
    1 instruction

4.
if (boolean expression)
    1 instruction
else {
    instruction 1
    instruction 2
    ...
    instruction N
}   // Brackets needed
5.
if (boolean expression) {
    instruction 1
    instruction 2
    ...
    instruction N
}   // Brackets needed
else {
    instruction 1
    instruction 2
    ...
    instruction N
}   // Brackets needed

6.
if (boolean expression)
    1 instruction
else if (boolean expression)
    1 instruction

7.
if (boolean expression)
    1 instruction
else {  // No so common
    if (boolean expression)
        1 instruction
}
 */


// T.P.C. 2:
// Pre-condition: ch must be lower case.
fun toUpper2(ch: Char): Char {
    if (ch >= 'a' && ch <= 'z')
        return ch - ('a'-'A')
    //else (optional here)
    return ch
}

// Pre-condition: ch must be upper case.
fun toLower2(ch: Char): Char {
    if (ch >= 'A' && ch <= 'Z')
        return ch + ('a'-'A')
    //else (optional here)
    return ch
}

// Using ranges

fun getLetterOrDigitUnicode3(ch: Char): Int {
    if (ch in 'A'..'Z' || ch in 'a'..'z' ||
        ch in '0'..'9'
    )
        return ch.toInt()
   // else // (optional here)
   return -1
}

// Pre-condition: ch must be lower case.
fun toUpper3(ch: Char): Char {
    if (ch in 'a'..'z')
        return ch - ('a'-'A')
    //else (optional here)
    return ch
}

// An idempotent function is a function which doesn't have colateral effects
// If it's called with the same arguments, produces the same results, and
// it doesn't alter the environment (e.g., other objects, properties, input/output stream, etc.)
// toLower3 is an idempotent function
//
//
// This kind of functions are also named "Pure functions" -> see PG book
//
// Pre-condition: ch must be upper case.
fun toLower3(ch: Char): Char {
    if (ch in 'A'..'Z')
        return ch + ('a'-'A')
    //else (optional here)
    return ch
}

// values in memory explanation


// T.P.C.
// Exes:

// 1. Inside main:
// Compute greater of two numbers - greater2
// Compute greater of three numbers - greater3

// 2. fun greater2 and greater3 (use greater2)
















