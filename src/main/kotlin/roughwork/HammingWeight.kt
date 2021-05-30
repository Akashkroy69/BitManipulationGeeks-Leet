package roughwork

import kotlin.math.pow

class SolutionHammingWeight {
    // you need treat n as an unsigned value
    fun hammingWeight(n:Double): Int {
        var num = n.toInt()
        var setCountBit = 0
        while (num > 0) {
            if ((num and 1) == 1) setCountBit++
            num = num shr 1
        }
        return setCountBit
    }


}






fun main() {
    for (ite in 0..15)
        println(Integer.toBinaryString(ite))
    println("--------------------------------------")
  /*  for (ite in 0..15)
        println(SolutionHammingWeight().hammingWeight(ite))*/
    println("------------------")

   // println(SolutionHammingWeight().hammingWeight(11111111111111111111))
    var binString = readLine()
    var number = binString?.toInt()
    var decimal = 0
    var a = 0
    if (number != null) {
        while (number != 0) {
            decimal += (number % 10)* (2.0.pow(a)).toInt()
            if (number != null) {
                number /= 10
            }
            a++
        }
    }

    println(SolutionHammingWeight().hammingWeight(decimal.toDouble()))



}