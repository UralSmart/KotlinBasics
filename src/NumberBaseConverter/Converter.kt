package NumberBaseConverter

fun main() {
    println("Do you want to convert /from decimal or /to decimal? (To quit type /exit)")
    val way = readLine()
    if (way == "/from") {
        fromDecimal()
    } else if (way == "/to") {
        toDecimal()
    } else if (way == "/exit") {

    }
}

fun fromDecimal() {
    println("Enter number in decimal system: ")
    val decimal = readLine()!!.toInt()
    println("Enter target base: ")
    val target = readLine()!!.toInt()
    var result: String = "0"
    if (target == 2) {
        result = Integer.toBinaryString(decimal)
    } else if (target == 8) {
        result = Integer.toOctalString(decimal)
    } else if (target == 16) {
        result = Integer.toHexString(decimal)
    }
    println("Conversion result: $result")
    main()
}

fun toDecimal() {
    println("Enter source number:")
    val source = readLine()
    println("Enter source base:")
    val base = readLine()!!.toInt()
    var result: String = ""
    var remainder: Long
    var i = 0
    if (base == 16) {
        result = Integer.parseInt(source, 16).toString()
    } else if (base == 8) {
        result = Integer.parseInt(source, 8).toString()
    } else if (base == 2) {
        result = Integer.parseInt(source, 2).toString()
    }
    println("Conversion to decimal result: $result")
    main()
}