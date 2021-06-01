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
}