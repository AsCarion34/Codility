package lesson9.maximum_slice_problem.max_profit

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class TestSolution {
    @Test
    fun testCase() {
        val A = intArrayOf(23171, 21011, 21123, 21366, 21013, 21367)
        Assertions.assertEquals(356, Solution().solution(A))
    }
}
