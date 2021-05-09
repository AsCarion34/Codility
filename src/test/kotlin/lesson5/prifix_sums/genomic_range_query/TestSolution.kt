package lesson5.prifix_sums.genomic_range_query

import lesson5.prefix_sums.genomic_range_query.Solution
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class TestSolution {
    @Test
    fun testCase() {
        val S = "CAGCCTA"
        val P = intArrayOf(2, 5, 0)
        val Q = intArrayOf(4, 5, 6)
        Assertions.assertArrayEquals(intArrayOf(2, 4, 1), Solution().solution(S, P, Q))
    }
}
