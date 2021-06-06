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
     
    
