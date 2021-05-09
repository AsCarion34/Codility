package lesson4.counting_elements.max_counters

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class TestSolution {
    @Test
    fun testCase() {
        val A = intArrayOf(3, 4, 4, 6, 1, 4, 4)
        val N = 5
        Assertions.assertArrayEquals(intArrayOf(3, 2, 2, 4, 2), Solution().solution(N, A))
    }
}
