package SimpleChattyBot



fun main() {
    val box1: Array<Int> = readLine()!!.split(" ").map{it.toInt()}.toTypedArray().sortedArray()
    val box2: Array<Int> = readLine()!!.split(" ").map{it.toInt()}.toTypedArray().sortedArray()
    if (box1[0] > box2[0] && box1[1] > box2[1] && box1[2] > box2[2]) {
        println("Box 1 > Box 2")
    } else if (box1[0] >= box2[0] && box1[1] >= box2[1] && box1[2] > box2[2]) {
        println("Box 1 > Box 2")
    } else if (box1[0] >= box2[0] && box1[1] > box2[1] && box1[2] >= box2[2]) {
        println("Box 1 > Box 2")
    } else if (box1[0] > box2[0] && box1[1] >= box2[1] && box1[2] >= box2[2]) {
        println("Box 1 > Box 2")
    } else if (box1[0] < box2[0] && box1[1] < box2[1] && box1[2] < box2[2]) {
        println("Box 1 < Box 2")
    } else if (box1[0] <= box2[0] && box1[1] <= box2[1] && box1[2] < box2[2]) {
        println("Box 1 < Box 2")
    } else if (box1[0] <= box2[0] && box1[1] < box2[1] && box1[2] <= box2[2]) {
        println("Box 1 < Box 2")
    } else if (box1[0] < box2[0] && box1[1] <= box2[1] && box1[2] <= box2[2]) {
        println("Box 1 < Box 2")
    } else if (box1[0] == box2[0] && box1[1] == box2[1] && box1[2] == box2[2]) {
        println("Box 1 = Box 2")
    } else {
        println("Incomparable")
    }
}