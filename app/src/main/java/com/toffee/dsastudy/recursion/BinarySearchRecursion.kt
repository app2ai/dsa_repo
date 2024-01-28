package com.toffee.dsastudy.recursion

fun main() {
    val myArr = arrayOf(1,2,4,6,8,9,14)
    val target = 9
    val result = BinarySearchRecursion.binarySearchUsingRecursion(first = 0, last = myArr.size-1, myArr, target)
    println("Index of $target in Array ${myArr.toList()} is $result")
}

object BinarySearchRecursion {
    // Args - first, last, arr | body params - mid | return type - index
    fun binarySearchUsingRecursion(first: Int, last: Int, arr: Array<Int>, target: Int): Int{
        // base conditions
        val mid = last-first/2
        if (arr[mid] == target) return mid
        if (first>last) return -1

        return if (arr[mid]>target){
            binarySearchUsingRecursion(first, mid-1, arr, target)
        } else {
            binarySearchUsingRecursion(mid+1, last, arr, target)
        }
    }
}