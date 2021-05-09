package lesson5.prifix_sums.passing_cars

import lesson5.prefix_sums.passing_cars.Solution
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class TestSolution {
    @Test
    fun testCase() {
        val A = intArrayOf(0, 1, 0, 1, 1)
        Assertions.assertEquals(5, Solution().solution(A))
    }
}
