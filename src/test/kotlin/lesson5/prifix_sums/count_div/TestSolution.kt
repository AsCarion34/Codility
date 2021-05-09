package lesson5.prifix_sums.count_div

import lesson5.prefix_sums.count_div.Solution
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class TestSolution {
    @Test
    fun testCase() {
        val A = 6
        val B = 11
        val K = 2
        Assertions.assertEquals(3, Solution().solution(A, B, K))
    }
}
