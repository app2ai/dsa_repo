package com.toffee.dsastudy

fun main() {
    val arr = mutableListOf<Int>(4,5,2,3,1)
    // CycleSort.sort(arr)

    // findMissingNumberFromAnContinueArray it its continue then return last index->
    val arr2 = mutableListOf<Int>(0,1,5,4)
    // val missingValue = CycleSort.findMissingNumberFromAnArray(arr2)
    // println("In the given array ${arr2.toList()} missingValue is $missingValue")

    // find all element missing from the 1 to n
    val list3 = mutableListOf<Int>(4,1,6,2,8,1,3,6) // [5, 7]
    // val allMissingValues = CycleSort.findAllMissingNumbersFromAnArray(list3)
    // println("From list $list3 All missing numbers are $allMissingValues")

    // find duplicate number
    val list4 = mutableListOf<Int>(4,1,6,2,8,1,3,6) // [1, 6]
    // val allDuplicateValues = CycleSort.findAllTheDuplicateNumbersFromAnArray(list4)
    // println("From list $list4 All duplicate numbers are $allDuplicateValues")

    // find mismatch numbers -> ex [1,2,2,4] -> [2,3] & [1,1] ->[2]
    val list5 = mutableListOf<Int>(1,2,2,4,4,6) // [2, 3]
    val allMismatchedNumber = CycleSort.findAllMismatchedNumbersFromAnArray(list5)
    println("From list $list5 All mismatched numbers are $allMismatchedNumber")
}

object CycleSort {
    fun sort(arr: MutableList<Int>){
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

    fun findMissingNumberFromAnArray(arr: MutableList<Int>): Int{
        var key = 0
        while (key<arr.size){
            val indexOfKeyThValue = arr[key]
            if (arr[key] < arr.size && arr[key] != arr[indexOfKeyThValue]){
                swap(arr, key, indexOfKeyThValue)
            } else {
                key++
            }
        }

        // search for firrst missing number
        for (i in arr.indices){
            if (arr[i] != i){
                return i
            }
        }
        return arr.size
    }

    // 1..n
    fun findAllMissingNumbersFromAnArray(arr: MutableList<Int>) : MutableList<Int>{
        var key = 0
        while (key< arr.size){
            val indexOfKeyThValue = arr[key]-1
            if (arr[key] != arr[indexOfKeyThValue]){
                swap(arr, key, indexOfKeyThValue)
            } else {
                key++
            }
        }
        val missingNums = mutableListOf<Int>()
        for (i in 0..<arr.size){
            if (arr[i] != (i+1)){
                missingNums.add(i+1)
            }
        }
        return missingNums
    }

    // 1..n
    fun findAllTheDuplicateNumbersFromAnArray(arr: MutableList<Int>) : MutableList<Int>{
        var key = 0
        while (key<arr.size){
            var indexOfKeyThValue = arr[key]-1
            if (arr[key] != arr[indexOfKeyThValue]){
                swap(arr, key, indexOfKeyThValue)
            }else{
                key++
            }
        }
        val dupArr = mutableListOf<Int>()
        for (i in 0..<arr.size){
            if (arr[i] != i+1){
                dupArr.add(arr[i])
            }
        }
        return dupArr
    }

    fun findAllMismatchedNumbersFromAnArray(arr: MutableList<Int>): MutableSet<Int>{
        val ll = mutableSetOf<Int>()
        for (i in 0..<arr.size){
            if (arr[i] != i+1){
                ll.add((arr[i]))
                ll.add(i+1)
            }
        }
        return ll
    }

    private fun swap(arr: MutableList<Int>, key: Int, indexOfKeyThValue: Int) {
        val temp = arr[indexOfKeyThValue]
        arr[indexOfKeyThValue] = arr[key]
        arr[key] = temp
    }
}
