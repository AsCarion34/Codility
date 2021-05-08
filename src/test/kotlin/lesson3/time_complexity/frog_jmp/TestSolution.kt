package lesson3.time_complexity.frog_jmp

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class TestSolution {
    @Test
    fun testCase() {
        val X = 10
        val Y = 85
        val D = 30

        Assertions.assertEquals(3, Solution().solution(X, Y, D))
    }
}
