package lesson8.leader.equileader

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class TestSolution {
    @Test
    fun testCase() {
        val A = intArrayOf(4, 3, 4, 4, 4, 2)
        Assertions.assertEquals(2, Solution().solution(A))
    }
    @Test
    fun testCase01() {
        val A = intArrayOf(0, 0)
        Assertions.assertEquals(1, Solution().solution(A))
    }
}
