package com.toffee.dsastudy

/*
Worst Case = O(n2)
Best Case = O(n)
*/

fun main() {
    InsertionSort.sort(arrayOf(1,-3,3,1,-5))
}
object InsertionSort {
    fun sort(arr: Array<Int>){
        val n = arr.size
        for (i in 1 until n) {
            val key = arr[i]
            var j = i - 1
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j]
                j--
            }
            arr[j + 1] = key
        }
        print(arr.toList())
    }
}
