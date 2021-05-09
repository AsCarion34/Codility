package lesson4.counting_elements.frog_river_one

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class TestSolution {
    @Test
    fun testCase() {
        val A = intArrayOf(1, 3, 1, 4, 2, 3, 5, 4)
        Assertions.assertEquals(6, Solution().solution(5, A))
    }
    @Test
    fun testCase01() {
        val A = intArrayOf(2, 2, 2, 2, 2)
        Assertions.assertEquals(-1, Solution().solution(2, A))
    }
    @Test
    fun testCase02() {
        val A = intArrayOf(1, 3, 1, 3, 2, 1, 3)
        Assertions.assertEquals(4, Solution().solution(3, A))
    }
}
