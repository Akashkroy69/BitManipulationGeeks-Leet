package geeksForGeeks.bitmanipulation

class G4GBitManipulationVideoProblems {
    //Problem 1 : find whether the kth bit is set or not
    fun kThBitSetOrNot(number: Int, k: Int) {
        if (number and (1 shl k - 1) != 0) {
            println("The Kth bit is set")
        } else {
            println("The Kth bit is not set")

        }
    }

    //problem 2 : Find whether the number is power of two or not?
    fun powerOf2(number: Int) = number > 0 && (number and number - 1) == 0

    //problem 3: Given a number find how many set bits are there in the binary representation of the number.
    fun numberOfSetBits(number: Int): Int {
        var locNum = number
        var setBitCount = 0
        while (locNum > 0) {
            locNum = locNum shr 1
            setBitCount++
        }
        return setBitCount
    }
    /* ^ the solution takes O(number-of-nits-in-the-given-number) to find set bits
    * We can reduce it to O(number-of-set-bits) by using BRIAN KARNIGHAN ALGORITHM
    * Brian Karnighan algorithm says: n & n-1 will make exactly one set bit, the first set bit found from right, as 0
    * example: n= 110100
    *            -     1
    *           ----------
    * then n-1 =  110011
    * n & n-1 =   110000
    *
    * so in one iteration the algorithm finds and makes exactly one set bit as zero
    * so by repeating the process until n becomes zero will lead us to the number of set bits
    *
    * */

    fun numberofSetBitsBrianKarnighanAlgorthm(number: Int): Int {
        var tempNumber = number
        var setBitCount = 0
        while (number > 0) {
            number = number and number - 1
            setBitCount++
        }
        return setBitCount
    }
}

fun main() {
    val setBCount = G4GBitManipulationVideoProblems().numberofSetBitsBrianKarnighanAlgorthm(3)
    printl(setBCount)
}