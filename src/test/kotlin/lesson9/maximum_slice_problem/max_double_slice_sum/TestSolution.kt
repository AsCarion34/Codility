package lesson9.maximum_slice_problem.max_double_slice_sum

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class TestSolution {
    @Test
    fun testCase() {
        val A = intArrayOf(3, 2, 6, -1, 4, 5, -1, 2)
        Assertions.assertEquals(17, Solution().solution(A))
    }
    @Test
    fun testCase01() {
        val A = intArrayOf(5, 17, 0, 3)
        Assertions.assertEquals(17, Solution().solution(A))
    }
}
