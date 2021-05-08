package lesson2.arrays.cycle_rotation

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class TestSolution {
    @Test
    fun testCase01() {
        val A = intArrayOf(3, 8, 9, 7, 6)
        val K = 3
        Assertions.assertArrayEquals(intArrayOf(9, 7, 6, 3, 8), Solution().solution(A, K))
    }

    @Test
    fun testCase02() {
        val A = intArrayOf(0, 0, 0)
        val K = 1
        Assertions.assertArrayEquals(intArrayOf(0, 0, 0), Solution().solution(A, K))
    }

    @Test
    fun testCase03() {
        val A = intArrayOf(1, 2, 3, 4)
        val K = 4
        Assertions.assertArrayEquals(intArrayOf(1, 2, 3, 4), Solution().solution(A, K))
    }
}
