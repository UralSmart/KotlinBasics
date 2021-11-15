package SimpleChattyBot


fun main() {
    println("Hello! My name is Aid.")
    println("I was created in 2020.")
    println("Please, remind me your name.")
    val name = readLine()
    println("What a great name you have, $name!")
    println("Let me guess your age.")
    println("Enter remainders of dividing your age by 3, 5 and 7.")
    val remainder3 = readLine()!!.toInt()
    val remainder5 = readLine()!!.toInt()
    val remainder7 = readLine()!!.toInt()
    val age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105
    println("Your age is $age; that's a good time to start programming!")
    println("Now I will prove to you that I can count to any number you want.")
    val number = readLine()!!.toInt()
    println()
    for (i in 0..number) {
        println("$i!")
    }
}