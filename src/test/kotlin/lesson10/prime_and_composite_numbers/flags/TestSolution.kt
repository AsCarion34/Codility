package lesson10.prime_and_composite_numbers.flags

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class TestSolution {
    @Test
    fun testCase() {
        val A = intArrayOf(1, 5, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2)
        Assertions.assertEquals(3, Solution().solution(A))
    }
}
