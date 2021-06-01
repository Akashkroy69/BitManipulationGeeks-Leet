package geeksForGeeks.bitmanipulation

class G4GBitManipulationVideoProblems {
    fun kThBitSetOrNot(number: Int, k: Int) {
        if (number and (1 shl k - 1) != 0) {
            println("The Kth bit is set")
        } else {
            println("The Kth bit is not set")

        }
    }
}