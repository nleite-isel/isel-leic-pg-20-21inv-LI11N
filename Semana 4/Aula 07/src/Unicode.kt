// T.P.C. 1: Implement the following functions
//
// fun toUpper(...) ...
// fun toLower(...) ...
// fun getUnicode(...) ...  Receives any char and if it is a letter or number, return its Unicode.
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
}

// Pre-condition: ch must be lower case.
fun toUpper(ch: Char): Char {
    return ch - ('a'-'A')
}
