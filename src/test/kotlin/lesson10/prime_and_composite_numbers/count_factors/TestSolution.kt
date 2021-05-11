package lesson10.prime_and_composite_numbers.count_factors

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class TestSolution {
    @Test
    fun testCase() {
        val N = 24
        Assertions.assertEquals(8, Solution().solution(N))
    }
    @Test
    fun testCase01() {
        val N = 2147483647
        Assertions.assertEquals(2, Solution().solution(N))
    }
}
