import codeNCode.*

fun main() {
   /* val leftShiftDecimal = leftShiftDecimal(1, 2)
    println(
        "Value after right shift by 3 bits will be: ${rightShift(10000, 3)} " +
                "And the decimal value for the same binary number after right shift by 3 bits decimal value will be " +
                "${rightShiftDecimal(10000, 3)} "
    )
    println("---------------------doing bit manipulation using shl and shr ------------------")
    println("shr : ${6 shr 1}")
    println("shl : ${6 shl 1}")
    println("-----------------setbit------------------")
    println(isSet(1100, 2))
    println("------------setbitcount-------------")
    println("Number of set bits in 11010 is ${countNumberOfSetBits(100101101100)}")
    println()*/
    /*val a =countNumberOfSetBitsWithANDOperator(110111110)
    //val executionTimea = measureTimeMillis(::TODO)
   // println(a)
    println("----------------")
    functionLiteralToMeasureExecutionTime()*/

   val myArray  = countingSetBitsIn0ToN(5)
   for (element in myArray)
   {
      println(element)
   }
    //val numAfterRS = rightShift(1,2)
    //println("$numAfterRS")
    /*for(element in myArray)
    {
        println(element)
    }*/
}