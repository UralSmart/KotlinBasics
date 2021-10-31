fun main() {

    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()

    if (c > a && c < b) {
        print("Normal")
    } else if (c < a) {
        print("Deficiency")
    } else if (c > b) {
        print("Excess")
    }
}
