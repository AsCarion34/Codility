package lesson4.counting_elements.missing_integer

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class TestSolution {
    @Test
    fun testCase01() {
        val A = intArrayOf(1, 3, 6, 4, 1, 2)
        Assertions.assertEquals(5, Solution().solution(A))
    }
    @Test
    fun testCase02() {
        val A = intArrayOf(1, 2, 3)
        Assertions.assertEquals(4, Solution().solution(A))
    }
    @Test
    fun testCase03() {
        val A = intArrayOf(-1, -3)
        Assertions.assertEquals(1, Solution().solution(A))
    }
    @Test
    fun testCase04() {
        val A = intArrayOf(2)
        Assertions.assertEquals(1, Solution().solution(A))
    }
}
