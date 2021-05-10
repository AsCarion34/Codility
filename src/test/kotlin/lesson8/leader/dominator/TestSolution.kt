package lesson8.leader.dominator

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class TestSolution {
    @Test
    fun testCase() {
        val A = intArrayOf(3, 4, 3, 2, 3, -1, 3, 3)
        Assertions.assertEquals(0, Solution().solution(A))
    }
    @Test
    fun testCase01() {
        val A = intArrayOf(2147483647)
        Assertions.assertEquals(0, Solution().solution(A))
    }
}
