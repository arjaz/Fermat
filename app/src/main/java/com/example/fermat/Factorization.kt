package com.example.fermat

import kotlin.math.sqrt
import kotlin.math.ceil
import kotlin.math.floor

fun factorize(value: Int): Pair<Int, Int> {
    val x = getX(ceilSqrt(value), value)
    val y = sqrt((value + x * x).toDouble()).toInt()
    return Pair(x + y, y - x)
}

private fun getX(value: Int, a: Int) = generateSequence(0) {
    it + 1
}.map {
    getNextX(value, a, it)
}.filter {
    ceilSqrt(it) == floorSqrt(it)
}.map {
    ceilSqrt(it)
}.first()

private fun getNextX(x: Int, a: Int, acc: Int = 0) = (x + acc) * (x + acc) - a

private fun ceilSqrt(x: Int): Int = ceil(sqrt(x.toDouble())).toInt()

private fun floorSqrt(x: Int): Int = floor(sqrt(x.toDouble())).toInt()
