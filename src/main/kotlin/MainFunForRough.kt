import roughwork.testExecutionOfOrder

fun main() {
    // testExecutionOfOrder()
    fun decimalToBinary(decimalNumber: Long): String {


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
    for (item in 0..15) {
        val decimalToBinaryVar = decimalToBinary(item.toLong())
        println("Binary number for $item : $decimalToBinaryVar")
    }
}