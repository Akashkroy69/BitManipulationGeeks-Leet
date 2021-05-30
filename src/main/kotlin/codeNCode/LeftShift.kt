package codeNCode

//left shift---------------------------------------------------------------
public fun leftShift(binaryNumber: Long, numberOfBitsToBeShifted: Int): Long {
    var binaryNumberShiftedLeft: Long = binaryNumber
    for (iteration in 0 until numberOfBitsToBeShifted)
        binaryNumberShiftedLeft = (binaryNumberShiftedLeft.toString() + "0").toLong()
    return binaryNumberShiftedLeft
}

public fun leftShiftDecimal(binaryNumber: Long, numberOfBitsToBeShifted: Int): Long {
    var binaryNumberShiftedLeft: Long = binaryNumber
    for (iteration in 0 until numberOfBitsToBeShifted)
        binaryNumberShiftedLeft = (binaryNumberShiftedLeft.toString() + "0").toLong()
    return ConversionDecimalBinaryViceVersa().binaryToDecimal(binaryNumberShiftedLeft).toLong()
}
