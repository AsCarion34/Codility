package lesson2.arrays.odd_occurrences_in_array

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class TestSolution {
    @Test
    fun testCase() {
        val A = intArrayOf(9, 3, 9, 3, 9, 7, 9)
        Assertions.assertEquals(7, Solution().solution(A))
    }
}
