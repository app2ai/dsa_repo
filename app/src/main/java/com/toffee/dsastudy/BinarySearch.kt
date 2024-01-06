package com.toffee.dsastudy

fun main() {
    val list = listOf(2,4,5,7,8,34,67,88,98,123)
    val target = 89
    val bs = BinarySearch()
    val indexOfTarget = bs.findElementBinarySearch(list, target)
    print(indexOfTarget)
}

class BinarySearch{
    fun findElementBinarySearch(list: List<Int>, target: Int): Int{
        var startIndex = 0
        var lastIndex = list.size-1
        var midIndex = (startIndex+lastIndex)/2

        while (startIndex<=lastIndex){
            if (target == list[midIndex]){
                return midIndex
            }
            if (target>list[midIndex]){
                startIndex = midIndex+1
                midIndex = (startIndex+lastIndex)/2
            } else {
                lastIndex = midIndex-1
                midIndex = (startIndex+lastIndex)/2
            }
        }
        return -1
    }

    // Ceiling of target number - [1,4,5,8,11,32,55,57,67,77,88], target = 66 or 67, ans = 67
    fun findSmallestNumberInArrayGreaterOrEqualToTarget(list: List<Int>, target: Int): Int{
        // Use binary search here
        var start = 0
        var end = list.size -1
        var mid = start+(end-start)/2

        while (start<=end){
            if (target == list[mid]){
                return list[mid]
            }
            if (target>list[mid]){
                start = mid+1
                mid = start+(end-start)/2
            } else {
                end = mid-1
                mid = start+(end-start)/2
            }
        }
        return list[start]
    }

    // Ceiling of target number - [1,4,5,8,11,32,55,57,67,77,88], target = 66, ans = 57
    fun findGreatestNumberInArraySmallerOrEqualToTarget(list: List<Int>, target: Int): Int{
        // Use binary search here
        var start = 0
        var end = list.size -1
        var mid = start+(end-start)/2

        while (start<=end){
            if (target == list[mid]){
                return list[mid]
            }
            if (target>list[mid]){
                start = mid+1
                mid = start+(end-start)/2
            } else {
                end = mid-1
                mid = start+(end-start)/2
            }
        }
        return list[end]
    }
}