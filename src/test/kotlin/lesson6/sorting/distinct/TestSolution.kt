package lesson6.sorting.distinct

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class TestSolution {
    @Test
    fun testCase() {
        val A = intArrayOf(2, 1, 1, 2, 3, 1)
        assertEquals(3, Solution().solution(A))
    }
    @Test
    fun testCase01() {
        val A = intArrayOf()
        assertEquals(0, Solution().solution(A))
    }
}
