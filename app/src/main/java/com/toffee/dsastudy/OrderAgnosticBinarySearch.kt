package com.toffee.dsastudy

fun main() {
    val list = listOf(2, 4, 5, 7, 8, 34, 67, 88, 98, 123)
    val dList = listOf(100, 90, 80, 70, 60, 50, 40, 30, 20, 10)
    val target = 5
    val bs = OrderAgnosticBinarySearch()
    val element = bs.bsInAnyOrder(list, target)
    print(element)
}

class OrderAgnosticBinarySearch {
    fun bsInAnyOrder(list: List<Int>, target: Int): Int {
        // check list sorted in which order
        val isAsc = list.first() < list.last()
        var start = 0
        var end = list.size - 1
        var mid = start + (end - start) / 2

        while (start <= end) {
            if (target == list[mid]) {
                return mid
            }
            if (target > list[mid]) {
                if (isAsc) start = mid + 1 else end = mid - 1

                mid = start + (end - start) / 2
            } else {
                if (isAsc) end = mid - 1 else start = mid + 1

                mid = start + (end - start) / 2
            }
        }
        return -1
    }
}