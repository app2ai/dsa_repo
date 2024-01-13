package com.toffee.dsastudy

fun main() {
    val list = listOf<Char>('A','C','F')
    val target = 'F'
    val result = StringBinarySearch()
    val ans = result.findCeilingCharacterWithWrapLogic(list, target)
    print(ans)
}

class StringBinarySearch {
    fun findCeilingCharacterWithWrapLogic(list:List<Char>, target: Char): Char{
        var start = 0
        var end = list.size -1
        var mid = start+(end-start)/2

        while(start<end){
                if (target>list[mid]){
                    start = mid+1
                } else {
                    end = mid-1
                }
        }
        return list[start % list.size]
    }
}