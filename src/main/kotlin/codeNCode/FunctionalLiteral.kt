package codeNCode

import kotlin.system.measureTimeMillis

fun functionLiteralToMeasureExecutionTime() {


    val functionLiteral: () -> Unit = {
        countNumberOfSetBitsWithANDOperator(1100001001)
    }

    var executionTime = measureTimeMillis(functionLiteral)
    println("countNumberOfSetBitsWithANDOperator ExTime: $executionTime")
    println("------------------------------------------")
    val functionLiteral1: () -> Unit = {
        countNumberOfSetBits(1100001001)
    }
    executionTime= measureTimeMillis(functionLiteral1)
    println("countNumberOfSetBits ExTime: $executionTime")



}
