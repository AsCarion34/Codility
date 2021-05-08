package lesson3.time_complexity.perm_missing_elem

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class TestSolution {
    @Test
    fun testCase() {
        val A = intArrayOf(2, 3, 1, 5)
        Assertions.assertEquals(4, Solution().solution(A))
    }
}
