import pt.isel.canvas.*

fun main() {
    onStart {
//        val arena = Canvas(600,300, YELLOW)
        val arena = Canvas(600,300, CYAN)

        arena.drawCircle(300,150,60, RED)

    }
    onFinish {
        println("Bye")
    }
}