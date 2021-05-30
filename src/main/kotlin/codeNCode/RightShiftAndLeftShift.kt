package codeNCode

class RightShiftAndLeftShift {
    //right shift----------------------------------------------------------------
    public fun rightShift(binaryNumber: Long, numberOfBitsToBeShifted: Int): Long {


        val binaryNumberAfterRS =
            binaryNumber.toString().subSequence(0, binaryNumber.toString().length - numberOfBitsToBeShifted)
        /*  println(
              "Binary number $binaryNumber after $numberOfBitsToBeShifted bits right shift  is : $binaryNumberAfterRS" +
                      " and the decimal value of the" +
                      " new binary number is " +
                      "${
                          ConversionDecimalBinaryViceVersa().binaryToDecimal(binaryNumberAfterRS.toString().toLong())
                      }"
          )*/

        return binaryNumberAfterRS.toString().toLong()
    }

   public fun rightShiftDecimal(binaryNumber: Long, numberOfBitsToBeShifted: Int): Long {
        val binaryNumberAfterRS =
            binaryNumber.toString().subSequence(0, binaryNumber.toString().length - numberOfBitsToBeShifted)


        return ConversionDecimalBinaryViceVersa().binaryToDecimal(binaryNumberAfterRS.toString().toLong()).toLong()
    }

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



}