package lesson7.stacks_and_queues.stone_wall

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class TestSolution {
    @Test
    fun testCase() {
        val H = intArrayOf(8, 8, 5, 7, 9, 8, 7, 4, 8)
        Assertions.assertEquals(7, Solution().solution(H))
    }
}
