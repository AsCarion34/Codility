package lesson9.maximum_slice_problem.max_slice_sum

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class TestSolution {
    @Test
    fun testCase() {
        val A = intArrayOf(3, 2, -6, 4, 0)
        Assertions.assertEquals(5, Solution().solution(A))
    }
}
