package lesson1.iterations.binarygap

import kotlin.math.*

class Solution {
    fun solution(N: Int): Int {
        var result = 0
        var gap = 0
        N.toString(2).toCharArray().forEach { c ->
            if(c == '1') {
                result = max(result, gap)
                gap = 0
            } else {
                gap++
            }
        }
        return result
    }
}

/* https://app.codility.com/demo/results/trainingUR3V4P-6CJ/ */
