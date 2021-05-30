package codeNCode

/*If a number N is given and asked to check whether Kth bit is set or not?
* Set means that whether Kth bit is 1 or not.
*Example:
*  Kth bit is counted from right to MSB
* Input: N = 4, K = 0
*Output: No
Explanation: Binary representation of 4 is 100,
in which 0th bit from LSB is not set.
So, return false. */

fun isSet(binaryNumber: Long, ithBit: Int): Boolean {
    if (!isBinary(binaryNumber)) {
        println("$binaryNumber is not a binary number")
        return false
    }
    return try {
        Character.getNumericValue(binaryNumber.toString().reversed()[ithBit]) == 1
    } catch (e: StringIndexOutOfBoundsException) {
        false
    }
}