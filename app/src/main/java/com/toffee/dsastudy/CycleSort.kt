package com.toffee.dsastudy

fun main() {
    val arr = arrayOf(4,5,2,3,1)
    CycleSort.sort(arr)

    // findMissingNumberFromAnArray ->
}

object CycleSort {
    fun sort(arr: Array<Int>){
        var key = 0
        while (key < arr.size){
            // value = index-1
            val indexOfKeyThValue = arr[key]-1
            if (arr[key] != arr[indexOfKeyThValue]){
                val temp = arr[key]
                arr[key] = arr[indexOfKeyThValue]
                arr[indexOfKeyThValue] = temp
            } else {
                key++
            }
        }
        print(arr.toList())
    }

    fun findMissingNumberFromAnArray(arr: Array<Int>){

    }
}