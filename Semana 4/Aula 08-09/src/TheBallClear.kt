import pt.isel.canvas.*

fun main() {
    onStart {
        val arena = Canvas(600,300, CYAN)
        arena.drawCircle(300,150,60, RED)

        arena.onKeyPressed { keyEvent ->
            if (keyEvent.code == LEFT_CODE) {
                println("Left cursor key pressed!")
                arena.erase()
            }
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