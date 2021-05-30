package roughwork

class Solution {

    fun countBits(num: Int): IntArray {
        return IntArray(num + 1) { index -> count1sIn(index) }
    }

    fun count1sIn(num: Int): Int {
        var count = 0
        var n = num
        while (n > 0) {
            count++
            n = n and n - 1 // n & (n-1) can remove one set bit from the number.
        }
        return count
    }

    fun count1sInBinaryNumber(binNumber: Int): Int {
        var binaryNumber = binNumber
        var setBitCount = 0
        while (binaryNumber > 0) {
            setBitCount++
            binaryNumber = binaryNumber and (binaryNumber - 1)
        }
        println("for $binNumber ** $setBitCount")
        return setBitCount
    }

    fun countBitss(num: Int): IntArray {
        var arrayOfSetBits = IntArray(num + 1)

        for (item in 0..num) {
            //var tempBinaryNumber = Integer.toBinaryString(item)
            var setBitCount = count1sInBinaryNumber(item)

            arrayOfSetBits[item] = setBitCount
        }
        return arrayOfSetBits
    }
}

fun main() {
    val myList = Solution().countBitss(5)
    println("count1sIn: ${Solution().count1sIn(3)}")
    println("count1sInBinaryNumber: ${Solution().count1sInBinaryNumber(3)}")
    println("---------------------")
    println(myList)
    for ((i, item) in myList.withIndex()) {
        println("for $i binary Num is ${Integer.toBinaryString(i)} :$item ")
    }
}