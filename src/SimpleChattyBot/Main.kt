package SimpleChattyBot
import java.lang.Math


fun main() {
    println("Let's test your programming knowledge.")
    println("Why do we use methods?")
    println("1. To repeat a statement multiple times.")
    println("2. To decompose a program into several small subroutines.")
    println("3. To determine the execution time of a program.")
    println("4. To interrupt the execution of a program.")
    var win = false
    while (win == false) {
        val answer = scanner.nextInt()
        if (answer == 2) {
            win = true
        } else {
            println("Please, try again.")
        }
    }
}