package lesson6.sorting.number_of_disc_intersections

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class TestSolution {
    @Test
    fun testCase() {
        val A = intArrayOf(1, 5, 2, 1, 4, 0)
        Assertions.assertEquals(11, Solution().solution(A))
    }
    @Test
    fun testCase01() {
        val A = intArrayOf(1, 2147483647, 0)
        Assertions.assertEquals(2, Solution().solution(A))
    }
}
