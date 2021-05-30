package codeNCode

class OddEvenWithAND {
    fun isEven(number: Int) = number and 1 == 0
}

fun main() {
    println(OddEvenWithAND().isEven(101))
}