package lesson3.time_complexity.tape_equilibrium

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class TestSolution {
    @Test
    fun testCase() {
        val A = intArrayOf(3, 1, 2, 4, 3)
        Assertions.assertEquals(1, Solution().solution(A))
    }

    @Test
    fun testCaseDouble() {
        val A = intArrayOf(2000, 4000)
        Assertions.assertEquals(2000, Solution().solution(A))
    }
}
