package codeNCode

fun isBinary(binaryNumber: Long): Boolean {

    var binaryNumber = binaryNumber

    while (binaryNumber > 0) {
        if (binaryNumber % 10 > 1) {
            return false
        }
        binaryNumber /= 10
    }
    return true

}