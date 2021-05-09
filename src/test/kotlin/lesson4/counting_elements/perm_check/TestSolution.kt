package lesson4.counting_elements.perm_check

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class TestSolution {
    @Test
    fun testCase01() {
        val A = intArrayOf(4, 1, 3, 2)
        Assertions.assertEquals(1, Solution().solution(A))
    }
    @Test
    fun testCase02() {
        val A = intArrayOf(4, 1, 3)
        Assertions.assertEquals(0, Solution().solution(A))
    }
}
