package lesson7.stacks_and_queues.fish

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class TestSolution {
    @Test
    fun testCase() {
        val A = intArrayOf(4, 3, 2, 1, 5)
        val B = intArrayOf(0, 1, 0, 0, 0)
        Assertions.assertEquals(2, Solution().solution(A, B))
    }
}
