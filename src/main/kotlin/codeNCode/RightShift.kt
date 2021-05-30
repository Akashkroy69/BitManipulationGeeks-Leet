package codeNCode

//right shift----------------------------------------------------------------
public fun rightShift(binaryNumber: Long, numberOfBitsToBeShifted: Int): Long {
    var binaryNumber: Long = binaryNumber

    if (!isBinary(binaryNumber)) {
       binaryNumber = Integer.toBinaryString(binaryNumber.toInt()).toLong()
      //  binaryNumber = ConversionDecimalBinaryViceVersa().decimalToBinary(binaryNumber).toLong()
    }
    for (iteration in 0 until numberOfBitsToBeShifted) {

        binaryNumber /= 10
    }
    return binaryNumber
}

public fun rightShiftDecimal(binaryNumber: Long, numberOfBitsToBeShifted: Int): Long {
    val binaryNumberAfterRS =
        binaryNumber.toString().subSequence(0, binaryNumber.toString().length - numberOfBitsToBeShifted)


    return ConversionDecimalBinaryViceVersa().binaryToDecimal(binaryNumberAfterRS.toString().toLong()).toLong()
}