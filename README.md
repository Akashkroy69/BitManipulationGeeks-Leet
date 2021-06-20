# Competitive Coding: Bit Manipulation
I am implementing various data structures and algorithms in Kotlin on LeetCode.
The purpose is to get better in Kotlin and to know and use various features provided by the language along with developing better understanding of DS And algo.

# Little bit about Importance of Bit Manipulation 
   Bitwise operations are faster than the arithmatic operation. So At times we use bit manipulation to get the operation done with faster execution time. 
   Operations with bits are used in Data compression (data is compressed by converting it from one representation to another, to reduce the space), 
   XOR Encryption (an algorithm to encrypt the data for safety issues). In such places we need to have good knowledge and skill over Bit Manipulation.
   Apart from this it holds a good weightage in interviews.
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
    
 Explanation of some property by a challenge.
 Problem: Given an array that contains all elements even number of times except one element. find the element occurring odd number of times.
    
     Two property of Xor to remember: 5. x xor x == 0
                                      2. 0 xor x == x
     LOGIC: So if we apply xor on every elements of the array then each pair of numbers
     will make them self 0 and then one element will remain which with o result into itself
     Example: Given arr= [1,1,2,3,3,4,4,4,4]
     1^1=0, 4^4^4^4=0, 2
     0^0^2=2
    
 # Problem: Generate Power Set.
     Note: This problem can be solved using recursion or Bit Manipulation technique.
    
     Example: str= "ABC"
     Power set = {"","A", "B", "C","AB","BC","CA","ABC"}
     n=3
     then number of elements in power set is : 2^3
     Algorithm:
     1 find number of elements in power set using count = 1 << n == 1*2^n
     2 loop1: i=0<count ????
     3      loop2: j=0<n ????
                 if(i&(1<<j)>0)  ????
                  print->str[j]
     
# A very beautiful problem

     leetcode 1342 SolutionNumberOfStepsToReduceANumberToZero

    Given a non-negative integer num, return the number of steps to reduce it to zero.
    If the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.



     Example 1:

     Input: num = 14
     Output: 6
     Explanation:
    
    Step 1) 14 is even; divide by 2 and obtain 7.
    Step 2) 7 is odd; subtract 1 and obtain 6.
    Step 3) 6 is even; divide by 2 and obtain 3.
    Step 4) 3 is odd; subtract 1 and obtain 2.
    Step 5) 2 is even; divide by 2 and obtain 1.
    Step 6) 1 is odd; subtract 1 and obtain 0.*/
   //Solution 1
    class SolutionNumberOfStepsToReduceANumberToZero {
    fun numberOfSteps(num: Int): Int {
        var number = num
        var numberOfSteps = 0
        while (number > 0) {
            number = if (number and 1 == 0) {
                number shr 1
            } else {
                number - 1
            }
            numberOfSteps++
         }
        return numberOfSteps
       }
    //Solution 2: one Line Solution 
     //Algorithm: if num is 14.
         /*
    * num = 14
    * step 1 num.toString(2)--------> "1110"
    * ----> 1110 is even so we have to divide by 2 or using bit operation we just have to right shift by 1
    * ----> now num = 111. according to the problem statement we have to subtract by 1
    * so, 111
    *    -001       this takes one step
    * ----------
    *     110   ----> Now again it became even so we have to right shift by 1 <--- this takes one step
    * so, for getting over 1 we need 2 steps.
    * except the last 1 bit---------> for the last 1 bit to get over it we need only one step; subtraction by 1
    *      1
    *     -1
    * ---------
    *      0
    * step 2: count the number of '1' and multiply with 2 <-- these many steps needed to get rid of 1's
    * step 3 : subtract 1 <-- as the to get rid of the last 1 we just need only 1 step
    * step 4: count the number of '0' <--- these many steps will be needed to get rid of 0s
    * */
    //                                  step 1
    fun numberOfStepsTest(num: Int) = num.toString(2).let { s ->
    //          step 2              step 3         step 4
        s.count { it == '1' } * 2     -1     +  s.count{it == '0'}
    }
}
