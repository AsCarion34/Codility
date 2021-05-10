package lesson7.stacks_and_queues.brackets

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class TestSolution {
    @Test
    fun testCase01() {
        val S = "{[()()]}"
        Assertions.assertEquals(1, Solution().solution(S))
    }
    @Test
    fun testCase02() {
        val S = "([)()]"
        Assertions.assertEquals(0, Solution().solution(S))
    }
}
