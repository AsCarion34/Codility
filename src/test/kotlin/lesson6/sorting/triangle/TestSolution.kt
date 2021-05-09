package lesson6.sorting.triangle

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class TestSolution {
    @Test
    fun testCase01() {
        val A = intArrayOf(10, 2, 5, 1, 8, 20)
        Assertions.assertEquals(1, Solution().solution(A))
    }
    @Test
    fun testCase02() {
        val A = intArrayOf(10, 50, 5, 1)
        Assertions.assertEquals(0, Solution().solution(A))
    }
}
