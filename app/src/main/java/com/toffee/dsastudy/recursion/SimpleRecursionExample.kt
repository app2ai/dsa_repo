package com.toffee.dsastudy.recursion

fun main() {
    // SimpleRecursionExample.addNumberRecursion1ToNRecursion(1, 5)
    // SimpleRecursionExample.factorialOfNumber(5)
    // SimpleRecursionExample.printFibboUpTo30Num(30, 0, 1)
    val ans = SimpleRecursionExample.findNthFibboNumber(9)
    print(ans)
}

object SimpleRecursionExample{
    private var sumOfNums = 0
    private var factorial = 1
    fun addNumberRecursion1ToNRecursion(start: Int, limit: Int){
        // Base condition
        if (start>limit) {
            print("Total of 1 to $limit is = $sumOfNums")
            return
        }
        sumOfNums += start
        addNumberRecursion1ToNRecursion(start+1, limit)
    }

    fun factorialOfNumber(n: Int) {
        //Base condition
        if (n<2){
            print("Factorial of given number = $factorial")
            return
        }
        factorial *= n
        factorialOfNumber(n-1)
    }

    fun printFibboUpTo30Num(n: Int, a: Int=0, b: Int=1){
        // Base conditions
        if (a+b>30){
            return
        }
        if (a==0){
            print("$a $b")
        }
        val c = a+b
        print(" $c")
        printFibboUpTo30Num(n, b, c)
    }

    fun findNthFibboNumber(n: Int) : Int{
        if (n<2){
            return n
        }
        // Last step of recursion is called - Tail recursion
        return findNthFibboNumber(n-1)+ findNthFibboNumber(n-2)
    }
}