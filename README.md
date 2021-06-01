# CompetitiveCodingGeekForGeeks Bit Manipulation
I am implementing various data structures and algorithms in Kotlin on LeetCode.
The purpose is to get better in Kotlin and to know and use various features provided by the language along with developing better understanding of DS And algo.

# In This section I am learning Bit Manipulation 
   Bitwise operations are faster than the arithmatic operation. So At times we use bit manipulation to get the operation done with faster execution time. 
   Operations with bits are used in Data compression (data is compressed by converting it from one representation to another, to reduce the space), 
   XOR Encryption (an algorithm to encrypt the data for safety issues). In such places we need to have good knowledge and skill over Bit Manipulation
# These are some important lessons I would like to revisit.(Not any proper order)

# Brian Karnigham Algorithm

Explanation through problem:
    
    problem: Given a number find how many set bits are there in the binary representation of the number.
    Brian Karnighan algorithm says: n & n-1 will make exactly one set bit, the first set bit found from right, as 0
   
   
    example: n= 110100
               -     1
                ----------
    then n-1 =  110011
    n & n-1 =   110000
    
     so in one iteration the algorithm finds and makes exactly one set bit as zero
     so by repeating the process until n becomes zero will lead us to the number of set bits

# Swapping Two numbers with XOR


    We can easily swap two numbers say a and b by using the XOR(^) operator by applying below operations:
 
    a ^= b;
    b ^= a; 
    a ^= b;
# Property of XOR
    1 A ^ B = ~A.B + A.~B or (A + B).(~A + ~B)
    2 x ^ 0 = x
    3 x ^ y = y ^ x
    4 x ^ y ^ z = calculate in any order.
    5 x ^ x = 0
    
 # Problem 4: given an array that contains all elements even number of times except one element. find the element occurring odd number of times.
    /*
    * Two property of Xor to remember: 1. n xor n == 0
    *                                  2. 0 xor n == n
    * LOGIC: So if we apply xor on every elements of the array then each pair of numbers
    * will make them self 0 and then one element will remain which with o result into itself
    * Example: Given arr= [1,1,2,3,3,4,4,4,4]
    * 1^1=0, 4^4^4^4=0, 2
    *0^0^2=2
    *  */
