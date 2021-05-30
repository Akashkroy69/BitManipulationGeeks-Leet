package codeNCode

/*
* Given an integer num, return an array of the number
* of 1's in the binary representation of every number
* in the range [0, num]
* Example 2: Input: num = 5
Output: [0,1,1,2,1,2]
Explanation:
0 --> 0
1 --> 1
2 --> 10
3 --> 11
4 --> 100
5 --> 101
*
*
*
*LESSONS:
* 1. Order of execution in Kotlin and concept
* of interpolation : https://stackoverflow.com/questions/63965238/order-of-execution-kotlin
* 2.My query on stack overflow: https://stackoverflow.com/questions/67582061/what-is-the-execution-order-of-the-lines-inside-a-kotlin-method?noredirect=1#comment119454366_67582061
*
*
* */

fun countingSetBitsIn0ToN(number: Int): IntArray {
    var arrayOfSetBits = IntArray(number+1)

    for (item in 0..number) {
        var tempBinaryNumber = Integer.toBinaryString(item)
        var setBitCount = when (tempBinaryNumber.toLong()) {
            0.toLong() -> 0
            1.toLong() -> 1
            else -> {

                var localBinaryNumber = tempBinaryNumber.toInt()
                var setBit = 0
                while (localBinaryNumber > 0) {

                    if ((localBinaryNumber.toLong() and 1).toInt() == 1) setBit++
                    localBinaryNumber /= 10
                }
                setBit
            }
        }
        arrayOfSetBits[item]=setBitCount
    }
    return arrayOfSetBits
}