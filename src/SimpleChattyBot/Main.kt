//internal class Number {
//    private var base // 2, 8, 10, 16
//            : Int
//    private var value // can be of any base
//            : String
//    private var hexatoDec // for hexadecimal to decimal conversion
//            : MutableMap<Char, Int>? = null
//    private var dectoHex // for decimal to hexadecimal
//            : MutableMap<Int, Char>? = null
//
//    constructor(value: String, base: Int) {
//        this.value = value
//        this.base = base
//        hexatoDec = HashMap()
//        dectoHex = HashMap()
//        for (i in 0..5) {
//            dectoHex[10 + i] = ('A'.code + i).toChar()
//            hexatoDec[('A'.code + i).toChar()] = 10 + i
//        }
//    }
//
//    constructor(value: String) {
//        // default base 10
//        base = 10
//        this.value = value
//    }
//
//    fun toDecimal(): String {
//        var sum = 0
//        var pow = 0
//        val tempVal = value
//        for (i in tempVal.length - 1 downTo 0) {
//            var `val` = tempVal[i] - '0'
//            if (base == 16
//                && hexatoDec!!.containsKey(
//                    tempVal[i]
//                )
//            ) {
//                `val` = hexatoDec!![tempVal[i]]!!
//            }
//            sum += (`val` * Math.pow(base.toDouble(), pow++.toDouble())).toInt()
//        }
//        return sum.toString()
//    }
//
//    fun toBase(targetBase: Int): String {
//        // take the given number
//        // convert it into decimal
//        // divide the decimal with the target base
//        var `val` = value
//
//        // must be in decimal
//        if (base != 10) `val` = toDecimal()
//        var temp = `val`.toInt()
//        val str = StringBuilder()
//        while (temp != 0) {
//            val tempValue = temp % targetBase
//            if (targetBase == 16
//                && dectoHex!!.containsKey(tempValue)
//            ) {
//                str.insert(0, dectoHex!![tempValue])
//            } else {
//                str.insert(0, tempValue)
//            }
//            temp /= targetBase
//        }
//        return str.toString()
//    }
//}
//
//internal object GFG {
//    @JvmStatic
//    fun main(args: Array<String>) {
//        val n1 = Number("10AF", 16)
//        println("Decimal : " + n1.toDecimal())
//        println("Octal : " + n1.toBase(8))
//        println("Binary : " + n1.toBase(2))
//    }
//}