package com.toffee.dsastudy

import kotlin.math.roundToLong

fun main() {
    // 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377
    val n = 14
    val result = FibbonacciSeriesByGoldenRatio.findNthFibboNumber(n)
    println("Fibbo of $n is $result")
}

object FibbonacciSeriesByGoldenRatio {
    fun findNthFibboNumber(n: Int): Long{
        // Using quadratic equs
        return (Math.pow(((1 + Math.sqrt(5.0)) / 2.0), n.toDouble()) / Math.sqrt(5.0)).roundToLong()
    }
}