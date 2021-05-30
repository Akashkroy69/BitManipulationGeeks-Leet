package codeNCode

import java.lang.NumberFormatException

class ConversionDecimalBinaryViceVersa(val decimalNumber: Int) {
    constructor(binaryNumberAsString: String) : this(binaryNumberAsString?.toInt())
    constructor() : this(0) {}

    init {
        println("Welcome to ecosystem of conversion.")
    }

    fun decimalToBinary(): String {

        println("\nEnter a decimal number to convert into a binary number:")
        var decimalNumber = readLine()?.toInt()
        var flag = true
        if (decimalNumber != null) {
            when (decimalNumber.toInt()) {
                0 -> return "0"
                1 -> return "1"
                else -> {
                    var binaryAsString: String = ""
                    var tempDecimal = decimalNumber

                    while (tempDecimal > 0) {
                        val temp = (tempDecimal.rem(2)).toInt()
                        binaryAsString = binaryAsString.plus(temp)
                        tempDecimal /= 2
                    }
                    return binaryAsString.reversed()

                }

            }
        } else {
            println("Something is wrong.")
            return "0"
        }
    }

    fun decimalToBinary(decimalNumber: Long): String {


        var tempDecimal = decimalNumber
        var flag = true
        when (decimalNumber.toInt()) {
            0 -> return "0"
            1 -> return "1"
            else -> {
                var binaryAsString: String = ""
                var tempDecimal = decimalNumber

                while (tempDecimal > 0) {
                    val temp = (tempDecimal.rem(2)).toInt()
                    binaryAsString = binaryAsString.plus(temp)
                    tempDecimal /= 2
                }
                return binaryAsString.reversed()

            }

        }
    }

    fun binaryToDecimal(): Int {
        println(
            "\nEnter a binary number(If I want to check whether the number is in the format of 0s and\n" +
                    "1s or not then we need to use regular expressions): "
        )
        val binaryNumber = try {
            readLine()?.toLong()
        } catch (e: NumberFormatException) {
            println("enter a Number, not a string.")
        }
        /* for (index in 0 until binaryNumber.toString().length) {

         }*/

        var numOfDigitsInNumber = binaryNumber.toString().length
        var decimalNumber: Int = 0
        var exponent = numOfDigitsInNumber

        if (binaryNumber != null) {
            for (index in 0 until numOfDigitsInNumber) {
                decimalNumber += Character.getNumericValue(binaryNumber.toString()[index]) * Math.pow(
                    2.0,
                    (--exponent).toDouble()
                ).toInt()
            }
        }
        println("The decimal number for the binary number $binaryNumber is $decimalNumber")

        return decimalNumber
    }

    fun binaryToDecimal(binNumber: Long): Int {

        val binaryNumber = try {
            binNumber
        } catch (e: NumberFormatException) {
            println("enter a Number, not a string.")
        }
        /* for (index in 0 until binaryNumber.toString().length) {

         }*/

        var numOfDigitsInNumber = binaryNumber.toString().length
        var decimalNumber: Int = 0
        var exponent = numOfDigitsInNumber

        if (binaryNumber != null) {
            for (index in 0 until numOfDigitsInNumber) {
                /* println("index : $index, digitNumber: $numOfDigitsInNumber")
                 if (Character.getNumericValue(binaryNumber.toString()[index]) != 1
                     || Character.getNumericValue(binaryNumber.toString()[index]) != 0
                 ) {
                     println("::${Character.getNumericValue(binaryNumber.toString()[index])} ::")
                     throw NotABinaryNumberFormatException()
                 }*/
                decimalNumber += Character.getNumericValue(binaryNumber.toString()[index]) * Math.pow(
                    2.0,
                    (--exponent).toDouble()
                ).toInt()
            }
        }
        // println("The decimal number for the binary number $binaryNumber is $decimalNumber")

        return decimalNumber
    }
}