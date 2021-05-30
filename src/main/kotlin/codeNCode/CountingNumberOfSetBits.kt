package codeNCode

/*
*
* Number of set bits or 1s in a binary number is called Hamming Weight.
*
* */
fun countNumberOfSetBits(binaryNumber: Long): Int {
    if (!isBinary(binaryNumber)) return 0
    var setBitCount = 0
    for (index in 0 until binaryNumber.toString().length) {
        if (Character.getNumericValue(binaryNumber.toString()[index]) == 1) setBitCount++

    }
    return setBitCount
}

fun countNumberOfSetBitsWithANDOperator(binaryNumber: Long): Int {
    var binaryNumber = binaryNumber
    if (!isBinary(binaryNumber)) return 0
    var setBitCount = 0
    for (iteration in 0 until binaryNumber.toString().length) {
        setBitCount += (binaryNumber and 1).toInt()
        if (binaryNumber.toInt() != 1) {
            binaryNumber = rightShift(binaryNumber, 1)
        }


    }
    return setBitCount
}