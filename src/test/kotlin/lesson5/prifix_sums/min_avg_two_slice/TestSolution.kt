package lesson5.prifix_sums.min_avg_two_slice

import lesson5.prefix_sums.min_avg_two_slice.Solution
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class TestSolution {
    @Test
    fun testCase() {
        val A = intArrayOf(4, 2, 2, 5, 1, 5, 8)
        Assertions.assertEquals(1, Solution().solution(A))
    }
}
