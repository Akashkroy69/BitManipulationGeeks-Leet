# CompetitiveCodingGeekForGeeks
I am implementing various data structures and algorithms in Kotlin on LeetCode.
The purpose is to get better in Kotlin and to know and use various features provided by the language along with developing better understanding of DS And algo.

# In This section I am learning Bit Manipulation 

# Brian Karnigham Algorithm

Explanation through problem:
    problem 3: Given a number find how many set bits are there in the binary representation of the number.
    Brian Karnighan algorithm says: n & n-1 will make exactly one set bit, the first set bit found from right, as 
    example: n= 110100
               -     1
                ----------
    then n-1 =  110011
    n & n-1 =   110000
    
     so in one iteration the algorithm finds and makes exactly one set bit as zero
     so by repeating the process until n becomes zero will lead us to the number of set bits
    

