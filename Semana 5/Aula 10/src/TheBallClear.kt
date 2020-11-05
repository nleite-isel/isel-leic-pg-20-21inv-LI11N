import pt.isel.canvas.*

data class Ball(val xCenter: Int, val yCenter: Int, val radius: Int, val color: Int)
//
// Global Functions
//
// Draw ball in arena
fun drawBall(arena: Canvas, ball: Ball) {
    // Erase arena
    arena.erase()
    // Draw ball
    arena.drawCircle(ball.xCenter, ball.yCenter, ball.radius, ball.color)
}
// Move Ball Left - Immutable function
fun moveBallLeft(arena: Canvas, ball: Ball, delta: Int) : Ball {
    return (if (ball.xCenter >= 0) Ball(ball.xCenter - delta, ball.yCenter, ball.radius, ball.color) else ball)
}


fun main() {
    onStart {
        val arena = Canvas(600,300, CYAN)
//        arena.drawCircle(300,150,60, RED)
//        arena.onKeyPressed { keyEvent ->
//            if (keyEvent.code == LEFT_CODE) {
//                println("Left cursor key pressed!")
//                arena.erase()
//            }
//        }
        // Create ball instance
//        val ball = Ball(300,150,60, RED)
        var ball = Ball(300,150,60, RED)

        // Draw ball
        drawBall(arena, ball)
        // Delta of 20 pixels
        val delta = 20
        // Process keys
        arena.onKeyPressed { keyEvent ->
            if (keyEvent.code == LEFT_CODE) {
                println("Left cursor key pressed!")
//                val ball1 = moveBallLeft(arena, ball, delta)
//                // Draw ball
//                drawBall(arena, ball1)
                // Add Mutable point
                ball = moveBallLeft(arena, ball, delta)
                // Draw ball
                drawBall(arena, ball)
            }
        }
        arena.onTimeProgress(100) {
            ball = moveBallLeft(arena, ball, delta)
            // Draw ball
            drawBall(arena, ball)
        }

    }
    onFinish {
        println("Bye")
    }
}


// T.P.C. 3:
// Permitir o tratamento de teclas CIMA, BAIXO, ESQUERDA, DIREITA e fazer deslocar
// a bola um delta (escolhido por vós) segundo a direção carregada
// Por exemplo, o delta = 20 pixels e o utilizador carregou na direção esquerda, então
// a bola move-se 20 pixels para a esquerda.